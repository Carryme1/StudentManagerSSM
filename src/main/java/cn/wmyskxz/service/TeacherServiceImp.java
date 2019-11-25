package cn.wmyskxz.service;

import cn.wmyskxz.dao.TeacherDao;
import cn.wmyskxz.entity.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherServiceImp implements TeacherService {
    @Autowired
    TeacherDao teacherDao;
    public String getPasswordByName(String name) {
        return teacherDao.getPasswordByName(name);
    }

    public void insertTeacher(Teacher teacher) {
        teacherDao.insertTeacher(teacher);
    }
}
