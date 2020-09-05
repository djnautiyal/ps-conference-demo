package com.djspring.conferencedemo.config;

import ch.qos.logback.classic.net.SyslogAppender;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class PersistenceConfiguration {
    @Value("${DB_URL}")
    String db_url;

    @Value("${DB_USER}")
    String db_user;

    @Value("${DB_PSWD}")
    String db_pswd;

    @Bean
    public DataSource dataSource(){
        DataSourceBuilder builder = DataSourceBuilder.create();
        builder.url(db_url).username(db_user).password(db_pswd);
        return builder.build();

    }
}
