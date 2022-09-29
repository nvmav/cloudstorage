package com.udacity.jwdnd.course1.cloudstorage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class HomeController {

  @GetMapping()
  public String getHomePage() {
    //model.addAttribute("greetings", this.messageListService.getMessages());
    return "home";
  }

  @PostMapping("/uploadFile")
  public String uploadCredential() {
    return "";
  }

  @PostMapping("/addNote")
  public String addNote() {
    return "";
  }

  @PostMapping("/addCredential")
  public String addCredential() {
    return "";
  }

}
