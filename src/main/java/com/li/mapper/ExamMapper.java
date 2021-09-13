package com.li.mapper;

import com.li.bean.Exam;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
@Mapper
public interface ExamMapper {
    //获取考试字段信息
    List<Exam> queryAll();

    //sql语句选择全部
    Exam check(Exam exam);
    @Select("select count(*) from exam")
    int queryC0untAllstu();

    //添加考试信息
    void AddExam(Exam exam);

    //获取考试Id
    Exam getExamById(Integer id);

    //配置考试信息
    void EditExam(Exam exam);

    //通过考试id删除考试信息
    @Delete("delete from exam where exam_id=#{id}")
    void deleteById(Integer id);

    //通过List获取所有的考试信息id
    List<Exam> queryAllExamById(Integer id);

    List<Exam> getAllS();

}
