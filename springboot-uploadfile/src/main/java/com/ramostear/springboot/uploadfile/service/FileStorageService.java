package com.ramostear.springboot.uploadfile.service;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

import java.nio.file.Path;
import java.util.stream.Stream;

/**
 * @ClassName FileStorageService
 * @Description TODO
 * @Author 树下魅狐
 * @Date 2020/4/28 0028 18:35
 * @Version since 1.0
 **/
public interface FileStorageService {

    void init();

    void save(MultipartFile multipartFile);

    Resource load(String filename);

    Stream<Path> load();

    void clear();

}
