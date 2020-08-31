package com.test.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "users")
public class User {

    @Id
    private Long id;

    private String name;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
    private List<UserProduct> userProducts;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<UserProduct> getUserProducts() {
        return userProducts;
    }

    public void setUserProducts(List<UserProduct> userProducts) {
        this.userProducts = userProducts;
    }
}
