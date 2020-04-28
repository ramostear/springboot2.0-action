package com.ramostear.springboot.uploadfile.valueobject;

/**
 * @ClassName Message
 * @Description TODO
 * @Author 树下魅狐
 * @Date 2020/4/28 0028 19:21
 * @Version since 1.0
 **/
public class Message {

    private String message;

    public Message(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
