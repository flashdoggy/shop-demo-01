package xin.kevincheng.my.shop.web.admin.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import xin.kevincheng.my.shop.domain.TbUser;
import xin.kevincheng.my.shop.web.admin.service.TbUserService;

/**
 * @author kc
 * @title
 * @description The class UserController is for
 * @date Create in 23:44 2019/12/4
 */
@Controller
@RequestMapping(value = "user")
public class UserController {

    @Autowired
    private TbUserService tbUserService;

    /**
     * @Author k5068
     * @Date 2019/12/4 23:45
     * @Description This is description of method get user list
     * @Param []
     * @Return java.lang.String
     * @Since
     */
    @RequestMapping(value = "list", method = RequestMethod.GET)
    public String list() {
        System.out.println("dddd");
        return "user_list";
    }
}
