package top.lisang.admin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("top.lisang.admin.dao.mapper")
public class ShortlinkAdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(ShortlinkAdminApplication.class, args);
    }
}
