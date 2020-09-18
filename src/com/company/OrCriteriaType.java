package com.company;

import java.util.List;

public class OrCriteriaType implements CriteriaType {

    private CriteriaType criteria;
    private CriteriaType otherCriteria;

    public OrCriteriaType(CriteriaType criteria, CriteriaType otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Product> TypeCriteria(List<Product> products) {
        List<Product> firstCriteriaItems = criteria.TypeCriteria(products);
        List<Product> otherCriteriaItems = otherCriteria.TypeCriteria(products);

        for (Product product : otherCriteriaItems) {
            if(!firstCriteriaItems.contains(product)){
                firstCriteriaItems.add(product);
            }
        }
        return firstCriteriaItems;
    }
}
