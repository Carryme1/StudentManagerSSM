package cn.wmyskxz.controller;

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
    public String login(HttpServletRequest request, HttpServletResponse response){
        String name = request.getParameter("name");
        if (name.equals(teacherService.getPasswordByName(name)))
            return "redirect:listStudent";
        else {
            try {
                response.sendError(0,"pwd error");
            } catch (IOException e) {
                e.printStackTrace();
            }
            return "index";
        }
    }


}
