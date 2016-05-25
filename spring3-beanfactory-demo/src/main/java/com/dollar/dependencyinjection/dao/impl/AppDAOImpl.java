package com.dollar.dependencyinjection.dao.impl;

import com.dollar.dependencyinjection.dao.AppDAO;

/**
 * Author why
 * Date 16-5-25
 * Version : soc-ia-1.0
 * Copyright : cnpc
 */
public class AppDAOImpl implements AppDAO {

    @Override
    public String getMsg() {
        return "hello world";
    }
}
