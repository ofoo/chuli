package top.fengyulou.chuli;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.LocaleResolver;
import top.fengyulou.chuli.config.MyLocaleResolver;

@SpringBootApplication
public class ChuliApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChuliApplication.class, args);
    }


    @Bean
    public LocaleResolver localeResolver() {
        return new MyLocaleResolver();
    }
}