package cn.wmyskxz.dao;

import cn.wmyskxz.entity.Teacher;

public interface TeacherDao {
    String getPasswordByName(String name);
    void insertTeacher(Teacher teacher);

}
