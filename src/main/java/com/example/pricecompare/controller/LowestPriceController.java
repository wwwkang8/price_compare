package com.example.pricecompare.controller;

import java.util.Set;

import com.example.pricecompare.service.LowestPriceService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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

}
