package com.dsi.chaldal.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import com.dsi.chaldal.dtos.UserDTO;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
@RequestMapping("/view/signup")
public class UserController {
  @GetMapping(value = { "", "/" })
  public String getSignUpView() {
    return "signup";
  }

  @PostMapping(value = { "", "/" })
  public String postSignUpView(@RequestBody UserDTO userDTO) {
    System.out.println(userDTO);
    return "signup";
  }

}
