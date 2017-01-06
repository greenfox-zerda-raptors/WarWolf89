package com.greenfox.csaba.reddit.configs;

import com.greenfox.csaba.reddit.domain.User;
import com.greenfox.csaba.reddit.domain.UserRepository;
import com.greenfox.csaba.reddit.domain.UserRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by almasics on 2017.01.06..
 */
@Service("customUserDetailService")
public class CustomUserDetailsService implements UserDetailsService {
    private final UserRepository userRepository;
    private final UserRoleRepository userRoleRepository;

    @Autowired
    public CustomUserDetailsService(UserRepository userRepository, UserRoleRepository userRoleRepository) {
        this.userRepository = userRepository;
        this.userRoleRepository = userRoleRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUserName(username);
        if (null == user) {
            throw new UsernameNotFoundException("No user present with the username");
        } else {
            List<String> userRoles = userRoleRepository.myfindRoleByUserName(username);
            return new CustomUserDetails(user, userRoles);
        }
    }
}
