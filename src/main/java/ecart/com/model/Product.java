package ecart.com.model;

import jakarta.persistence.*;

@Entity
@Table(name = "products")
public class Product {


 @Override
 public String toString() {
  return "Product{" +
          "prodId=" + prodId +
          ", prodName='" + prodName + '\'' +
          ", prodDesc='" + prodDesc + '\'' +
          ", prodPrice=" + prodPrice +
          ", status='" + status + '\'' +
          ", catId=" + catId +
          '}';
 }

 public Product(int prodId, String prodName, String prodDesc, double prodPrice, String status, int catId) {
  this.prodId = prodId;
  this.prodName = prodName;
  this.prodDesc = prodDesc;
  this.prodPrice = prodPrice;
  this.status = status;
  this.catId = catId;
 }

 @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
     private int prodId;
     private String prodName;
     private String prodDesc;
     private double prodPrice;
     private String status;
     private  int catId;

 public int getProdId() {
  return prodId;
 }

 public void setProdId(int prodId) {
  this.prodId = prodId;
 }

 public String getProdName() {
  return prodName;
 }

 public void setProdName(String prodName) {
  this.prodName = prodName;
 }

 public String getProdDesc() {
  return prodDesc;
 }

 public void setProdDesc(String prodDesc) {
  this.prodDesc = prodDesc;
 }

 public double getProdPrice() {
  return prodPrice;
 }

 public void setProdPrice(double prodPrice) {
  this.prodPrice = prodPrice;
 }

 public String getStatus() {
  return status;
 }

 public void setStatus(String status) {
  this.status = status;
 }

 public int getCatId() {
  return catId;
 }

 public void setCatId(int catId) {
  this.catId = catId;
 }
}
