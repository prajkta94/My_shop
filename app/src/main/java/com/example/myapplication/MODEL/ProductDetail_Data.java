package com.example.myapplication.MODEL;

public class ProductDetail_Data {
   String Product_Name,Product_Image,Product_Status,Product_Mrp,Product_Discount,ProductPiece;

   public ProductDetail_Data(String product_Name, String product_Image, String product_Status, String product_Mrp, String product_Discount, String product_Piece) {
      Product_Name = product_Name;
      Product_Image = product_Image;
      Product_Status = product_Status;
      Product_Mrp = product_Mrp;
      Product_Discount = product_Discount;
      ProductPiece = product_Piece;
   }

   public String getProduct_Name() {
      return Product_Name;
   }

   public void setProduct_Name(String product_Name) {
      Product_Name = product_Name;
   }

   public String getProduct_Image() {
      return Product_Image;
   }

   public void setProduct_Image(String product_Image) {
      Product_Image = product_Image;
   }

   public String getProduct_Status() {
      return Product_Status;
   }

   public void setProduct_Status(String product_Status) {
      Product_Status = product_Status;
   }

   public String getProduct_Mrp() {
      return Product_Mrp;
   }

   public void setProduct_Mrp(String product_Mrp) {
      Product_Mrp = product_Mrp;
   }

   public String getProduct_Discount() {
      return Product_Discount;
   }

   public void setProduct_Discount(String product_Discount) {
      Product_Discount = product_Discount;
   }

   public String getProductPiece() {
      return ProductPiece;
   }

   public void setProductPiece(String productPiece) {
      ProductPiece = productPiece;
   }
}
