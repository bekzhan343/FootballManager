package com.example.footballmanager.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.io.Serializable;

@Data
@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ManagerDTO implements Serializable {

    private Integer id;
    @NotBlank(message = "Column |fullName| cannot be empty!")
    private String fullName;
    @NotBlank(message = "Column |league| cannot be empty!")
    private String league;
    @NotBlank(message = "Column |club| cannot be empty!")
    private String club;


}
