package xin.kevincheng.my.shop.web.admin.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xin.kevincheng.my.shop.domain.TbUser;
import xin.kevincheng.my.shop.web.admin.dao.TbUserDao;
import xin.kevincheng.my.shop.web.admin.service.TbUserService;

import java.util.List;

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
    public List<TbUser> selectAll() {
        return tbUserDao.selectAll();
    }

    @Override
    public void insertTbUser(TbUser tbUser) {
        tbUserDao.insert(tbUser);
    }
}
