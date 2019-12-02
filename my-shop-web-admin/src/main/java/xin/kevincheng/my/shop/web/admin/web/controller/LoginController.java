package xin.kevincheng.my.shop.web.admin.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import xin.kevincheng.my.shop.commons.constant.ConstantUtils;
import xin.kevincheng.my.shop.domain.User;
import xin.kevincheng.my.shop.web.admin.service.UserService;

import javax.servlet.http.HttpServletRequest;

/**
 * @author kc
 * @title
 * @description The class LoginController is for
 * @date Create in 22:42 2019/10/30
 */
@Controller
public class LoginController {

    /**
     * jump to login page
     * @return
     */
    @RequestMapping(value = {"", "login"}, method = RequestMethod.GET)
    public String login() {
        return "login";
    }

    /**
     * login
     *
     * @param email
     * @param password
     * @return
     */
    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String login(@RequestParam(required = true) String email, @RequestParam(required = true) String password, HttpServletRequest httpServletRequest) {
        return null;
    }

    /**
     * logout
     * @param httpServletRequest
     * @return
     */
    @RequestMapping(value = "logout", method = RequestMethod.GET)
    public String logout(HttpServletRequest httpServletRequest) {
        httpServletRequest.getSession().invalidate();

        return login();
    }
}
