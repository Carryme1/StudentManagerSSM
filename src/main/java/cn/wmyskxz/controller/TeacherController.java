package cn.wmyskxz.controller;

import cn.wmyskxz.entity.Teacher;
import cn.wmyskxz.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping("")
public class TeacherController {

    @Autowired
    TeacherService teacherService;
    @RequestMapping("/login")
    public String login(HttpServletRequest request,HttpServletResponse response) throws IOException {
        String name = request.getParameter("name");
        String pwd = request.getParameter("password");
        Teacher teacher = teacherService.getTeacher(name);
        if(teacher==null){
            return "login";
        }
        if(teacher.getPassword().equals(pwd))
            return "redirect:listStudent";
        return "login";
    }


}
