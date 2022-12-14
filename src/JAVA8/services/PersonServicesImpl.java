package JAVA8.services;

import JAVA8.classes.Market;
import JAVA8.classes.Person;
import JAVA8.products.*;

import java.util.ArrayList;
import java.util.List;

public class PersonServicesImpl {
    List<Products>products = new ArrayList<>();
    List<Integer>productSkid = new ArrayList<>();

    public String createProductsChill(String product, List<ChildrenFood>products, Person person, Market market ){
        for (ChildrenFood product1 : products) {
            if(product1.getName().equals(product)){
                if(product1.getPrice()<=person.getBancAccount()){
                    this.products.add(product1);
                    this.productSkid.add(product1.getSkidka());
                    market.setPrice(market.getPrice()+product1.getSkidka());
                    person.setBancAccount(person.getBancAccount()-product1.getSkidka());
                    return "ВЫ ОТПРАВИЛИ В КОРЗИНУ ЭТОТ ТОВАР";
                }
            }
        }
        return "ТАКОЙ ТОВАР ЕСТЬ";
    }
    public String createProductsBaker(String product, List<BakeryProducts>products, Person person, Market market ){
        for (Products product1 : products) {
            if(product1.getName().equals(product)){
                if(product1.getPrice()<=person.getBancAccount()){
                    this.products.add(product1);
                    this.productSkid.add(product1.getPrice());
                    market.setPrice(market.getPrice()+product1.getPrice());
                    person.setBancAccount(person.getBancAccount()-product1.getPrice());
                    return "ВЫ ОТПРАВИЛИ В КОРЗИНУ ЭТОТ ТОВАР";
                }
            }
        }
        return "ТАКОЙ ТОВАР ЕСТЬ";
    }

    public String createProductsSeaFood(String product, List<Seafood>products, Person person, Market market ){
        for (Seafood product1 : products) {
            if(product1.getName().equals(product)){
                if(product1.getPrice()<=person.getBancAccount()){
                    this.products.add(product1);
                    market.setPrice(market.getPrice()+product1.getSkidka());
                    this.productSkid.add(product1.getSkidka());
                    person.setBancAccount(person.getBancAccount()-product1.getSkidka());
                    return "ВЫ ОТПРАВИЛИ В КОРЗИНУ ЭТОТ ТОВАР";
                }else {
                    return "У ВАС НЕ ДОСТАТОЧНО ДЕНЕГ";
                }
            }
        }
        return "ТАКОЙ ТОВАР НЕТ";
    }
    public String createProductsSportFood(String product, List<SportFood>products, Person person, Market market ){
        for (Products product1 : products) {
            if(product1.getName().equals(product)){
                if(product1.getPrice()<=person.getBancAccount()){
                    this.products.add(product1);
                    this.productSkid.add(product1.getPrice());
                    market.setPrice(market.getPrice()+product1.getPrice());
                    person.setBancAccount(person.getBancAccount()-product1.getPrice());
                    return "ВЫ ОТПРАВИЛИ В КОРЗИНУ ЭТОТ ТОВАР";
                }else {
                    return "У ВАС НЕ ДОСТАТОЧНО ДЕНЕГ";
                }
            }
        }
        return "ТАКОЙ ТОВАР ЕСТЬ";
    }

    public String createProductsVegetrian(String product, List<Vegetables>products, Person person, Market market ){
        for (Products product1 : products) {
            if(product1.getName().equals(product)){
                if(product1.getPrice()<=person.getBancAccount()){
                    this.products.add(product1);
                    this.productSkid.add(product1.getPrice());
                    market.setPrice(market.getPrice()+product1.getPrice());
                    person.setBancAccount(person.getBancAccount()-product1.getPrice());
                    return "ВЫ ОТПРАВИЛИ В КОРЗИНУ ЭТОТ ТОВАР";
                }else {
                    return "У ВАС НЕ ДОСТАТОЧНО ДЕНЕГ";
                }
            }
        }
        return "ТАКОЙ ТОВАР ЕСТЬ";
    }
    public List<Products>getMyProducts(){
        return this.products;
    }
    public void check(Market market,Person person){
        int total = 0;
        int skid = 0;
        for (Integer product : this.productSkid) {
            total+=product;
        }
        for (Products product : products) {
            skid+=product.getPrice();
        }
        System.out.println("    ");
        System.out.println("<<<<<<<<<< CHACK GLOBUS   >>>>>>>>>");
        System.out.println("НАЗВАНИЕ МАРКЕТА : "+ market.getName());
        System.out.println("ИМЯ ЧЕЛОВЕКА "+person.getName());
        System.out.println(this.products);
        System.out.println("ОБЩАЯ ЦЕНА  "+skid);
        System.out.println("ЦЕНА ПОСЛЕ СКИДКИ : "+total);
        System.out.println("    ");


    }
































}
