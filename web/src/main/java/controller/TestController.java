package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import pojo.TestPojo;
import service.TestService;

import java.util.List;

@Controller
@RequestMapping("test")
public class TestController {
    @Autowired
    private TestService service;

    @RequestMapping("findall.do")
    public ModelAndView findAll(){
        ModelAndView model=new ModelAndView();
        List<TestPojo> list = service.findAll();
        model.addObject("list",list);
        model.setViewName("list");
        return model;
    }

}
