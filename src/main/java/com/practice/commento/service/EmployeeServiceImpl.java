package com.practice.commento.service;

import com.practice.commento.dto.AccessCountResponse;
import com.practice.commento.repository.EmployeeMapper;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeMapper employeeMapper;

    public EmployeeServiceImpl(EmployeeMapper employeeMapper) {
        this.employeeMapper = employeeMapper;
    }

    @Override
    public AccessCountResponse getMonthAccessCount(String month, String accessType) {
        String resultDate = month.substring(0, 4) + "-" + month.substring(4,6);
        System.out.println(resultDate);
        AccessCountResponse response = employeeMapper.getMonthAccessCount(resultDate, accessType);
        response.setDateType("Month");
        response.setStatusCode("200");
        response.setAccessType(accessType);
        return response;
    }

    @Override
    public AccessCountResponse getYearAccessCount(String year, String accessType) {
        System.out.println(year);
        AccessCountResponse response = employeeMapper.getYearAccessCount(year, accessType);
        response.setDateType("Year");
        response.setStatusCode("200");
        response.setAccessType(accessType);
        return response;
    }
}
