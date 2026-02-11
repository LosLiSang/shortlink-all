package top.lisang.admin.common.convention;

import java.util.Optional;

import top.lisang.admin.common.convention.errorcode.BaseErrorCode;
import top.lisang.admin.common.convention.errorcode.IErrorCode;
import top.lisang.admin.common.convention.exception.AbstractException;

public final class Results {

    public static Result<Void> success() {
        return new Result<Void>().setCode(Result.SUCCESS_CODE);
    }

    public static <T> Result<T> success(T data) {
        return new Result<T>().setData(data).setCode(Result.SUCCESS_CODE);
    }

    public static Result<Void> failure() {
        return new Result<Void>()
                .setMessage(BaseErrorCode.SERVICE_ERROR.message())
                .setCode(BaseErrorCode.SERVICE_ERROR.code());
    }

    public static Result<Void> failure(AbstractException exception) {
        String errorCode = Optional.ofNullable(exception.getErrorCode()).orElse(BaseErrorCode.SERVICE_ERROR.code());
        String errorMessage = Optional.ofNullable(exception.getErrorMessage())
                .orElse(BaseErrorCode.SERVICE_ERROR.message());

        return new Result<Void>()
                .setCode(errorCode)
                .setMessage(errorMessage);
    }

    public static Result<Void> failure(IErrorCode errorCode) {
        return new Result<Void>()
                .setCode(errorCode.code())
                .setMessage(errorCode.message());
    }

    public static Result<Void> failure(String errorCode, String errorMessage) {
    return new Result<Void>()
            .setCode(errorCode)
            .setMessage(errorMessage);
    }

}
