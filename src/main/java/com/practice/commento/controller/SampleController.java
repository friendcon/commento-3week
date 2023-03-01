package com.practice.commento.controller;

import com.practice.commento.dto.Dto;
import com.practice.commento.service.SampleService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/sample")
public class SampleController {
    private SampleService sampleService;

    public SampleController(SampleService sampleService) {
        this.sampleService = sampleService;
    }

    @GetMapping("/hello")
    public void getPage(Model model) {
        List<Dto> list = sampleService.getList();
        model.addAttribute("viewname", "/sample/hello");
        model.addAttribute("list", list);
    }
}
