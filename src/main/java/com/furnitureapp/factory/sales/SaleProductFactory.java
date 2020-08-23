/*
    Coder: Elvis Gene
    Date: 05-07-2020
    Description: This class is used to instantiate Product items belonging to a specific sale.
 */

package com.furnitureapp.factory.sales;

import com.furnitureapp.entity.sales.SaleProduct;
import com.furnitureapp.utility.Helper;

public class SaleProductFactory {

    public static SaleProduct createSaleProduct(Long prodCode, int quantity){
        Long saleCode = Helper.generateCode();

        return new SaleProduct.Builder()
                .setSaleCode(saleCode)
                .setProdCode(prodCode)
                .setQuantity(quantity)
                .build();
    }
}