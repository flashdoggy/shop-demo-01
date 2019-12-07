package xin.kevincheng.my.shop.web.admin.service.impl;

import cn.hutool.core.util.StrUtil;
import cn.hutool.crypto.SecureUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xin.kevincheng.my.shop.commons.dao.BaseResult;
import xin.kevincheng.my.shop.domain.TbUser;
import xin.kevincheng.my.shop.web.admin.dao.TbUserDao;
import xin.kevincheng.my.shop.web.admin.service.TbUserService;

import java.util.ArrayList;
import java.util.Date;

/**
 * @author kc
 * @title
 * @description The class TbUserServceImpl is for
 * @date Create in 16:53 2019/12/2
 */
@Service
public class TbUserServiceImpl implements TbUserService {

    @Autowired
    public TbUserDao tbUserDao;

    @Override
    public ArrayList<TbUser> selectAll() {
        return tbUserDao.selectAll();
    }

    @Override
    public TbUser selectById(Long id) {
        return tbUserDao.getById(id);
    }

    @Override
    public BaseResult saveOrUpdateTbUser(TbUser tbUser, String confirmPassword, String originalPassword) {
        BaseResult baseResult = checkTbUser(tbUser);

        if (baseResult.getStatus() == 200) {
            tbUser.setUpdated(new Date());
            if (null == tbUser.id) {
                baseResult = checkConfirmPassword(tbUser, confirmPassword);
                if (baseResult.getStatus() == 200) {
                    tbUser.setPassword(SecureUtil.md5(tbUser.getPassword()));
                    tbUser.setCreated(new Date());
                    tbUserDao.insert(tbUser);

                    baseResult.setMessage("add user success!");
                }
            } else {
                TbUser dbTbUser = tbUserDao.getById(tbUser.getId());
                baseResult = checkOriginalPassword(dbTbUser, originalPassword);
                if (baseResult.getStatus() == 200) {
                    baseResult = checkConfirmPassword(tbUser, confirmPassword);
                    if (baseResult.getStatus() == 200) {
                        tbUserDao.update(tbUser);
                        baseResult.setMessage("update user success!");
                    }
                }
            }
        }

        return baseResult;
    }

    @Override
    public TbUser loginByEmail(String email, String password) {
        TbUser tbUser = tbUserDao.getByEmail(email);

        if (null != tbUser) {
            if (StrUtil.isNotBlank(password)
                && StrUtil.equals(tbUser.getPassword(), SecureUtil.md5(password))) {
                return tbUser;
            }
        }
        return null;
    }

    /**
     * @Author k5068
     * @Date 2019/12/7 19:30
     * @Description This is description of method base value check for user
     * @Param [tbUser]
     * @Return xin.kevincheng.my.shop.commons.dao.BaseResult
     * @Since
     */
    private BaseResult checkTbUser(TbUser tbUser) {
        BaseResult baseResult = BaseResult.success();

        if (StrUtil.isBlank(tbUser.getUsername())) {
            baseResult = BaseResult.fail("user name cannot be empty!");
        }

        return baseResult;
    }

    /**
     * @Author k5068
     * @Date 2019/12/7 19:31
     * @Description This is description of method password and confirm password match check
     * @Param [tbUser, password]
     * @Return xin.kevincheng.my.shop.commons.dao.BaseResult
     * @Since
     */
    private BaseResult checkConfirmPassword(TbUser tbUser, String password) {
        BaseResult baseResult = BaseResult.success();

        if (!StrUtil.equals(tbUser.getPassword(), password)) {
            baseResult = BaseResult.fail("confirm password not match");
        }

        return baseResult;
    }

    /**
     * @Author k5068
     * @Date 2019/12/7 19:31
     * @Description This is description of method user original password check
     * @Param [tbUser, password]
     * @Return xin.kevincheng.my.shop.commons.dao.BaseResult
     * @Since
     */
    private BaseResult checkOriginalPassword(TbUser tbUser, String password) {
        BaseResult baseResult = BaseResult.success();

        if (!StrUtil.equals(tbUser.getPassword(), SecureUtil.md5(password))) {
            baseResult = BaseResult.fail("original password is incorrect");
        }

        return baseResult;
    }
}
