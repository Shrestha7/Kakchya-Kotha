/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swastik.springapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author SWASTIK_SHRESTHA
 */
@Controller
@RequestMapping(value = "/")
public class DefaultController {

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public String index(Model model) {
        model.addAttribute("name", "swastik");
        return "index";

    }

}
