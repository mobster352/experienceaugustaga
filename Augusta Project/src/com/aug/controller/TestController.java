package com.aug.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.aspectj.weaver.ast.Test;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.aug.dao.TestDAO;

public class TestController {
	
	@Inject
    private TestDAO testdao;

    @RequestMapping(value={"/post"}, method={RequestMethod.POST})
    public String testPost(@Valid Test test, BindingResult result, HttpServletRequest request) {
        if (result.hasErrors()) {
            return "index";
        }
        try {
            
            return "postIndex";
        }
        catch (DataIntegrityViolationException de) {
            return "error";
        }
    }
    @RequestMapping(value={"/get"}, method={RequestMethod.GET})
    public String testGet() {
        return "getIndex";
    }

}
