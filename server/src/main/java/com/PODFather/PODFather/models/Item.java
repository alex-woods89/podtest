package com.PODFather.PODFather.models;

import javax.persistence.*;

@Entity
@Table(name="items")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="customer")
    private String customer;

    @Column(name="site")
    private String site;

    @Column(name="Year")
    private int year;

    @Column(name="month")
    private int month;

    @Column(name="waste_type")
    private String wasteType;

    @Column(name="estimated_quantity")
    private int estimatedQuantity;

    @Column(name="actual_quantity")
    private int actualQuantity;

    public Item(String customer, String site, int year, int month, String wasteType, int estimatedQuantity, int actualQuantity) {
        this.customer = customer;
        this.site = site;
        this.year = year;
        this.month = month;
        this.wasteType = wasteType;
        this.estimatedQuantity = estimatedQuantity;
        this.actualQuantity = actualQuantity;
    }

    public Item() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public String getWasteType() {
        return wasteType;
    }

    public void setWasteType(String wasteType) {
        this.wasteType = wasteType;
    }

    public int getEstimatedQuantity() {
        return estimatedQuantity;
    }

    public void setEstimatedQuantity(int estimatedQuantity) {
        this.estimatedQuantity = estimatedQuantity;
    }

    public int getActualQuantity() {
        return actualQuantity;
    }

    public void setActualQuantity(int actualQuantity) {
        this.actualQuantity = actualQuantity;
    }
}
