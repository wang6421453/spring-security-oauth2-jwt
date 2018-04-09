package com.wl.filter;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.wl.user.MyUser;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.jwt.Jwt;
import org.springframework.security.jwt.JwtHelper;
import org.springframework.security.web.authentication.WebAuthenticationDetails;
import org.springframework.util.StringUtils;
import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * Created by wl on 2018/4/9.
 */
public class JwtAuthenticationFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        String authToken = request.getParameter("access_token");
        if(!StringUtils.isEmpty(authToken)){
            Jwt jwt = JwtHelper.decode(authToken);
            String claims = jwt.getClaims();
            JSONObject jsonObject = JSON.parseObject(claims);
            JSONObject objUser = jsonObject.getJSONObject("user");
            MyUser user = objUser.toJavaObject(MyUser.class);
            UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(user, "", null);
            authenticationToken.setDetails(new WebAuthenticationDetails((HttpServletRequest) request));
            SecurityContextHolder.getContext().setAuthentication(authenticationToken);
        }
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {

    }
}
