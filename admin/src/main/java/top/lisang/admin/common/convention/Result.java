/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package top.lisang.admin.common.convention;

import java.io.Serial;
import java.io.Serializable;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 *
 * @author root
 */
@Data
@Accessors(chain = true)
public class Result<T> implements Serializable {

    @Serial
    private static final long serialVersionUID = 5679018624309023727L;

    public static final String SUCCESS_CODE = "0";

    private String code;

    private String message;

    private T data;

    private String requestId;

    public boolean isSuccess() {
        return SUCCESS_CODE.equals(code);
    }

}
