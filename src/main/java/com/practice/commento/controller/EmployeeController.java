package com.practice.commento.controller;

import com.practice.commento.dto.AccessCountResponse;
import com.practice.commento.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class EmployeeController {
    EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/access/{dateType}")
    public AccessCountResponse getAccessCount(
        @RequestParam(value = "date") String date,
        @RequestParam(value = "accessType") String accessType,
        @PathVariable(value = "dateType") String dateType
    ) {
        AccessCountResponse accessCountResponse = null;

        switch (dateType) {
            case "month":
                accessCountResponse = employeeService.getMonthAccessCount(date, accessType);
                break;
            case "year":
                accessCountResponse = employeeService.getYearAccessCount(date, accessType);
                break;
        }
        return accessCountResponse;
    }
}
