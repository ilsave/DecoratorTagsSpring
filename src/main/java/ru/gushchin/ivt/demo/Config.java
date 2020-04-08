package ru.gushchin.ivt.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Configuration
public class Config {

    @Bean
    @Scope(value = "prototype")
    ReturnInterface returninterface(String line1){
        return  new FinalDecorator(new PrivateDecorator(new ProtectedDecorator(new PublicDecorator(new StaticDecorator(new VoidDecorator(new ReturnClass(new StringBuilder(line1))))))));
    }
}
