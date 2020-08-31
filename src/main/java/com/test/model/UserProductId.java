package com.test.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class UserProductId implements Serializable {

    @Column(name = "user_id", nullable = false)
    private Long userId;

    @Column(name = "product_id", nullable = false)
    private Long productId;

    public UserProductId(Long userId, Long productId) {
        this.userId = userId;
        this.productId = productId;
    }

    public UserProductId() {
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserProductId that = (UserProductId) o;

        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;
        return productId != null ? productId.equals(that.productId) : that.productId == null;
    }

    @Override
    public int hashCode() {
        int result = userId != null ? userId.hashCode() : 0;
        result = 31 * result + (productId != null ? productId.hashCode() : 0);
        return result;
    }
}
