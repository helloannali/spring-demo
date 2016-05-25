package com.dollar.dependencyinjection.service.impl;

import com.dollar.dependencyinjection.dao.AppDAO;
import com.dollar.dependencyinjection.service.AppService;

/**
 * Author why
 * Date 16-5-25
 * Version : soc-ia-1.0
 * Copyright : cnpc
 */
public class AppService2Impl implements AppService {

    private AppDAO appDao;

    public AppDAO getAppDao() {
        return appDao;
    }

    public void setAppDao(AppDAO appDao) {
        this.appDao = appDao;
    }

    @Override
    public String getMsg() {
        return appDao.getMsg();
    }
}
