package xin.kevincheng.my.shop.web.admin.web.controller;

import cn.hutool.core.util.StrUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import xin.kevincheng.my.shop.commons.dao.BaseResult;
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
    public String form(Model model, @RequestParam(value = "tbUserId", required = false) Long userId) {
        TbUser tbUser;
        if (null != userId) {
            tbUser = tbUserService.selectById(userId);
        } else {
            tbUser = null;
        }
        model.addAttribute("tbUser", tbUser);
        return "user_form";
    }

    @RequestMapping(value = "save", method = RequestMethod.POST)
    public String saveOrUpdate(
            TbUser tbUser,
            @RequestParam(value = "confirmPassword")String confirmPassword,
            @RequestParam(value = "originalPassword")String originalPassword,
            Model model, RedirectAttributes redirectAttributes) {

        BaseResult baseResult = tbUserService.saveOrUpdateTbUser(tbUser, confirmPassword, originalPassword);
        String returnUrl;
        if (baseResult.getStatus() == 200) {
            redirectAttributes.addFlashAttribute("baseResult", baseResult);
            returnUrl = "redirect:/user/list";
        } else {
            model.addAttribute("baseResult", baseResult);
            returnUrl = "user_form";
        }

        return returnUrl;
    }
}
