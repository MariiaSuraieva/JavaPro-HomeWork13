package com.hillell.suraieva;

import javafx.util.converter.LocalDateStringConverter;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception{





        List<Product> products = FunctionalProgramming.getProducts();

       /* System.out.println(
                FunctionalProgramming.getProductsByTypeByHighterPrice(products,"Book",257)
        );

        System.out.println(
                FunctionalProgramming.makeBooksPricesLower(products,"Book")
        );

        System.out.println(
                FunctionalProgramming.findTheLowerPriceInType(products, "Book")
        );

        System.out.println(
                FunctionalProgramming.getThreeLastProducts(products)
        );

        System.out.println(
                FunctionalProgramming.calcSumByParametrs(products,"Book", 75)
        );*/

        System.out.println(
                FunctionalProgramming.groupByTypes(products)
        );






    }


}
