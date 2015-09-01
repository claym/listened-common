package io.listened.common;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.Properties;

/**
 * Created by Clay on 8/31/2015.
 */
@Configuration
@EnableTransactionManagement
public class TestConfig {

        @Bean
        public DataSource dataSource() {
            return new EmbeddedDatabaseBuilder().setType(EmbeddedDatabaseType.H2)
                    .setName("Nuts").build();
        }

        @Bean
        public LocalSessionFactoryBean sessionFactoryBean() {
            LocalSessionFactoryBean result = new LocalSessionFactoryBean();
            result.setDataSource(dataSource());
            result.setPackagesToScan(new String[] { "io.listened.common" });

            Properties properties = new Properties();
            properties.setProperty("hibernate.hbm2ddl.auto", "create-drop");
            result.setHibernateProperties(properties);
            return result;
        }

        @Bean
        public SessionFactory sessionFactory() {
            return sessionFactoryBean().getObject();
        }

        @Bean
        public HibernateTransactionManager transactionManager() {
            HibernateTransactionManager man = new HibernateTransactionManager();
            man.setSessionFactory(sessionFactory());
            return man;
        }

}
