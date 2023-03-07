package com.practice.commento.repository;

import com.practice.commento.dto.AccessCountResponse;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface EmployeeMapper {
    AccessCountResponse getMonthAccessCount(@Param("month") String month, @Param("accessType") String accessType);
    AccessCountResponse getYearAccessCount(@Param("year") String year, @Param("accessType") String accessType);
}
