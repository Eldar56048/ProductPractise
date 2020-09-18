package com.company;

import java.util.ArrayList;
import java.util.List;

public class PcCriteriaType implements CriteriaType {
    @Override
    public List<Product> TypeCriteria(List<Product> products) {
        List<Product> pcs = new ArrayList<Product>();

        for(Product product : products){
            if(product.getType().toString().equalsIgnoreCase("PC")){
                pcs.add(product);
            }
        }
        return pcs;
    }
}
