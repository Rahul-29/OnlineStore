package com.techinterview.onlinestore.service;

import com.techinterview.onlinestore.domain.Product;
import java.util.List;
import java.util.StringJoiner;

public class ConvertToString implements Converter<String>{

    private final String PRODUCT_NAME_TOKEN = "<PRODUCT_NAME> ";
    private final String PRODUCT_GUID_TOKEN = "(<PRODUCT_GUID>)";
    private final String PRODUCT_ATTRIBUTE_TOKEN = "<PRODUCT_ATTRIBUTE>";
    private final String DELIMITER = ",";
    private final String STRING_SEPARATOR = "\n";

    @Override
    public String convert(List<Product> productList) {
        StringBuffer output = new StringBuffer();
        productList.stream().forEach(
                product -> {
                    if(output.length() > 0)
                        output.append(STRING_SEPARATOR);
                    StringJoiner productDescription = createProductDescription(product);
                    output.append(productDescription.toString());
                });
        return output.toString();
    }

    private StringJoiner createProductDescription(Product product){
        StringJoiner joiner = new StringJoiner(DELIMITER);
        joiner.add(PRODUCT_NAME_TOKEN.replace("<PRODUCT_NAME>", product.getName()) +
                PRODUCT_GUID_TOKEN.replace("<PRODUCT_GUID>", product.getGuid()));
        joiner.add(PRODUCT_ATTRIBUTE_TOKEN.replace("<PRODUCT_ATTRIBUTE>", product.toString()));
        return joiner;
    }
}
