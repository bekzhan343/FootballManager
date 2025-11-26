package com.example.footballmanager.controller;


import com.example.footballmanager.constants.ApiLogMessage;
import com.example.footballmanager.dto.ManagerDTO;
import com.example.footballmanager.entity.Manager;
import com.example.footballmanager.mapping.ManagerMapping;
import com.example.footballmanager.repository.ManagerRepository;
import com.example.footballmanager.response.IamResponse;
import com.example.footballmanager.service.ManagerService;
import com.example.footballmanager.utils.ApiUtils;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("${end.point.managers}")
public class ManagerController {

    private final ManagerService service;


    @PostMapping("${end.point.create}")
    public ResponseEntity<IamResponse<ManagerDTO>> createManager(@RequestBody ManagerDTO dto){
        IamResponse<ManagerDTO> response = service.createManagerObj(dto);

        log.trace(ApiLogMessage.METHOD_NAME_INFO.getValue(), ApiUtils.getMethodName());

        return ResponseEntity.ok(response);
    }

    @GetMapping("${end.point.id}")
    public ResponseEntity<IamResponse<ManagerDTO>> getManagerById(@PathVariable(name = "id") Integer id){
        IamResponse<ManagerDTO> response = service.getById(id);

        log.trace(ApiLogMessage.METHOD_NAME_INFO.getValue(), ApiUtils.getMethodName());

        return ResponseEntity.ok(response);
    }

}

