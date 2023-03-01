package com.practice.commento;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class SettingTest {
    @RequestMapping("/test")
    public ModelAndView test() {
        ModelAndView mav = new ModelAndView("test");
        mav.addObject("name", "devfunpj");
        List<String> resultList = new ArrayList<String>();
        resultList.add("!!!HELLO WORLD!!!");
        resultList.add("설정 TEST!!!");
        resultList.add("설정 TEST!!!");
        resultList.add("설정 TEST!!!!!");
        resultList.add("설정 TEST!!!!!!");
        mav.addObject("list", resultList);
        return mav;
    }
}
