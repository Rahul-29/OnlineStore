package com.techinterview.onlinestore.test.service;

import com.techinterview.onlinestore.domain.BackPack;
import com.techinterview.onlinestore.domain.Product;
import com.techinterview.onlinestore.domain.SmartPhone;
import com.techinterview.onlinestore.service.ConvertToString;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

@ExtendWith(MockitoExtension.class)
public class TestConvertorToString {

    @InjectMocks
    private ConvertToString convertorToString;

    private List<Product> productList = new ArrayList<>();

    @BeforeEach
    public void setUp(){
        BackPack backPack = new BackPack("111-222-333", "Cool Backpack");
        backPack.setCapacity(20);
        backPack.setColor("Black");
        backPack.setMaxContentWeight(15);

        SmartPhone smartPhone = new SmartPhone("222-333-555", "Motorola");
        smartPhone.setColor("grey");
        smartPhone.setManufacturer("Motorola");
        smartPhone.setNumberOfCPUs(1);
        smartPhone.setRamSize(64);
        smartPhone.setScreenResolution("large");

        productList.add(backPack);
        productList.add(smartPhone);
    }


    @Test
    public void should_successWithValidProducts(){
        String expectedBackpackDescription = "Cool Backpack (111-222-333)," +
                "maxContentWeight:15.0,color:Black,capacity:20.0\n";
        String expectedSmartphoneDescription = "Motorola (222-333-555)," +
                "manufacturer:Motorola,color:grey,numberOfCPUs:1,ramSize:64.0,screenResolution:large";

        String output = convertorToString.convert(productList);
        Assertions.assertEquals(output, expectedBackpackDescription.concat(expectedSmartphoneDescription));
    }

}
