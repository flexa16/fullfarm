package by.flex;


import org.springframework.cglib.core.internal.Function;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.web.servlet.config.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;


@Configuration
@EnableWebMvc
public class WebMvcConfiguration extends WebMvcConfigurerAdapter {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/home").setViewName("welcome");
    }

    @Bean
    public Function<String, String> currentUrlWithoutParam() {
        return param ->   ServletUriComponentsBuilder.fromCurrentRequest().replaceQueryParam(param).toUriString();
    }

}
