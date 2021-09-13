package com.li.mapper;


import com.li.bean.Classe;
import com.li.bean.Record;
import com.li.bean.RecordExam;
import com.li.bean.Toscore;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface RecordMapper {
    void addRecord(Record record);

    List<Record> queryAll();


    //删除id对应的试题信息
    @Delete("delete from record where record_id=#{id}")
    void deleteById(Integer id);

    List<Record> queryAllExamById(Integer id);

    //选择paper_id，获取信息
    @Select("select paper_id from record where record_id=#{id}")
    Integer queryByRecordId(Integer id);

    //获取问题答案
    @Select("select record_answer from record where record_id=#{id}")
    String queryAnsByRecordId(Integer id);

    List<Record> queryRankScoreRecord();

    List<Record> queryRankAccRecord();

    List<Record> queryAllExam();

    List<Classe> queryAllClass(String exaName);

    int queryAllScore(RecordExam recordExam);

    int queryAccScore(RecordExam recordExam);

    void AddToScore(Toscore toscore);

    int queryBooleanToscore(Integer paperId);

    int queryToscore(int paperId);
}
