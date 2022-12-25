package org.example.config;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DateSourceConfig {
    @Bean("dataSourceSecurity")
    public DataSource dataSourceSecurity() {
        DataSource ds = DataSourceBuilder.create()
                .password("root")
                .driverClassName("com.mysql.cj.jdbc.Driver")
                .url("jdbc:mysql://127.0.0.1:3306/security_token_database")
                .username("root").build();
        return ds;
    }
}
