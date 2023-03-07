package com.practice.commento.service;

import com.practice.commento.dto.AccessCountResponse;

public interface EmployeeService {
    AccessCountResponse getMonthAccessCount(String month, String accessType);
    AccessCountResponse getYearAccessCount(String year, String accessType);
}
