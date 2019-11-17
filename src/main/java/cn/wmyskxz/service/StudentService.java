package cn.wmyskxz.service;

import cn.wmyskxz.entity.Student;

import java.util.List;

public interface StudentService {
    int getTotal();

    void addStudent(Student student);

    void deleteStudent(int id);

    void updateStudent(Student student);

    Student getStudent(int id);

    List<Student> list(int start, int end);
}
