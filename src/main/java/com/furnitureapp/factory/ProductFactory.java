package com.furnitureapp.factory;

/**
 * @author @Siba182
 * Description: Factory for Product entity
 */

import com.furnitureapp.entity.Product;
import com.furnitureapp.entity.ProductCategory;
import com.furnitureapp.utility.Helper;


public class ProductFactory {

    public static Product createProduct(String name, double price, float length, float width, float weight, String description, ProductCategory category){

        Product product = new Product.ProductBuilder()
                .setProductCode(Helper.generateCode())
                .setName(name)
                .setPrice(price)
                .setLength(length)
                .setWidth(width)
                .setWeight(weight)
                .setDescription(description)
                .setCategory(category)
                .build();
        return product;

    }
}