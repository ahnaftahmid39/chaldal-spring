package com.dsi.chaldal.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.dsi.chaldal.dtos.UserDTO;

import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequestMapping("/view/signup")
public class UserController {
  @GetMapping(value = { "", "/" })
  public String getSignUpView(Model model) {
    model.addAttribute("user", new UserDTO());
    return "signup";
  }

  @PostMapping(value = { "", "/" })
  public String postSignUpView(@ModelAttribute UserDTO userDTO, Model model) {
    model.addAttribute("user", userDTO);
    return "result";
  }

}
