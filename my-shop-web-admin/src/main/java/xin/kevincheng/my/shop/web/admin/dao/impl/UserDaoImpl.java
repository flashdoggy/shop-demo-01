package xin.kevincheng.my.shop.web.admin.dao.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import xin.kevincheng.my.shop.domain.User;
import xin.kevincheng.my.shop.web.admin.dao.UserDao;

/**
 * @author kc
 * @title
 * @description The class UserDaoImpl is for
 * @date Create in 21:58 2019/10/30
 */

@Repository
public class UserDaoImpl implements UserDao {
    public static final Logger logger = LoggerFactory.getLogger(UserDaoImpl.class);
    @Override
    public User getUser(String email, String password) {
        logger.debug("callback for getUser(), email: {} password: {}", email, password);

        User user = null;

        if ("admin@taoism-one.com".equals(email)) {
            if ("admin".equals(password)) {
                user = new User();
                user.setEmail("admin@taoism-one.com");
                user.setUsername("KevinCheng");

                logger.info("success for getUser({}), username is {}", user.getEmail(), user.getUsername());
            }
            else {
                logger.warn("getUser({}) failed", user.getEmail());
            }
        }

        return user;
    }
}
