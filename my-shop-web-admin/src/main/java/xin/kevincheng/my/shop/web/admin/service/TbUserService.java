package xin.kevincheng.my.shop.web.admin.service;

import xin.kevincheng.my.shop.commons.dao.BaseResult;
import xin.kevincheng.my.shop.domain.TbUser;

import java.util.ArrayList;

/**
 * @author kc
 * @title
 * @description The interface TbUserService is for
 * @date Create in 16:51 2019/12/2
 */
public interface TbUserService {
    /**
     * @Author k5068
     * @Date 2019/12/2 21:03
     * @Description This is description of method select all users
     * @Param []
     * @Return java.util.List<xin.kevincheng.my.shop.domain.TbUser>
     * @Since
     */
    public ArrayList<TbUser> selectAll();

    /**
     * @Author k5068
     * @Date 2019/12/7 17:59
     * @Description This is description of method select user by user id
     * @Param [id]
     * @Return xin.kevincheng.my.shop.domain.TbUser
     * @Since
     */
    public TbUser selectById(Long id);

    /**
     * @Author k5068
     * @Date 2019/12/2 21:03
     * @Description This is description of method insert or update user;
     * @Param []
     * @Return void
     * @Since
     * @return
     */
    public BaseResult saveOrUpdateTbUser(TbUser tbUser, String confirmPassword, String originalPassword);

    /**
     * @Author k5068
     * @Date 2019/12/3 4:39
     * @Description This is description of method login by email
     * @Param [email, password]
     * @Return xin.kevincheng.my.shop.domain.TbUser
     * @Since
     */
    public TbUser loginByEmail(String email, String password);
}
