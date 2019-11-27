package cn.wmyskxz.service;

import cn.wmyskxz.entity.Teacher;

public interface TeacherService {
    Teacher getTeacher(String name);
    void insertTeacher(Teacher teacher);
}
