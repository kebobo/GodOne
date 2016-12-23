package com.onegod.rmk.dao.impl;

import org.apache.ibatis.session.SqlSession;

/**
 * Created by kingdee on 2016/12/23.
 */
public class BaseDao {
    /**
     * 可写的sqlSession
     */protected SqlSession writableSQLSession;

    /**
     * 只读的sqlSession
     */protected SqlSession readonlySQLSession;

    public void setWritableSQLSession(SqlSession writableSQLSession) {
        this.writableSQLSession = writableSQLSession;
    }

    public void setReadonlySQLSession(SqlSession readonlySQLSession) {
        this.readonlySQLSession = readonlySQLSession;
    }
}
