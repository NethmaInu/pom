package com.springbootaccadamy.batch8.pos1.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class ModelMapperConfig {


        @Bean
        public ModelMapper modelMapper(){
            return new ModelMapper();

    }

}
