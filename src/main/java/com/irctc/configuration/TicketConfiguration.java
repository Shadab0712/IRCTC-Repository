package com.irctc.configuration;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TicketConfiguration {

	@Bean
	public ModelMapper getModelMapper() {
		return new ModelMapper();
	}
}

