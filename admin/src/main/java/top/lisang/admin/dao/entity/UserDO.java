package top.lisang.admin.dao.entity;

import java.time.LocalDateTime;

import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;

@Data
@TableName("t_user")
public class UserDO {
    
    private Long id;

    private String username;

    private String password;

    private String realName;

    private String phone;

    private String mail;

    private Long deletionTime;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

    private boolean delFlag;

}
