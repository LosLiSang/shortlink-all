/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package top.lisang.admin.common.convention.exception;

import java.util.Optional;

import top.lisang.admin.common.convention.errorcode.BaseErrorCode;
import top.lisang.admin.common.convention.errorcode.IErrorCode;

/**
 *
 * @author root
 */
public class ServiceException extends AbstractException {

    public ServiceException(String message) {
        this(message, null, BaseErrorCode.SERVICE_ERROR);
    }

    public ServiceException(IErrorCode errorCode) {
        this(null, errorCode);
    }

    public ServiceException(String message, IErrorCode errorCode) {
        this(message, null, errorCode);
    }

    public ServiceException(String message, Throwable throwable, IErrorCode errorCode) {
        super(Optional.ofNullable(message).orElse(errorCode.message()), throwable, errorCode);
    }

    @Override
    public String toString() {
        return "ServerException {" +
                "code='" + errorCode + "'," +
                "message='" + errorMessage + "'" +
                '}';
    }

    
}
