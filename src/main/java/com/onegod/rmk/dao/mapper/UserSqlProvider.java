package com.onegod.rmk.dao.mapper;

import com.onegod.rmk.util.StringUtil;

import java.util.Map;

/**
 * Created by kingdee on 2016/12/23.
 */
public class UserSqlProvider {
    /**
     * 获取查询SQL
     * @param param
     * @return
     */
    public String getUserListByMapSql(Map<String, Object> param) {
        StringBuilder builder = new StringBuilder();
        Map<String, String> realParam = (Map<String, String>)param.get("param");

        //add select part
        builder.append(" select * from user where 1 = 1 ");

        //add condition part
        String conditionStr = "";
        if(!StringUtil.isNullOrEmpty(realParam)){
            conditionStr = getQueryCondition(realParam);
            if(!StringUtil.isNullOrEmpty(conditionStr)){
                builder.append(conditionStr);
            }
        }

        return new String(builder);
    }

    public String getQueryCondition(Map<String, String> param){
        StringBuilder builder = new StringBuilder();

        //if param is null or empty, return empty String
        if(param == null || param.size() < 1){
            return "";
        }

        for(String key : param.keySet()){
            String value = param.get(key);
            if(value != null && !value.equals("")){
                builder.append(" and " + key + " = '" + value + "'");
            }
        }

        return new String(builder);
    }
}
