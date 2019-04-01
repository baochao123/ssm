package com.java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartRequest;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Controller
public class UploadController {

    //@RequestParam(name=“currpage”required = false,defaultValue = "1")分页当前页默认值为为1
    //假如文件传过来的name值和file不同，在前面加@RequestParam(name=“name值”）
    //1.单文件上传
    @RequestMapping("/upload.do")
    public @ResponseBody String uploadFile(MultipartFile file){
        try {
            String originalFilename = file.getOriginalFilename();
            //得到文件的后缀名
            String suffix = originalFilename.substring(originalFilename.lastIndexOf("."));
            String format = new SimpleDateFormat("yyyyMMdd\\HH\\mm\\ss").format(new Date());
            File newfile = new File("E:\\upload\\" + format);
            if(!newfile.exists()){
                newfile.mkdirs();//如果文件不存在，就创建文件夹
            }
            UUID uuid = UUID.randomUUID();
            File filePath = new File(newfile, "\\" + uuid + suffix);
            file.transferTo(filePath);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "666";
    }
    //2.多文件上传
    //jsp页面改成multipart name=“files”
    //参数MultipartRequest mr
    //List<MultipartFile> file = mr.getFiles("files");
    //在遍历集合得到每一个文件名，再按照上面的单文件存就行了
    @RequestMapping("/uploads.do")
    public @ResponseBody String uploadFile(MultipartRequest mr){
        try {
            List<MultipartFile> files = mr.getFiles("files");
            for (MultipartFile file : files) {
                String originalFilename = file.getOriginalFilename();
                //得到文件的后缀名
                String suffix = originalFilename.substring(originalFilename.lastIndexOf("."));
                String format = new SimpleDateFormat("yyyyMMdd\\HH\\mm\\ss").format(new Date());
                File newfile = new File("E:\\upload\\" + format);
                if(!newfile.exists()){
                    newfile.mkdirs();//如果文件不存在，就创建文件夹
                }
                UUID uuid = UUID.randomUUID();
                File filePath = new File(newfile, "\\" + uuid + suffix);
                file.transferTo(filePath);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return "666";
    }
}
