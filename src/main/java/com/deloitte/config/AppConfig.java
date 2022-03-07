package com.deloitte.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import com.deloitte.dao.UserDao;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = "com.deloitte")
@PropertySource(value = "classpath:dbconfig.properties")
public class AppConfig {
	
@Autowired
private Environment dbEnvironemt;	
	
@Bean	
public InternalResourceViewResolver resolver() {
	
	InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
	viewResolver.setViewClass(JstlView.class);
	viewResolver.setPrefix("/WEB-INF/views/");
	viewResolver.setSuffix(".jsp");
	return viewResolver;
}	


private DriverManagerDataSource getDBConnection() {
	
	DriverManagerDataSource dbConnection = new DriverManagerDataSource();
	dbConnection.setDriverClassName(dbEnvironemt.getProperty("mysql.db.drivermanager.class"));
	dbConnection.setUrl(dbEnvironemt.getProperty("mysql.db.dburl"));
	dbConnection.setUsername(dbEnvironemt.getProperty("mysql.db.username"));
	dbConnection.setPassword(dbEnvironemt.getProperty("mysql.db.password"));
	
	return dbConnection;
}


@Bean
public JdbcTemplate getConnectionDatabase() {
	return new JdbcTemplate(getDBConnection());
}

@Bean
public UserDao getUserDAOObject() {
	return new UserDao();
}

	

}
