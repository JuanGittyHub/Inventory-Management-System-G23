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
public class IProductRepository {
    public interface IUserRepository {
    Product addProduct(Product user);
    ArrayList<Product> getProducts();
}
    
}
