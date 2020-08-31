package com.test.model;

import javax.persistence.*;

@Entity
public class UserProduct {

    @EmbeddedId
    private UserProductId id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", referencedColumnName = "id", insertable = false, updatable = false)
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id", referencedColumnName = "id", insertable = false, updatable = false)
    private Product product;

    public UserProduct(UserProductId id) {
        this.id = id;
    }

    public UserProduct() {
    }

    public UserProductId getId() {
        return id;
    }

    public void setId(UserProductId id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
