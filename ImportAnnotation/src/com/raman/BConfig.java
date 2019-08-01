package com.raman;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(AConfig.class)
public class BConfig {
	
@Bean(name = "BConfiguration")
public B b()
{
	return new  B();
}
	

	
}