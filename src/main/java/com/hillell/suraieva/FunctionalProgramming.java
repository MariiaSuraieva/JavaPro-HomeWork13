package com.hillell.suraieva;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

import static com.hillell.suraieva.Product.koefSkidki;


public class FunctionalProgramming {

    public static List<Product> getProducts() throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");

        return List.of(
                new Product("Magazine", 65, false, format.parse("02-02-2023")),
                new Product("Book", 55, true, format.parse("23-08-2023")),
                new Product("Book", 65, true, format.parse("31-12-2023")),
                new Product("Magazine", 255, false, format.parse("23-04-2022")),
                new Product("Book", 290, true, format.parse("17-06-2022")),
                new Product("Book", 390, false, format.parse("23-05-2022"))
        );
    }

    public static List<Product> getProductsByTypeByHighterPrice(List<Product> products, String type, int price) {
        return products.stream()
                .filter(product -> product.getType().equals(type))
                .filter(product -> product.getPrice() >= price)
                .collect(Collectors.toList());
    }

    public static List<Product> makeBooksPricesLower(List<Product> products, String type) {
        return products.stream()
                .filter(product -> product.getType().equals(type))
                .filter(product -> product.isSale)
                .map(product -> {
                    product.setPrice(product.getPrice() * koefSkidki);
                    return product;
                })
                .collect(Collectors.toList());
    }

    public static Product findTheLowerPriceInType(List<Product> products, String type) throws Exception {

        return products.stream()
                .filter(product -> product.getType().equals(type))
                .min(Comparator.comparing(Product::getPrice))
                .orElseThrow(() -> new Exception("Продукт [категорія: " + type + " не знайдено"));

    }

    public static List<Product> getThreeLastProducts(List<Product> products){
        return products.stream()
                .sorted(Comparator.comparing(Product::getData).reversed())
                .limit(3)
                .collect(Collectors.toList());
    }


    public static double calcSumByParametrs (List<Product> products, String type, float maxPrice) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        Date date = format.parse("01-01-2023");
        Date finalDate = date;

        return products.stream()
                .filter(product -> product.getType().equals(type))
                .filter(product -> product.getPrice() < maxPrice)
                .filter(product -> product.getData().after(finalDate))
                .mapToDouble(Product::getPrice)
                .sum();

    }

    public static Map<String, List<Product>> groupByTypes (List<Product> products){
        return products.stream()
                .collect(Collectors.groupingBy(Product::getType));
    }

    


}