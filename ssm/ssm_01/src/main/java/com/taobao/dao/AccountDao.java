package com.taobao.dao;

import com.taobao.pojo.Account;

import java.util.List;

public interface AccountDao {

    List<Account> findAll();
}
