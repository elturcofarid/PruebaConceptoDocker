package co.gov.icfes.misional.cache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
@EnableCaching
@EnableAutoConfiguration
@RefreshScope
@EnableEurekaClient
//@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
public class CacheApplication{

	public static void main(String[] args) {
		SpringApplication.run(CacheApplication.class, args);
	}
	
}
