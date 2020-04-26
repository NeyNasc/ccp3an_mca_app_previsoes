package br.usjt.weatherforecast.Service;

import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


public class AppConfig implements WebMvcConfigurer {
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new LoginInterceptador()).addPathPatterns("/**").excludePathPatterns("/login", "/", "/fazerLogin");
	}

}
