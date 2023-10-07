package com.example.webtech.Controller;

import com.example.webtech.Mapper.VeriMapper;
import com.example.webtech.Result.UsersResult;
import com.example.webtech.Result.VeriResult;
import com.example.webtech.entity.Verification;
import com.example.webtech.service.UserService;
import com.example.webtech.service.VeriService;
import com.mysql.cj.jdbc.Blob;
import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.Map;

@Controller
@RequestMapping("/users")
public class VeriController {
    @Autowired
    private VeriService veriService;

    @RequestMapping("/login01")
    @ResponseBody
    public VeriResult img(String id){
        return veriService.findByImg(id);
    }
}
