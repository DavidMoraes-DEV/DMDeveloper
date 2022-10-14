package com.dmdeveloper.portfolio.config;

import java.util.Arrays;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@Configuration
@EnableResourceServer
public class ResourceServerConfig extends ResourceServerConfigurerAdapter{

	private static final String[] PUBLIC = {"/**"};
	
	@Override
	public void configure(HttpSecurity http) throws Exception {
		
		http.authorizeRequests()
		.antMatchers(PUBLIC).permitAll()
		.antMatchers(HttpMethod.GET).permitAll();
		
		http.cors().configurationSource(corsConfigurationSource());
	}
	
	@Bean
	public CorsConfigurationSource corsConfigurationSource() {
	    CorsConfiguration corsConfig = new CorsConfiguration();
	    corsConfig.setAllowedOriginPatterns(Arrays.asList("*"));
	    corsConfig.setAllowedMethods(Arrays.asList("GET"));
	    
	    UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
	    source.registerCorsConfiguration("/**", corsConfig);
	    return source;
	}
	 
	@Bean
	public FilterRegistrationBean<CorsFilter> corsFilter() {
	    FilterRegistrationBean<CorsFilter> bean
	            = new FilterRegistrationBean<>(new CorsFilter(corsConfigurationSource()));
	    bean.setOrder(Ordered.HIGHEST_PRECEDENCE);
	    return bean;
	}
	
}
