package xin.kevincheng.my.shop.web.admin.web.interceptor;

import cn.hutool.json.JSONArray;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import xin.kevincheng.my.shop.commons.constant.ConstantUtils;
import xin.kevincheng.my.shop.domain.TbUser;
import xin.kevincheng.my.shop.web.admin.utils.BreadCrumbUtils;

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

        // add generated bread crumb links in viewModel
        modelAndView.addObject("breadCrumbLinks", JSONUtil.parseArray(BreadCrumbUtils.getBreadCrumbLinks(request)));
        // add link active
        modelAndView.addObject("activeLink", request.getRequestURL());

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
    }
}
