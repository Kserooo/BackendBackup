package com.ksero.backendkseroapi.ksero.resources.retail_seller;

import lombok.*;

import javax.validation.constraints.NotNull;

@Setter
@Getter
@With
@NoArgsConstructor
@AllArgsConstructor
public class RetailSellerResource {
    private Long id;
    private String firstName;
    private String address;
    private String lastName;
    private String birthday;
    private String phone;
    private String email;
    private String username;
    private String password;
    private String description;
}
