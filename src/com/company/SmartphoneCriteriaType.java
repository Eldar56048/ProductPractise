package com.company;

import java.util.ArrayList;
import java.util.List;

public class SmartphoneCriteriaType implements CriteriaType {
    @Override
    public List<Product> TypeCriteria(List<Product> products) {
        List<Product> smartphones = new ArrayList<Product>();
        for(Product product : products){
            if(product.getType().toString().equalsIgnoreCase("smartphone")){
                smartphones.add(product);
            }
        }
        return smartphones;
    }
}
