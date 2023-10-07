/*

package com.example.webtech.filter;

import com.example.webtech.Result.UsersResult;
import com.example.webtech.common.BaseContext;
import com.example.webtech.common.R;
import com.example.webtech.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.AntPathMatcher;
import com.alibaba.fastjson.JSON;
import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter(filterName = "loginCheckFilter",urlPatterns = "/*")
@Slf4j
public class loginCheckFilter implements Filter {
    //路径匹配器，支持通配符
    public static final AntPathMatcher PATH_MATCHER = new AntPathMatcher();

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse)  servletResponse;

        //获得本次请求的uri
        String requestURI = request.getRequestURI();

        log.info("拦截到请求:{}",requestURI);

        String[] urls = new String[]{
                "/img/**",
                "/js/**",
                "/css/**",
                "/.vscode",
                "/getCaptchaBase64",
                "/checkCaptcha",
                "/users/**",
                "/login.html",
                "/main.html",
                "/login",
                "/main",
                "/static/img/**"


        } ;

        boolean check = check(urls, requestURI);
        //不需要进行拦截的页面，直接返回即可
        if(check){
            log.info("本次请求{}不需要处理",requestURI);
            filterChain.doFilter(request,response);
            return;
        }
        //判断登录状态，如果已登录，直接放行
        if(request.getSession().getAttribute("user")!=null){
            log.info("用户已登录,用户ID为：{}",request.getSession().getAttribute("user"));

            Long empId = (Long) request.getSession().getAttribute("user");
            BaseContext.setCurrentId(empId);


            filterChain.doFilter(request,response);
            return;
        }

        log.info("用户未登录");
        //如果未登录到则返回未登录结果，通过输出流方式向客户端响应数据
        response.getWriter().write(JSON.toJSONString(R.error("NOTLOGIN")));
        return;

    }

    public boolean check(String[]urls,String requestURI){
        for (String url : urls){
            boolean match = PATH_MATCHER.match(url,requestURI);
            if(match){
                return true;
            }
        }
        return false;
    }
}

*/
