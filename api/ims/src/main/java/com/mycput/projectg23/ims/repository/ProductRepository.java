/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycput.projectg23.ims.repository;

import com.mycput.projectg23.ims.model.Product;
import java.util.ArrayList;

/**
 *
 * @author Juan
 */
public class ProductRepository {
    
    final String ERROR = "Error";
    final String SUCCESS = "Success";
    ArrayList<Product> products = new ArrayList<>();
    Product productObject;
    
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
