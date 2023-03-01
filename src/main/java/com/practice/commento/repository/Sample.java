package com.practice.commento.repository;

import com.practice.commento.dto.Dto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface Sample {
    List<Dto> getDtoList();
    int insertDto(Dto dto);
    Dto getDto(Long id);
}
