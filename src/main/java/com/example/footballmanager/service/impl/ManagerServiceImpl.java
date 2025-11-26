package com.example.footballmanager.service.impl;

import com.example.footballmanager.constants.ApiErrorMessage;
import com.example.footballmanager.dto.ManagerDTO;
import com.example.footballmanager.entity.Manager;
import com.example.footballmanager.exceptions.NotFoundException;
import com.example.footballmanager.mapping.ManagerMapping;
import com.example.footballmanager.repository.ManagerRepository;
import com.example.footballmanager.response.IamResponse;
import com.example.footballmanager.service.ManagerService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.jetbrains.annotations.NotNull;

@Service
@RequiredArgsConstructor
public class ManagerServiceImpl implements ManagerService {

    private final ManagerRepository repository;
    private final ManagerMapping mapper;


    @Override
    public IamResponse<ManagerDTO> createManagerObj(@NotNull ManagerDTO dto) {
        Manager manager = new Manager();
        manager.setId(dto.getId());
        manager.setFullName(dto.getFullName());
        manager.setLeague(dto.getLeague());
        manager.setClub(dto.getClub());

        repository.save(manager);

        return IamResponse.createdSuccessfully(dto);
    }

    @Override
    public IamResponse<ManagerDTO> getById(@NotNull Integer id) {
        Manager manager = repository.findById(id)
                .orElseThrow(() -> new NotFoundException(ApiErrorMessage.API_NOT_FOUND_INFO.getMessage(id)));

        ManagerDTO managerDTO = mapper.managerDTO(manager);

        return IamResponse.createdSuccessfully(managerDTO);
    }
}
