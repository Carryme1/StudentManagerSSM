package cn.wmyskxz.dao;

import cn.wmyskxz.entity.Teacher;

public interface TeacherDao {
    String getTeacher(String name);
    void insertTeacher(Teacher teacher);

}
