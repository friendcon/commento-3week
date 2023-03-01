package com.practice.commento.service;

import com.practice.commento.dto.Dto;

import java.util.List;

public interface SampleService {
    List<Dto> getList();
    Dto getItem(Long id);
    int insertItem(Dto dto);
}
