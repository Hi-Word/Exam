package com.li.service.impl;


import com.li.bean.Teacher;
import com.li.mapper.TeacherMapper;
import com.li.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class TeacherServiceImpl implements TeacherService {
    @Autowired
    private TeacherMapper teacherMapper;

    @Override
    public List<Teacher> getAll() {
        return teacherMapper.queryAll();
    }

    @Override
    public void addTeacher(Teacher teacher) {
        teacherMapper.addTeacher(teacher);
    }

    @Override
    public Teacher getTeacherById(Integer id) {
        return teacherMapper.queryTeacherById(id);
    }

    @Override
    public void editTeacher(Teacher teacher) {
        teacherMapper.editTeacher(teacher);
    }

    @Override
    public void deleteTeacherById(Integer id) {
        teacherMapper.deleteTeacherById(id);
    }

    @Override
    public List<Teacher> queryTeacherNotAdvisor() {
        return teacherMapper.queryTeacherNotAdvisor();
    }

    @Override
    public Teacher check(Teacher teacher) {
        return teacherMapper.check(teacher);
    }

    @Override
    public int queryCountAll() {
        return teacherMapper.queryCountAll();
    }
}
