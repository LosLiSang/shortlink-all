/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package top.lisang.admin.common.convention.exception;

import top.lisang.admin.common.convention.errorcode.IErrorCode;

/**
 *
 * @author root
 */
public class ClientException extends AbstractException {
    public ClientException(IErrorCode errorCode) {
        this(null, null, errorCode);
    }

    public ClientException(String msg) {
        this(msg, null, null);
    }

    public ClientException(String msg, IErrorCode errorCode) {
        this(msg, null, errorCode);
    }

    public ClientException(String msg, Throwable throwable, IErrorCode errorCode) {
        super(msg, throwable, errorCode);
    }

    @Override
    public String toString() {
        return "ClientException{" +
                "code='" + errorCode + "'," +
                "message='" + errorMessage + "'" +
                '}';
    }

}
