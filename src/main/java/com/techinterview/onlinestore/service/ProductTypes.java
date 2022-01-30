//package com.techinterview.onlinestore.service;
//
//import com.techinterview.onlinestore.domain.BackPack;
//import com.techinterview.onlinestore.domain.Product;
//import com.techinterview.onlinestore.domain.SmartPhone;
//
//public class ProductTypes {
//    public enum ProductType {
//
//        SMARTPHONE {
//            @Override
//            public String productDescription(Product product) {
//                StringBuffer buffer = new StringBuffer(ProductType.setProductValues(product));
//                SmartPhone smartPhone = (SmartPhone) product;
//
//                buffer.replace(buffer.lastIndexOf(DELIMITER) + 1, buffer.length() - 1, smartPhone.toString());
//                return buffer.toString();
//            }
//        },
//        BACKPACK {
//            @Override
//            public String productDescription(Product product) {
//                StringBuffer buffer = new StringBuffer(setProductValues(product));
//                BackPack backPack = (BackPack) product;
//
//                buffer.replace(buffer.lastIndexOf(DELIMITER) + 1, buffer.length() - 1, backPack.toString());
//                return buffer.toString();
//            }
//        };
//
//        public static final String FORMAT = "<PRODUCT_NAME> (<PRODUCT_GUID>),<PRODUCT_ATTRIBUTE>\n";
//
//        private static final String DELIMITER = ",";
//
//        public abstract String productDescription(Product product);
//
//        private static String setProductValues(Product product) {
//            return FORMAT.replace("<PRODUCT_NAME>", product.getName()).
//                    replace("<PRODUCT_GUID>", product.getGuid());
//
//        }
//    }
//}
