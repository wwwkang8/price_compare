package com.example.pricecompare.service;

import java.util.HashSet;
import java.util.Set;

import com.example.pricecompare.vo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class LowestPriceServiceImpl implements LowestPriceService{

  @Autowired
  private RedisTemplate myProdPriceRedis;



  @Override
  public Set getZsetValue(String key) {
    Set myTempSet = new HashSet();

    myTempSet = myProdPriceRedis.opsForZSet().rangeWithScores(key, 0, 9);

    return myTempSet;
  }

  @Override
  public int setNewProduct(Product newProduct) {
    int rank = 0;
    myProdPriceRedis.opsForZSet().add(newProduct.getProductId(), newProduct.getProductId(), newProduct.getPrice());
    rank = myProdPriceRedis.opsForZSet().rank(newProduct.getProductId(), newProduct.getProductId()).intValue();
    return rank;
  }
}
