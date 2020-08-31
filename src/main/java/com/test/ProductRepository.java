package com.test;

import com.test.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    @Query(value = "select * from product " +
            "left join user_product up on product.id = up.product_id and up.user_id = :userId", nativeQuery = true)
    List<Product> getProducts(@Param("userId") Long userId);
}
