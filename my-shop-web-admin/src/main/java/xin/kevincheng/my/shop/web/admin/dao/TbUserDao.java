package xin.kevincheng.my.shop.web.admin.dao;

import org.springframework.stereotype.Repository;
import xin.kevincheng.my.shop.domain.TbUser;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kc
 * @title
 * @description The interface TbUserDao is for
 * @date Create in 16:48 2019/12/2
 */
@Repository
public interface TbUserDao {
    /**
     * @Author k5068
     * @Date 2019/12/2 16:49
     * @Description This is description of method select all users from db;
     * @Param []
     * @Return java.util.List<xin.kevincheng.my.shop.domain.TbUser>
     * @Since 
     */
    public ArrayList<TbUser> selectAll();

    /**
     * @Author k5068
     * @Date 2019/12/3 4:34
     * @Description This is description of method get user info by user email from db
     * @Param []
     * @Return xin.kevincheng.my.shop.domain.TbUser
     * @Since
     */
    public TbUser getByEmail(String email);

    /**
     * @Author k5068
     * @Date 2019/12/2 21:08
     * @Description This is description of method insert user in db;
     * @Param []
     * @Return void
     * @Since
     */
    public void insert(TbUser tbUser);

}
