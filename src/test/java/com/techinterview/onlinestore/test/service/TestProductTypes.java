//package com.techinterview.onlinestore.test.service;
//
//import com.techinterview.onlinestore.domain.BackPack;
//import com.techinterview.onlinestore.domain.SmartPhone;
//import com.techinterview.onlinestore.service.ProductTypes;
//import com.techinterview.onlinestore.service.ProductTypes;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.junit.jupiter.MockitoExtension;
//
//@ExtendWith(MockitoExtension.class)
//public class TestProductTypes {
//
//    @Test
//    public void should_successForBackpack(){
//        BackPack backPack = new BackPack("111-222-333", "Cool Backpack");
//        backPack.setCapacity(20);
//        backPack.setColor("Black");
//        backPack.setMaxContentWeight(15);
//        String productDescription = ProductTypes.ProductType.BACKPACK.productDescription(backPack);
//        Assertions.assertEquals(productDescription,
//                "Cool Backpack (111-222-333),maxContentWeight:15.0,color:Black,capacity:20.0\n");
//    }
//
//    @Test
//    public void should_successForSmartphone(){
//        SmartPhone smartPhone = new SmartPhone("222-333-555", "Motorola");
//        smartPhone.setColor("grey");
//        smartPhone.setManufacturer("Motorola");
//        smartPhone.setNumberOfCPUs(1);
//        smartPhone.setRamSize(64);
//        smartPhone.setScreenResolution("large");
//
//        String productDescription = ProductTypes.ProductType.SMARTPHONE.productDescription(smartPhone);
//        Assertions.assertEquals(productDescription,
//                "Motorola (222-333-555),manufacturer:Motorola,color:grey,numberOfCPUs:1," +
//                        "ramSize:64.0,screenResolution:large\n");
//    }
//}
