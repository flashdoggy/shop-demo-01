package xin.kevincheng.my.shop.commons.util;

import cn.hutool.core.lang.Validator;

/**
 * @author kc
 * @title
 * @description The class DataValidatorUtils is for
 * @date Create in 21:06 2019/12/9
 */
public class DataValidatorUtils {

    public static boolean checkEmail(String email) {
        return Validator.isEmail(email);
    }

    public static boolean checkPhone(String mobile) {
        return Validator.isMobile(mobile);
    }

}
