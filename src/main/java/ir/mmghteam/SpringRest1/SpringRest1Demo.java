package ir.mmghteam.SpringRest1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@ConfigurationPropertiesScan
public class SpringRest1Demo {
    public static void main(String[] args) {
        SpringApplication.run(SpringRest1Demo.class, args);
    }
    @Bean
    @ConfigurationProperties(prefix="droid")
    Driod driod() {
        return new Driod();
    }
}

