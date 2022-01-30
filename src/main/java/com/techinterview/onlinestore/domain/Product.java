package com.techinterview.onlinestore.domain;

import java.util.StringJoiner;

/**
 * Base class for all products that can be soled in online store.
 * SEE TASK DESCRIPTION IN ProductListProcessor CLASS!
 */
public abstract class Product {

    /**
     * GUID that uniquely identifies a product,
     */
    private final String guid;

    /**
     * Meaningful product name.
     */
    private final String name;

    public Product(String guid, String name) {
        this.guid = guid;
        this.name = name;
    }

    public String getGuid() {
        return guid;
    }

    public String getName() {
        return name;
    }

    public String classType(){
        return Product.class.getSimpleName();
    }

    @Override
    public String toString(){
        return new StringJoiner(",",
            name + "(" , ")"
        ).add(guid).toString();
    }
}
