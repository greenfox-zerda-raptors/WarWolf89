package com.greenfox.csaba.reddit;

/**
 * Created by almasics on 2017.01.05..
 */

import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


@Configuration
public class WebConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        super.addViewControllers(registry);
        registry.addViewController("/login").setViewName("/login");
//        registry.addViewController("/posts/addPage").setViewName("addPage");
        registry.setOrder(Ordered.HIGHEST_PRECEDENCE);
    }
    

}
