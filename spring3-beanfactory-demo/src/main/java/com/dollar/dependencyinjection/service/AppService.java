package com.dollar.dependencyinjection.service;

import com.dollar.dependencyinjection.dao.AppDAO;

/**
 * Author why
 * Date 16-5-25
 * Version : soc-ia-1.0
 * Copyright : cnpc
 */
public interface AppService {

    AppDAO getAppDao();

    String getMsg();
}
