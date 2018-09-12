package com.bonaparte;

import com.bonaparte.interfac.UserDao;
import com.bonaparte.service.UserDaoImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.ehcache.EhCacheCacheManager;
import org.springframework.cache.ehcache.EhCacheManagerFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;

/**
 * Created by yangmingquan on 2018/9/11.
 */
@SpringBootApplication
@EnableCaching
public class Application {
    public Application() {

    }

    @Bean
    public UserDao userDao() {
        return new UserDaoImpl();
    }

    @Bean
    public CacheManager cacheManager() {
        return new EhCacheCacheManager(ehCacheCacheManager().getObject());
    }

    @Bean
    public EhCacheManagerFactoryBean ehCacheCacheManager() {
        EhCacheManagerFactoryBean cmfb = new EhCacheManagerFactoryBean();
        cmfb.setConfigLocation(new ClassPathResource("ehcache.xml"));
        cmfb.setShared(true);
        return cmfb;
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
