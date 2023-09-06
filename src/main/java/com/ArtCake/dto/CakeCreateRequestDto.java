package com.ArtCake.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Builder
public class CakeCreateRequestDto {
    private String name;
    private String ingredients;
    private Double price;
    private String state;
    private String category;

}
