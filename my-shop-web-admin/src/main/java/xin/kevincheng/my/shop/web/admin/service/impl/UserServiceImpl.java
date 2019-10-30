package xin.kevincheng.my.shop.web.admin.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xin.kevincheng.my.shop.domain.User;
import xin.kevincheng.my.shop.web.admin.dao.UserDao;
import xin.kevincheng.my.shop.web.admin.service.UserService;

/**
 * @author kc
 * @title
 * @description The class UserServiceImpl is for
 * @date Create in 22:40 2019/10/30
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User login(String email, String password) {
        return userDao.getUser(email, password);
    }
}
