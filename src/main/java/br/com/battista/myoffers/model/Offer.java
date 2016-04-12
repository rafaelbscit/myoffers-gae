package br.com.battista.myoffers.model;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Index;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@XmlRootElement
@Entity
public class Offer extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private Long id;
    @Index
    @NotNull
    @Size(min = 5, max = 50)
    private String name;
    @Index
    @NotNull
    private String category;
    @Index
    @NotNull
    private String vendor;
    private Double price;
    private String brand;

    @NotNull
    @Index
    private Long codeProduct;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Offer id(Long id) {
        this.id = id;
        return this;
    }

    public Offer name(String name) {
        this.name = name;
        return this;
    }

    public Offer category(String category) {
        this.category = category;
        return this;
    }

    public Offer vendor(String vendor) {
        this.vendor = vendor;
        return this;
    }

    public Offer price(Double price) {
        this.price = price;
        return this;
    }

    public Offer brand(String brand) {
        this.brand = brand;
        return this;
    }

    public Long getCodeProduct() {
        return codeProduct;
    }

    public void setCodeProduct(Long codeProduct) {
        this.codeProduct = codeProduct;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Offer)) return false;
        Offer offer = (Offer) o;
        return Objects.equal(getCodeProduct(), offer.getCodeProduct());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getCodeProduct());
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("id", id)
                .add("name", name)
                .add("category", category)
                .add("vendor", vendor)
                .add("price", price)
                .add("brand", brand)
                .add("codeProduct", codeProduct)
                .toString();
    }

    @Override
    public Object getPk() {
        return getId();
    }

    public Offer codeProduct(Long codeProduct) {
        this.codeProduct = codeProduct;
        return this;
    }
}
