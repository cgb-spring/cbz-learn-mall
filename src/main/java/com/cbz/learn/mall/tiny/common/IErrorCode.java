package com.cbz.learn.mall.tiny.common;


/**
 * 封装API的错误码
 */
public interface IErrorCode {
    long getCode();

    String getMessage();
}