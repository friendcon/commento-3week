package com.practice.commento.repository;

import com.practice.commento.dto.AccessCountResponse;
import com.practice.commento.dto.Dto;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class RepositoryTest {
    @Autowired
    private Sample sample;

    @Autowired
    private EmployeeMapper employeeMapper;

    @Test
    @DisplayName("리스트 조회")
    public void getList() {
        List<Dto> list = sample.getDtoList();
        list.forEach(it -> System.out.println(it.toString()));
    }

    @Test
    @DisplayName("항목 조회")
    public void getItem() {
        Dto item = sample.getDto(1L);
        System.out.println(item.toString());
    }

    @Test
    @DisplayName("항목 추가")
    public void insertItem() {
        Dto dto = Dto.builder()
                .title("제목이여요")
                .content("내용이여요")
                .writer("글쓴이")
                .build();

        int result = sample.insertDto(dto);
        System.out.println(result);
    }

    @Test
    @DisplayName("항목")
    public void getMonthAccessCount() {
        AccessCountResponse result = employeeMapper.getMonthAccessCount("2022-01", "GENERAL");
        System.out.println(result.getAccessCount());
    }

    @Test
    @DisplayName("연 항목")
    public void getYearAccessCount() {
        AccessCountResponse response = employeeMapper.getYearAccessCount("2022", "GENERAL");
        System.out.println(response);
    }
}
