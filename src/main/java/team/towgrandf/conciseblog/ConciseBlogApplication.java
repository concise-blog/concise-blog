package team.towgrandf.conciseblog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 博客启动类
 */
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class ConciseBlogApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConciseBlogApplication.class, args);
    }

}
