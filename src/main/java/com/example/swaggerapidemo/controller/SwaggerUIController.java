package com.example.swaggerapidemo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/swagger")
public class SwaggerUIController {
	@Value("${git.branch}")
    private   String branch;
    @GetMapping("/{name}/{version}")
    public String homePage(@PathVariable("name") String name, @PathVariable("version") String version, Model model) {
        model.addAttribute("filePath", "/swagger/" + name + '/' + version + "/swagger.yaml");
        return "redoc";
    }
    @GetMapping("/")
    public void getBranchName() {
    	System.out.println("----------------getBranchName-------"+branch);
    }
}
