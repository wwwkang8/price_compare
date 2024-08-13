package com.example.pricecompare.service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Service;

@Service
public class LowestPriceServiceImpl implements LowestPriceService{
  @Override
  public Set getZsetValue(String key) {
    Set myTempSet = new HashSet();
    return myTempSet;
  }
}
