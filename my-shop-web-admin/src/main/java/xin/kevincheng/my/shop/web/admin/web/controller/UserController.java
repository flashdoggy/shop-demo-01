package xin.kevincheng.my.shop.web.admin.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import xin.kevincheng.my.shop.domain.TbUser;
import xin.kevincheng.my.shop.web.admin.service.TbUserService;

import java.util.ArrayList;

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
    public String list(Model model) {
        ArrayList<TbUser> tbUsers = tbUserService.selectAll();
        model.addAttribute("tbUsers", tbUsers);
        return "user_list";
    }

    /**
     * @Author k5068
     * @Date 2019/12/7 15:49
     * @Description This is description of method user form page
     * @Param []
     * @Return java.lang.String
     * @Since
     */
    @RequestMapping(value = "form", method = RequestMethod.GET)
    public String form() {

        return "user_form";
    }
}
