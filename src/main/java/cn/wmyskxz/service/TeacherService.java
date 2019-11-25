package cn.wmyskxz.service;

import cn.wmyskxz.entity.Teacher;

public interface TeacherService {
    String getPasswordByName(String name);
    void insertTeacher(Teacher teacher);
}
