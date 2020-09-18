package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Samsung S9",180000.0,Color.RED,Type.smartphone,2012));
        products.add(new Product("Dell XPS 13",500000.0,Color.BLACK,Type.Laptop,2018));
        products.add(new Product("HP PC",1500000.0,Color.BLUE,Type.pc,2020));

        CriteriaType smartphone = new SmartphoneCriteriaType();
        CriteriaType pc = new PcCriteriaType();
        CriteriaType laptop = new LaptopCriteriaType();
        CriteriaType LaptopOrPc = new OrCriteriaType(laptop,pc);

        System.out.println("Smartphones: ");
        printProducts(smartphone.TypeCriteria(products));
        System.out.println("Laptop: ");
        printProducts(laptop.TypeCriteria(products));
        System.out.println("PC: ");
        printProducts(pc.TypeCriteria(products));
        System.out.println("Laptop or PC: ");
        printProducts(LaptopOrPc.TypeCriteria(products));
        



    }
    public static void printProducts(List<Product> products){
        for (Product product : products) {
            System.out.println("Product : [ Name : " + product.getName() + ", Price : " + product.getPrice() + ", Color : " + product.getColor().toString()
                    +" , Type: "+product.getType().toString()+" , Year: "+product.getYear()+ " ]");
        }
    }
}
