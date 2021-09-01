/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycput.projectg23.ims.repository;

import com.mycput.projectg23.ims.model.Product;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Juan
 */
public class ProductRepository {
    
    final String ERROR = "Error";
    final String SUCCESS = "Success";
    ArrayList<Product> products = new ArrayList<>();
    Product productObject;
    
    // methods from a dummy project i created must using prepared statements still need to change or make new methods for main program
    
    public Product save(Product product) throws SQLException{
        String insertSQL = "INSERT INTO product (product_number, product_name, product_price, quantity)" + "VALUES (?, ?, ?, ?)";
        PreparedStatement ps = this.con.prepareStatement(insertSQL);
        ps.setInt(1, product.getProductNumber());
        ps.setString(2, product.getProductName());
        ps.setInt(3, product.getProductPrice());
        ps.setInt(4, product.getQuantity());
        
        ps.executeUpdate();
        ps.close();
        return product;
    }
    
    // get all products from the database old method using prepared statement
    
    public List<Product> getAll() throws SQLException{
        String getAll_SQL = "SELECT * FROM product";
        List<Product> products = new ArrayList<>();
        PreparedStatement ps = this.con.prepareStatement(getAll_SQL);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            int productNumber = rs.getInt("product_number");
            String productName = rs.getString("product_name");
            int productPrice = rs.getInt("product_price");
            int quantity = rs.getInt("quantity");
            Product product = new Product(productNumber, productName, productPrice, quantity);
            products.add(product);
        }
        rs.close();
        ps.close();
        return products;
    }
    
    public void closeResources() throws SQLException{
        //this.statement.close();
        this.con.close();    
    }

    
    // new method to save or create product
    
    public Product addProduct (Product product){
       if(doesProductExist(product.getProductNumber()))
        {
            productObject.setRequestStatus(ERROR);
        }else
        {
            products.add(product);
            productObject.setRequestStatus(SUCCESS);
        }
        return productObject;
    }
    
     private boolean doesProductExist(Product product)
    {
        boolean doesProductExist = false;
        for (Product _product : products)
        {
            if(_product.getProductNumber().equals(product.getProductNumber()))
            {
                doesProductExist = true;
                break;
            }
        }
        return doesProductExist;
    }
            
}
