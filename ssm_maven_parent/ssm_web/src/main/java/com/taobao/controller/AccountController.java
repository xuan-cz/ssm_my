package com.taobao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.taobao.pojo.Account;
import com.taobao.service.AccountService;

import java.util.List;

@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping("/findAll")
    public String findAll(){
        System.out.println("controller调用了");
        List<Account> all = accountService.findAll();
        System.out.println(all);
        return "success";
    }
}
