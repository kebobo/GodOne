package com.onegod.rmk.dao.mapper;

import com.onegod.rmk.model.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.List;
import java.util.Map;

/**
 * Created by kingdee on 2016/12/23.
 */
public interface UserMapper {
    /**
     * 根据参数构造SQL进行查询
     * @param param
     * @return
     */
    @SelectProvider(type = UserSqlProvider.class, method = "getUserListByMapSql")
    List<User> getUserListByMapSql(@Param("param") Map<String, String> param);
}
