package vn.com.quyenbeo.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.index.TextIndexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

/**
 * A Order.
 */
@Document(collection = "order")
public class Order implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    private String id;

    @NotNull
    @Field("customer_id")
    private String customerId;

    @NotNull
    @Field("customer_name")
    @TextIndexed
    private String customerName;

    @NotNull
    @Field("shipping_detail")
    private String shippingDetail;

    @NotNull
    @Field("product_name")
    @TextIndexed
    private String productName;

    @NotNull
    @Field("product_detail")
    private String productDetail;

    @NotNull
    @Field("product_size")
    private Integer productSize;

    @NotNull
    @Field("product_price")
    private Integer productPrice;

    @NotNull
    @Field("money_paid")
    private Integer moneyPaid;

    @Field("status")
    private Integer status;

    @Field("note")
    private String note;

    @JsonIgnore
    private boolean delFlag;

    @CreatedDate
    @Field("created_date")
    private Instant createdDate = Instant.now();

    @LastModifiedDate
    @Field("last_modified_date")
    private Instant lastModifiedDate = Instant.now();

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCustomerId() {
        return customerId;
    }

    public Order customerId(String customerId) {
        this.customerId = customerId;
        return this;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public Order customerName(String customerName) {
        this.customerName = customerName;
        return this;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getShippingDetail() {
        return shippingDetail;
    }

    public Order shippingDetail(String shippingDetail) {
        this.shippingDetail = shippingDetail;
        return this;
    }

    public void setShippingDetail(String shippingDetail) {
        this.shippingDetail = shippingDetail;
    }

    public String getProductName() {
        return productName;
    }

    public Order productName(String productName) {
        this.productName = productName;
        return this;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDetail() {
        return productDetail;
    }

    public Order productDetail(String productDetail) {
        this.productDetail = productDetail;
        return this;
    }

    public void setProductDetail(String productDetail) {
        this.productDetail = productDetail;
    }

    public Integer getProductSize() {
        return productSize;
    }

    public Order productSize(Integer productSize) {
        this.productSize = productSize;
        return this;
    }

    public void setProductSize(Integer productSize) {
        this.productSize = productSize;
    }

    public Integer getProductPrice() {
        return productPrice;
    }

    public Order productPrice(Integer productPrice) {
        this.productPrice = productPrice;
        return this;
    }

    public void setProductPrice(Integer productPrice) {
        this.productPrice = productPrice;
    }

    public Integer getMoneyPaid() {
        return moneyPaid;
    }

    public Order moneyPaid(Integer moneyPaid) {
        this.moneyPaid = moneyPaid;
        return this;
    }

    public void setMoneyPaid(Integer moneyPaid) {
        this.moneyPaid = moneyPaid;
    }

    public Integer getStatus() {
        return status;
    }

    public Order status(Integer status) {
        this.status = status;
        return this;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getNote() {
        return note;
    }

    public Order note(String note) {
        this.note = note;
        return this;
    }

    public boolean getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(boolean delFlag) {
        this.delFlag = delFlag;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Instant getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Instant createdDate) {
        this.createdDate = createdDate;
    }

    public Instant getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Instant lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Order order = (Order) o;
        if (order.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), order.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "Order{" +
            "id=" + getId() +
            ", customerId='" + getCustomerId() + "'" +
            ", customerName='" + getCustomerName() + "'" +
            ", shippingDetail='" + getShippingDetail() + "'" +
            ", productName='" + getProductName() + "'" +
            ", productDetail='" + getProductDetail() + "'" +
            ", productSize='" + getProductSize() + "'" +
            ", productPrice='" + getProductPrice() + "'" +
            ", moneyPaid='" + getMoneyPaid() + "'" +
            ", status='" + getStatus() + "'" +
            ", note='" + getNote() + "'" +
            "}";
    }
}
