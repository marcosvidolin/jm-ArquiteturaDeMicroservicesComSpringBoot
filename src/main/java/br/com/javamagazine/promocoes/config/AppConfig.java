package br.com.javamagazine.promocoes.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("br.com.javamagazine.promocoes.domain")
@EnableJpaRepositories("br.com.javamagazine.promocoes.repository")
@ComponentScan({ "br.com.javamagazine.promocoes.service", "br.com.javamagazine.promocoes.controller" })
public class AppConfig {

	public static void main(String[] args) {
		SpringApplication.run(AppConfig.class, args);
	}

}
