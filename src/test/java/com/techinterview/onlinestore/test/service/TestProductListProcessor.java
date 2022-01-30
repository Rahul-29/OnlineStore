package com.techinterview.onlinestore.test.service;

import com.techinterview.onlinestore.domain.BackPack;
import com.techinterview.onlinestore.domain.Product;
import com.techinterview.onlinestore.service.Converter;
import com.techinterview.onlinestore.service.ProductListProcessor;
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

@ExtendWith(MockitoExtension.class)
public class TestProductListProcessor {

    @InjectMocks
    private ProductListProcessor productListProcessor;

    @Mock
    private Converter converter;

    private List<Product> productList = new ArrayList<>();

    @BeforeEach
    public void setUp(){
        BackPack backPack = new BackPack("111-222-333", "Cool Backpack");
        backPack.setCapacity(20);
        backPack.setColor("Black");
        backPack.setMaxContentWeight(15);

        productList.add(backPack);
    }

    @Test
    public void should_successWithValidProduct(){
        String expectedBackpackDescription = "Cool Backpack (111-222-333)," +
                "maxContentWeight:15.0,color:Black,capacity:20.0";
        Mockito.when(converter.convert(productList)).thenReturn(expectedBackpackDescription);
        String output = productListProcessor.productListToString(productList);
        Assertions.assertEquals(output, expectedBackpackDescription);
    }

    @Test
    public void should_returnNullWhenListIsEmpty(){
        String output = productListProcessor.productListToString(new ArrayList<>());
        Assertions.assertEquals(output, null);
    }
}
