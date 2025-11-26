package com.example.footballmanager.dto;

import com.example.footballmanager.service.ManagerService;
import lombok.*;

import java.io.Serializable;

@Data
@Builder
@Getter
@AllArgsConstructor
public class ManagerDTO implements Serializable {

    private Integer id;
    private String fullName;
    private String league;
    private String club;


}
