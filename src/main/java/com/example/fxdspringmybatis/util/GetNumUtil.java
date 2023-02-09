package com.example.fxdspringmybatis.util;

public class GetNumUtil {


  private static GetNumUtil getNumUtil;

  private GetNumUtil(){}

  public  static GetNumUtil getInstance(){
      if(null == getNumUtil){
          getNumUtil = new GetNumUtil();
      }
      return getNumUtil;
  }


  public int getnum(){
      return 2;
  }





}
