/*
    Coder: Elvis Gene
    Description: Tests of the SaleProductFactory class methods
 */

package com.furnitureapp.factory;

import com.furnitureapp.entity.SaleProduct;
import org.junit.Assert;
import org.junit.Test;

public class SaleProductFactoryTest {

    @Test
    public void createSaleProduct(){
        SaleProduct saleProduct = SaleProductFactory.createSaleProduct(7, 3);

        Assert.assertNotNull(saleProduct);
    }
}