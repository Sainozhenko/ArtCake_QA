package com.ArtCake.dto;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Builder
public class ErrorDto {
private String errors;
/*
    private String field;
    private Object message;
    private String rejectedValue;
*/
}


