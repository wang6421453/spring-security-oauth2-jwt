package com.wl.user;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

/**
 * Created by wl on 2018/3/30.
 */

@Component
public class MyUserDetailsService implements UserDetailsService{


    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        MyUser user = new MyUser();
        if("wl".equals(userName)){
            user.setUserName(userName);
            user.setPassword("123");
            return user;
        }else{
            throw new UsernameNotFoundException("用户不存在");
        }
    }
}
