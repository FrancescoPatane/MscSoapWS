package it.niuma.mscsoapws;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.sql2o.Sql2o;

@SpringBootApplication
public class MscsoapwsApplication {
	
	@Bean
	Sql2o sql2o(DataSource dataSource) {
		return new Sql2o(dataSource);
	}

	public static void main(String[] args) {
		SpringApplication.run(MscsoapwsApplication.class, args);
	}

}

