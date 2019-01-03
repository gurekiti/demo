package com.example.demo.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Data
@Entity
/**
 * 目的地
 */
public class Distination {

    @Id
    @GeneratedValue
    private Long distinationId;

    // 場所名
    private String name;

    // 都道府県
    private String prefectures;

    // 住所
    private String city;

    // 緯度
    private String latitude;

    // 経度
    private String longitude;

}
