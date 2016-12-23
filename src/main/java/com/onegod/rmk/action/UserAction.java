package com.onegod.rmk.action;

import com.onegod.rmk.service.IUserService;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by kingdee on 2016/12/23.
 */
public class UserAction extends ActionSupport {

    private static Log logger = LogFactory.getLog(UserAction.class);

    private String message;

    private String username;

    private String password;

    private IUserService userService;

    public String login(){
        try{
            Map<String, String> param = new HashMap<String, String>();
            param.put("username", username);
            param.put("password", password);
            if(userService.getUserByMapSql(param) != null){
                message = "登录成功！";
                logger.info(message);
                return SUCCESS;
            }else{
                message = "登录失败！";
                logger.info(message);
                return INPUT;
            }
        }catch(Exception e){
            logger.warn(e.getMessage());
            e.printStackTrace();
            return INPUT;
        }
    }

    /******** set/get ********/
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public IUserService getUserService() {
        return userService;
    }

    public void setUserService(IUserService userService) {
        this.userService = userService;
    }
}
