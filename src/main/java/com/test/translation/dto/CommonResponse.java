package com.test.translation.dto;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.With;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Data
public class CommonResponse<T> {
    String code = "0";
    String time = LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME);
    T data;
    String message = "success";
    public static <T>CommonResponse<T> ok(T data){
        CommonResponse<T> tCommonResponse = new CommonResponse<>();
        tCommonResponse.setData(data);
        return tCommonResponse;
    }

    public static <T>CommonResponse<T> error(String code, String message){
        CommonResponse<T> tCommonResponseBuilder = new CommonResponse<T>();
        tCommonResponseBuilder.setCode(code);
        tCommonResponseBuilder.setTime(message);
        return tCommonResponseBuilder;
    }

}
