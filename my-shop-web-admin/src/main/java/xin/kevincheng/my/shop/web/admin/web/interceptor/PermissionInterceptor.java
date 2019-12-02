package xin.kevincheng.my.shop.web.admin.web.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import xin.kevincheng.my.shop.commons.constant.ConstantUtils;
import xin.kevincheng.my.shop.domain.TbUser;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author kc
 * @title
 * @description The class PermissionInterceptor is for
 * @date Create in 23:09 2019/10/30
 */
public class PermissionInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        if (modelAndView.getViewName().endsWith("login")) {
            TbUser tbUser = (TbUser) request.getSession().getAttribute(ConstantUtils.SESSION_USER);

            if (tbUser != null) {
                response.sendRedirect("/main");
            }
        }
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
