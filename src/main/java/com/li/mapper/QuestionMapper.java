package com.li.mapper;


import com.li.bean.PapIdQuesCourse;
import com.li.bean.Question;
import com.li.bean.QuestionPaper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
@Mapper
public interface QuestionMapper {
    //将Question字段的内容存储道List容器中
    List<Question> queryAll(Question question);

    //添加试题字段内容
    void addQuestion(Question question);

    //通过试题id获取信息
    Question queryQuestionById(Integer id);

    //配置试题信息
    void editQuestion(Question question);

    //通过id删除试题
    void deleteQuestionById(Integer id);

    List<Question> queryAllType();

    List<Question> queryAllCourse();

    int queryAllQuestionNums();

    List<Map> queryNumOfQuestionType();

    List<Question> queryAllQueIdNotInPaperById(PapIdQuesCourse papid);

    int AddAllQues(List<QuestionPaper> questionPapers);

    //选择试题信息
    int queryIdByPapQue(Integer[] ques);
    @Select("select count(*) from question")
    int queryCountAllQues();
}
