package com.spbt.controller;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * @author lx
 * @date 2023-08-15
 */
@RequestMapping("/fileController")
public class FileController {

    // 文件存储位置   可以另开一个tomcat来作为文件存储服务器
    private final static String FILESERVER = "http://127.0.0.1:8090/upload/";

    @RequestMapping("/upload")
    @ResponseBody
    public Map<String, String> upload(MultipartFile headPhoto, HttpServletRequest req) throws IOException {
        Map<String, String> map = new HashMap<>();
        // 指定文件存储目录为我们项目部署环境下的upload目录
        String realPath = req.getServletContext().getRealPath("/upload");
        File dir = new File(realPath);
        // 如果不存在则创建目录
        if (!dir.exists()) {
            dir.mkdirs();
        }
        // 获取文件名
        String originalFilename = headPhoto.getOriginalFilename();
        // 避免文件名冲突,使用UUID替换文件名
        String uuid = UUID.randomUUID().toString();
        // 获取拓展名
        String extendsName = originalFilename.substring(originalFilename.lastIndexOf("."));
        // 新的文件名
        String newFileName = uuid.concat(extendsName);
        // 创建 sun公司提供的jersey包中的client对象
        Client client = Client.create();
        WebResource resource = client.resource(FILESERVER + newFileName);
        //  文件保存到另一个服务器上去了
        resource.put(String.class, headPhoto.getBytes());
        // 上传成功之后,把文件的名字和文件的类型返回给浏览器
        map.put("message", "上传成功");
        map.put("newFileName", FILESERVER + newFileName);
        map.put("filetype", headPhoto.getContentType());
        return map;
    }
}
