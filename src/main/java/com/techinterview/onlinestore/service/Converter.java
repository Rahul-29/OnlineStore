package com.techinterview.onlinestore.service;

import com.techinterview.onlinestore.domain.Product;

import java.util.List;

public interface Converter<T> {

    T convert(List<Product> productList);
}
