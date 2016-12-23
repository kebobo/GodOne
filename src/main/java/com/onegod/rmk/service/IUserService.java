package com.onegod.rmk.service;

import com.onegod.rmk.model.User;

import java.util.List;
import java.util.Map;

/**
 * Created by kingdee on 2016/12/23.
 */
public interface IUserService {
    User getUserById(int userId);

    /**
     *
     * @param param Map中的key要与数据库表中的字段名相同
     * @return
     */
    User getUserByMapSql(Map<String, String> param);

    List<User> getUserListByMapSql(Map<String, String> param);
}
