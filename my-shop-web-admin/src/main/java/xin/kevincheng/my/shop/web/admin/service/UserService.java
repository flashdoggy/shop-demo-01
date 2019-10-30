package xin.kevincheng.my.shop.web.admin.service;

import xin.kevincheng.my.shop.domain.User;

/**
 * @author kc
 * @title
 * @description The interface UserService is for
 * @date Create in 22:39 2019/10/30
 */
public interface UserService {
    /**
     * login for user
     * @param email
     * @param password
     * @return
     */
    public User login(String email, String password);
}
