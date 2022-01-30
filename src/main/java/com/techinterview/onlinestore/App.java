package com.techinterview.onlinestore;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.techinterview.onlinestore.domain.BackPack;
import com.techinterview.onlinestore.domain.Product;
import com.techinterview.onlinestore.domain.SmartPhone;
import com.techinterview.onlinestore.service.ConvertToJson;
import com.techinterview.onlinestore.service.ConvertToString;
import com.techinterview.onlinestore.service.Converter;
import com.techinterview.onlinestore.service.ProductListProcessor;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        BackPack product = new BackPack("111-222-333", "Cool Backpack");
        product.setCapacity(20);
        product.setColor("Black");
        product.setMaxContentWeight(15);

        SmartPhone smartPhone = new SmartPhone("222-333-555", "Motorola");
        smartPhone.setColor("grey");
        smartPhone.setManufacturer("Motorola");
        smartPhone.setNumberOfCPUs(1);
        smartPhone.setRamSize(64);
        smartPhone.setScreenResolution("large");

        List<Product> productList = new ArrayList<>();
        productList.add(product);
        productList.add(smartPhone);

        Converter converter = new ConvertToString();

        ProductListProcessor productListProcessor = new ProductListProcessor();
        productListProcessor.setConverter(converter);
        String convertedString = productListProcessor.productListToString(productList);
        System.out.println(convertedString);

    }

}
