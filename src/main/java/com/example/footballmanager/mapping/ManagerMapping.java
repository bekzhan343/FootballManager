package com.example.footballmanager.mapping;

import com.example.footballmanager.dto.ManagerDTO;
import com.example.footballmanager.entity.Manager;
import org.springframework.stereotype.Component;

@Component
public class ManagerMapping {

    public Manager toManager(ManagerDTO dto){
        Manager manager = new Manager();
        manager.setId(dto.getId());
        manager.setFullName(dto.getFullName());
        manager.setLeague(dto.getLeague());
        manager.setClub(dto.getClub());

        return manager;
    }
}
