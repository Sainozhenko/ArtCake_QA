package com.ArtCake.dto;

import lombok.*;

@Data
@Builder
public class RegistrationRequestDto {

    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String town;
    private String zipCode;
    private String street;
    private Integer houseNumber;
    private String phoneNumber;
}
