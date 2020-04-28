package com.ramostear.springboot.uploadfile.valueobject;

/**
 * @ClassName UploadFile
 * @Description TODO
 * @Author 树下魅狐
 * @Date 2020/4/28 0028 18:48
 * @Version since 1.0
 **/
public class UploadFile {

    private String fileName;
    private String url;

    public UploadFile(String fileName, String url) {
        this.fileName = fileName;
        this.url = url;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
