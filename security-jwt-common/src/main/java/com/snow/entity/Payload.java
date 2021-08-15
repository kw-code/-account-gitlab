package com.snow.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author K.W
 * @SINCE 2021/7/26
 */
@Data
public class Payload<T> {
   private String id;

   private  T userInfo;

   private Date expiration;

}
