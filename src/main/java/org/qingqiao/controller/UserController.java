package org.qingqiao.controller;

import org.qingqiao.bean.User;
import org.qingqiao.service.UserService;
import org.qingqiao.utils.FileUpload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Controller
public class UserController {
    private SimpleDateFormat sdf = new SimpleDateFormat("/yyyy/MM/dd/");
    @Autowired
    private UserService userService;

    @RequestMapping("/list")
    public String queryAll(Model model){
        List<User> list = userService.queryAll();
        model.addAttribute("list",list);
        return "list";
    }

    @RequestMapping("add")
    public String add(MultipartFile uploadfile, HttpServletRequest req, User user){
        String imgurl = FileUpload.fileupload(uploadfile, req);
        user.setImgurl(imgurl);
        int i = userService.add(user);
        return "redirect:list";
    }

    @RequestMapping("add2")
    @ResponseBody
    public String add2(MultipartFile uploadfile, HttpServletRequest req, User user){
        String imgurl = FileUpload.fileupload(uploadfile, req);
        user.setImgurl(imgurl);
        int i = userService.add(user);
        return "i > 0";
    }
}
