package com.java.controller;

import com.java.pojo.qqInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class qqCOntroller {
    @RequestMapping(value = "/qq.do",method =RequestMethod.POST)
    public String getqq(@Valid qqInfo qq,BindingResult bs, Model model){
        Map<String, Object> errorMap = new HashMap<>();
        boolean b = bs.hasErrors();
        if(b){
            List<FieldError> errors = bs.getFieldErrors();
            for (FieldError error : errors) {
                String fieldName = error.getField();
                String message = error.getDefaultMessage();
                errorMap.put(fieldName,message);
            }
        }
        model.addAttribute("errorMap",errorMap);
        model.addAttribute("qq",qq);
        return "pages/admin/qq.jsp";
    }
}
