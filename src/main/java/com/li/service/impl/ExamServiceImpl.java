package com.li.service.impl;

import com.li.bean.Exam;
import com.li.mapper.ExamMapper;
import com.li.service.ExamService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExamServiceImpl implements  ExamService {

    @Autowired
    private ExamMapper examMapper;

    @Override
    public List<Exam> getAll() {
        return examMapper.queryAll();
    }

    @Override
    public int queryCOuntALlExam() {
        return 0;
    }

    @Override
    public void AddExam(Exam exam) {
        examMapper.AddExam(exam);
    }

    @Override
    public Exam getExamById(Integer id) {
        return examMapper.getExamById(id);
    }

    @Override
    public void EditExam(Exam exam) {
        examMapper.EditExam(exam);
    }

    @Override
    public void deleteById(Integer id) {
        examMapper.deleteById(id);
    }

    @Override
    public List<Exam> getAllS() {
        return examMapper.getAllS();
    }

}
