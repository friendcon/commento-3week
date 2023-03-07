package com.practice.commento.service;

import com.practice.commento.dto.AccessCountResponse;
import com.practice.commento.dto.Dto;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class ServiceTests {
    @Autowired
    private SampleService sampleService;

    @Autowired
    private EmployeeService employeeService;

    @Test
    @DisplayName("목록확인")
    public void getList() {
        List<Dto> list = sampleService.getList();
        list.forEach(it -> System.out.println(it.toString()));
    }

    @Test
    @DisplayName("항목 확인")
    public void getItem() {
        Dto item = sampleService.getItem(1L);
        System.out.println(item.toString());
    }

    @Test
    @DisplayName("항목 추가")
    public void insertItem() {
        Dto item = Dto.builder()
                .title("3월 1일")
                .content("일기")
                .writer("일기장")
                .build();

        int result = sampleService.insertItem(item);
        System.out.println(result);
    }

    @Test
    @DisplayName("")
    public void getMonthAccessCount() {
        String date = "202201";
        employeeService.getMonthAccessCount(date, "GENERAL");
    }

    @Test
    @DisplayName("")
    public void getYearAccessCount() {
        String date = "2022";
        AccessCountResponse response = employeeService.getYearAccessCount(date, "GENERAL");
        System.out.println(response);
    }
}
