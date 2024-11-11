package com.study.factory;

import lombok.*;

/**
 * <pre>
 * description : 
 * packageName : com.study.factory
 * fileName    : ProductDTO
 * author      : limju
 * date        : 2024 11월 11
 * ======================================================================
 * 변경일         변경자        변경 내용
 * ----------------------------------------------------------------------
 * 2024 11월 11   limju       최초 생성
 *
 * </pre>
 */
@Getter
public class ProductDTO {

    private Long id;
    private String name;
    private Double price;

    private ProductDTO(Long id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public static ProductDTO of(String name, Double price) {
        return new ProductDTO(2L, name, price);
    }
}