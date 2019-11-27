package cn.wmyskxz.dao;

import cn.wmyskxz.entity.Teacher;

public interface TeacherDao {
    Teacher getTeacher(String name);
    void insertTeacher(Teacher teacher);

}
