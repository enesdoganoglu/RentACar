package com.bilgeadam.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public enum ErrorType {

    CAR_NOT_FOUND(2008,"Aradığınız veri veri tabanında bulunamadı", HttpStatus.NOT_FOUND),
    CUSTOMER_NOT_FOUND(2012, "Müşteri bulunamadı", HttpStatus.NOT_FOUND),

    COLOR_NOT_FOUND(2014,"Renk bulunamadı",HttpStatus.NOT_FOUND),
    BAD_REQUEST(4000,"Geçersiz istek ya da parametre", HttpStatus.BAD_REQUEST),
    ERROR_INVALID_TOKEN(3000,"Geçersiz token bilgisi", HttpStatus.UNAUTHORIZED),
    ERROR(9000, "Beklenmeyen bir hata oluştur. Lütfen tekrar deneyiniz.", HttpStatus.INTERNAL_SERVER_ERROR);

    int code;
    String message;
    HttpStatus httpStatus;

}
