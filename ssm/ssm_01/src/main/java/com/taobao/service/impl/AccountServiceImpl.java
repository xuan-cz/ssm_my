package com.taobao.service.impl;

import com.taobao.dao.AccountDao;
import com.taobao.pojo.Account;
import com.taobao.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;
    @Override
    public List<Account> findAll() {
        System.out.println("service调用了！！");
        return accountDao.findAll();
    }
}
