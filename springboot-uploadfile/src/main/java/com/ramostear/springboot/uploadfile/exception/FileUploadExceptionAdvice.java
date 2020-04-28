package com.ramostear.springboot.uploadfile.exception;

import com.ramostear.springboot.uploadfile.valueobject.Message;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.multipart.MaxUploadSizeExceededException;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/**
 * @ClassName FileUploadExceptionAdvice
 * @Description TODO
 * @Author 树下魅狐
 * @Date 2020/4/28 0028 19:10
 * @Version since 1.0
 **/
@ControllerAdvice
public class FileUploadExceptionAdvice extends ResponseEntityExceptionHandler {

    @ExceptionHandler(MaxUploadSizeExceededException.class)
    public ResponseEntity<Message> handleMaxUploadSizeExceededException(MaxUploadSizeExceededException e){
       return ResponseEntity.badRequest().body(new Message("Upload file too large."));
    }
}
