package com.onegod.rmk.service;

import com.onegod.rmk.dao.impl.IUserDao;
import com.onegod.rmk.model.User;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.List;
import java.util.Map;

/**
 * Created by kingdee on 2016/12/23.
 */
public class UserServiceImpl implements IUserService{
    private static Log logger = LogFactory.getLog(UserServiceImpl.class);

    IUserDao userDao;


    public User getUserById(int userId) {
        return userDao.getUserById(userId);
    }

    public User getUserByMapSql(Map<String, String> param) {
        return userDao.getUserByMapSql(param);
    }

    public List<User> getUserListByMapSql(Map<String, String> param) {
        return userDao.getUserListByMapSql(param);
    }

    public IUserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(IUserDao userDao) {
        this.userDao = userDao;
    }
}
