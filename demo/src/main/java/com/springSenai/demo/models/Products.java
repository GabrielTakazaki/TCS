package com.springSenai.demo.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "products")

public class Products {
    @Id
    String id;
    String prodName;
    String prodDesc;
    Double prodPrice;
    String prodImage;
    
    public Products() {

    }
    public Products(String id, String prodName, String prodDesc, Double prodPrice, String prodImage) {
        this.id = id;
        this.prodName = prodName;
        this.prodDesc = prodDesc;
        this.prodPrice = prodPrice;
        this.prodImage = prodImage;
    }
    public String getId(){
        return id;
    }
    public String getProdName() {
        return prodName;
    }
    public String getProdDesc() {
        return prodDesc;
    }
    public Double getProdPrice() {
        return prodPrice;
    }
    public String getProdImage() {
        return prodImage;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    public void setProdName(String prodName) {
        this.prodName = prodName;
    }
    public void setProdDesc(String prodDesc) {
        this.prodDesc = prodDesc;
    }
    public void setProdPrice(Double prodPrice) {
        this.prodPrice = prodPrice;
    }
    public void setProdImage(String prodImage) {
        this.prodImage = prodImage;
    }
}