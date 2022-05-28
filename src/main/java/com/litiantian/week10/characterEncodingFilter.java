package com.litiantian.week10;

package com.litiantian.Filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class characterEncodingFilter implements Filter {
    @@ -12,11 +13,20 @@ public void init(FilterConfig filterConfig) throws ServletException {
        @Override
        public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
            servletRequest.setCharacterEncoding("utf-8");
            servletResponse.setCharacterEncoding("utf-8");
            servletResponse.setContentType("text/html; charset=UTF-8");
//        servletResponse.setCharacterEncoding("utf-8");

//        servletResponse.setContentType("text/html; charset=UTF-8");
//        System.out.println("characterEncodingFilter执行前......\n");
            filterChain.doFilter(servletRequest, servletResponse);
//        filterChain.doFilter(servletRequest, servletResponse);
//        System.out.println("characterEncodingFilter执行后......\n");
            HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
            String url = httpServletRequest.getRequestURI();
            if(url.endsWith(".css") || url.endsWith(".js") || url.endsWith(".png")) {

            } else {
                servletResponse.setContentType("text/html;charset=utf-8");
            }
            filterChain.doFilter(servletRequest, servletResponse);
        }

        @Override
