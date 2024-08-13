package com.example.pricecompare.vo;

import java.util.List;

import lombok.Data;

@Data
public class Keyword {

  private String keyword; // 유아용품 --> 하기스 기저귀(FPG0001)

  private List<ProductGrp> productGrpList;

}
