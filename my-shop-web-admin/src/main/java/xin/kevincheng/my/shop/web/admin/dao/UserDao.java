package xin.kevincheng.my.shop.web.admin.dao;

import xin.kevincheng.my.shop.domain.User;

/**
 * @author kc
 * @title
 * @description The interface UserDao is for
 * @date Create in 21:50 2019/10/30
 */
public interface UserDao {
    /**
     * find user by email and password
     * @param email
     * @param password
     * @return
     */
    public User getUser(String email, String password);
}
