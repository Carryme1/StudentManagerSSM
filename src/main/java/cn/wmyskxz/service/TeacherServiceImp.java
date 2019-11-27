package cn.wmyskxz.service;

import cn.wmyskxz.dao.TeacherDao;
import cn.wmyskxz.entity.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherServiceImp implements TeacherService {
    @Autowired
    TeacherDao teacherDao;
    public String getTeacher(String name) {
        return teacherDao.getTeacher(name);
    }

    public void insertTeacher(Teacher teacher) {
        teacherDao.insertTeacher(teacher);
    }
}
