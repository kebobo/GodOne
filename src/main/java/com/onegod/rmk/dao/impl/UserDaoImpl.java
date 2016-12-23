package com.onegod.rmk.dao.impl;

import com.onegod.rmk.dao.mapper.UserMapper;
import com.onegod.rmk.model.User;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.List;
import java.util.Map;

/**
 * Created by kingdee on 2016/12/23.
 */
public class UserDaoImpl extends BaseDao implements IUserDao {

    private static Log logger = LogFactory.getLog(UserDaoImpl.class);

    public User getUserById(int userId) {
        UserMapper mapper = readonlySQLSession.getMapper(UserMapper.class);
//        return mapper.selectByPrimaryKey(userId);
        return null;
    }

    /**
     * dsafdsf
     * @param param
     * @return
     */
    public User getUserByMapSql(Map<String, String> param) {
        logger.info("getUserByMapSql 根据动态参数查询用户对象");
        return getUserListByMapSql(param).size() > 0 ? getUserListByMapSql(param).get(0) : null;
    }

    /**
     * get**MapSql()类的方法只能用于各参数的等于查询
     * 例如：select * from user where username = 1 and password = 3  （正确）
     *       select * from user where username in (1,2,3) （错误，无法实现）
     * @param param
     * @return
     */
    public List<User> getUserListByMapSql(Map<String, String> param) {
        logger.info("getUserListByMapSql 根据动态参数查询用户对象列表");
        UserMapper mapper = readonlySQLSession.getMapper(UserMapper.class);
        return mapper.getUserListByMapSql(param);
    }
}
