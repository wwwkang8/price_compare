package com.example.pricecompare.controller;

import java.util.Set;

import com.example.pricecompare.service.LowestPriceService;
import com.example.pricecompare.vo.Product;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class LowestPriceController {

  @Autowired
  private LowestPriceService priceService;


  @GetMapping("/getZSETValue")
  public Set GetZsetValue(String key) {
    return priceService.getZsetValue(key);
  }

  @PutMapping("/product")
  public int SetNewProduct(@RequestBody Product newProduct) {

    return priceService.setNewProduct(newProduct);
  }

}
