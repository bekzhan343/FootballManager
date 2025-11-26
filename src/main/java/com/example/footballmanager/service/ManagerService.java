package com.example.footballmanager.service;

import com.example.footballmanager.dto.ManagerDTO;
import com.example.footballmanager.entity.Manager;
import com.example.footballmanager.response.IamResponse;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Service;


public interface ManagerService {

    IamResponse<ManagerDTO> createManagerObj(@NotNull ManagerDTO dto);


    IamResponse<ManagerDTO> getById(@NotNull Integer id);

}
