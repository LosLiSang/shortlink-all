/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package top.lisang.admin.common.convention.exception;

import java.util.Optional;

import org.springframework.util.StringUtils;

import lombok.Getter;
import top.lisang.admin.common.convention.errorcode.IErrorCode;

/**
 *
 * @author root
 */
@Getter
public abstract class AbstractException extends RuntimeException {

    public final String errorCode;
    public final String errorMessage;

    public AbstractException(String msg, Throwable throwable, IErrorCode errorCode) {
        super(msg, throwable);
        this.errorCode = errorCode.code();
        this.errorMessage = Optional.ofNullable(StringUtils.hasLength(msg) ? msg : null).orElse(errorCode.message());
    }

}
