package com.li.mapper;


import com.li.bean.Paper;
import com.li.bean.Question;
import com.li.bean.QuestionPaper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
@Mapper
public interface PaperMapper {
    List<Paper> queryAll();

    //添加当前考试页信息
    void  addPaper(Paper pager);

    //获取Paper当前页id
    Paper queryPaperById(Integer id);

    //配置Paper信息
    void editPaper(Paper paper);

    //删除当前页id信息
    void deletePaperById(Integer id);


    List<Paper> queryPaperNotAdvisor();

    //获取考题id
    List<Question> queryALlQuestionId();

    //获取当前题目id
    List<QuestionPaper> paperQueryALlQuestionById(Integer id);

    //获取当前题目所有id
    List<Question> queryALlQuestionIdInPaperById(Integer paperId);

    //获取当前页面名id
    Paper queryPaperNameById(Integer id);

    void AddQuestionToPaperById(QuestionPaper questionPaper);

    //通过考题id，删除内容
    void detachQuestionById(Integer qpId);
    @Select("select count(*) from paper")
    int queryCountALlPaps();

    List<QuestionPaper> paperQueryALlQuestionByIdOrderByType(Integer id);

    List<QuestionPaper> paperQueryALlQuestionIDByPaperIdOrderByType(Integer paperId);
}
