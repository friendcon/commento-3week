package com.practice.commento.service;

import com.practice.commento.dto.Dto;
import com.practice.commento.repository.Sample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SampleServiceImpl implements SampleService {
    @Autowired
    private Sample sample;

    @Override
    public List<Dto> getList() {
        return sample.getDtoList();
    }

    @Override
    public Dto getItem(Long id) {
        return sample.getDto(id);
    }

    @Override
    public int insertItem(Dto dto) {
        return sample.insertDto(dto);
    }
}
