package top.lisang.admin.dto.resp;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class UserActualRespDTO {
    private Long id;

    private String username;

    private String realName;

    private String phone;

    private String mail;

    private Long deletionTime;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

    private boolean delFlag;
}
