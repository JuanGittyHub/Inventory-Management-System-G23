/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycput.projectg23.ims.model;

/**
 *
 * @author Juan
 */



public class Product {
    private String productName;
    private double productPrice;
    private int quantity;
    private int productNumber;
    private String requestStatus;

    public Product(String productName, double productPrice, int quantity, int productNumber, String requestStatus) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.quantity = quantity;
        this.productNumber = productNumber;
        this.requestStatus = requestStatus;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(int productNumber) {
        this.productNumber = productNumber;
    }

    public String getRequestStatus() {
        return requestStatus;
    }

    public void setRequestStatus(String requestStatus) {
        this.requestStatus = requestStatus;
    }

    @Override
    public String toString() {
        return "Product{" + "productName=" + productName + ", productPrice=" + productPrice + ", quantity=" + quantity + ", productNumber=" + productNumber + ", requestStatus=" + requestStatus + '}';
    }

    
}
