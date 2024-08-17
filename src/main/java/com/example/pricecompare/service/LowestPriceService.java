package com.example.pricecompare.service;

import java.util.Set;

import com.example.pricecompare.vo.Product;

public interface LowestPriceService {

  Set getZsetValue(String key);

  int setNewProduct(Product newProduct);
}
