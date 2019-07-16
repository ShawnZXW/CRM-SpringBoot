package com.shsxt.config;

import com.shsxt.crm.interceptors.LoginIntercepter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * 添加MvcConfig 配置类  生效拦截器
 *
 * @author Shawn
 * @date 2019-07-16 19:18
 */
@Configuration
public class MvcConfig extends WebMvcConfigurerAdapter {

    @Bean
    public LoginIntercepter loginIntercepter() {
        return new LoginIntercepter();
    }

    /**
     * 拦截与放行配置
     *
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(loginIntercepter()).addPathPatterns("/**")
                .excludePathPatterns("/user/userLogin", "/index", "/css/*", "/images/*", "/jquery-easyui-1.3.3/*", "/js/*", "/zTree_v3-3.5.32/*");
    }
}
