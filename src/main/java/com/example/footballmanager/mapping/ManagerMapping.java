package com.example.footballmanager.mapping;

import com.example.footballmanager.dto.ManagerDTO;
import com.example.footballmanager.entity.Manager;
import org.springframework.stereotype.Component;

@Component
public class ManagerMapping {
    public ManagerDTO managerDTO(Manager m){
        ManagerDTO dto = ManagerDTO.builder()
                .id(m.getId())
                .fullName(m.getFullName())
                .league(m.getLeague())
                .club(m.getClub())
                .build();
    return dto;
    }
}
