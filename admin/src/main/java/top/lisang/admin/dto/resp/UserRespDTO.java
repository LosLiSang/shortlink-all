package top.lisang.admin.dto.resp;

import java.time.LocalDateTime;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import lombok.Data;
import top.lisang.admin.common.serialize.PhoneDesensitizationSerializer;

@Data
public class UserRespDTO {
    private Long id;

    private String username;

    private String realName;

    @JsonSerialize(using = PhoneDesensitizationSerializer.class)
    private String phone;

    private String mail;

    private Long deletionTime;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

    private boolean delFlag;
}
