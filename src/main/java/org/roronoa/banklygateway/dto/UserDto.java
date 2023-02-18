package org.roronoa.banklygateway.dto;

import lombok.Data;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
public class UserDto {
    private Integer id;

    private String uuid;
    @NotNull @NotEmpty
    private String firstName;
    @NotNull @NotEmpty
    private String lastName;
    @NotNull @NotEmpty @Email
    private String email;
    @NotNull @NotEmpty
    private String password;

    private String role;

}
