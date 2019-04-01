package com.java.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
//自定义日志
@ControllerAdvice
public class ExceptionHandle {
    @ExceptionHandler(value ={Exception.class})
    public String handleException(Exception e) throws IOException {
        FileOutputStream os = new FileOutputStream("E:\\exception.log");
        PrintWriter pw = new PrintWriter(os);
        pw.write(e.getMessage());
        e.printStackTrace(pw);
        pw.close();
        os.close();
        return "redirect:pages/error/exception.jsp";
    }
}
