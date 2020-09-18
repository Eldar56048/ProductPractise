package com.company;

import java.util.ArrayList;
import java.util.List;

public class LaptopCriteriaType implements CriteriaType {
    @Override
    public List<Product> TypeCriteria(List<Product> products) {
        List<Product> laptops = new ArrayList<Product>();

        for(Product product : products){
            if(product.getType().toString().equalsIgnoreCase("Laptop")){
                laptops.add(product);
            }
        }
        return laptops;
    }
}
