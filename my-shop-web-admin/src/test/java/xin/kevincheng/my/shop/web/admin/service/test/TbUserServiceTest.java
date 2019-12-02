package xin.kevincheng.my.shop.web.admin.service.test;

import cn.hutool.crypto.SecureUtil;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.util.DigestUtils;
import xin.kevincheng.my.shop.domain.TbUser;
import xin.kevincheng.my.shop.web.admin.service.TbUserService;

import java.util.Date;
import java.util.List;

/**
 * @author kc
 * @title
 * @description The class TbUserServiceTest is for
 * @date Create in 17:05 2019/12/2
 */
@ExtendWith(SpringExtension.class)
@ContextConfiguration({"classpath:spring-context.xml", "classpath:spring-context-druid.xml", "classpath:spring-context-mybatis.xml"})
public class TbUserServiceTest {

    @Autowired
    private TbUserService tbUserService;

    /**
     * @Author k5068
     * @Date 2019/12/2 21:06
     * @Description This is description of method test select all
     * @Param []
     * @Return void
     * @Since
     */
    @Test
    public void testSelectAll() {
        List<TbUser> tbUsers = tbUserService.selectAll();

        for (TbUser tbUser : tbUsers) {
            System.out.println(tbUser.getUsername());
        }
    }

    @Test
    public void testGetByEmail() {
        TbUser tbUser = tbUserService.loginByEmail("kevincheng@taoism-one.com", "123456");
        System.out.println(tbUser.getUsername());
    }

    /**
     * @Author k5068
     * @Date 2019/12/2 21:05
     * @Description This is description of method test insert user
     * @Param []
     * @Return void
     * @Since
     */
    @Test
    public void testInsertTbUser() {
        TbUser tbUser = new TbUser();
        tbUser.setUsername("KC");
        tbUser.setPhone("18888888888");
        tbUser.setEmail("kevincheng@taoism-one.com");
        tbUser.setPassword(SecureUtil.md5("123456"));
        tbUser.setCreated(new Date());
        tbUser.setUpdated(new Date());

        tbUserService.insertTbUser(tbUser);
    }

}
