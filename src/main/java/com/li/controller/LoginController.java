package com.li.controller;

import com.li.bean.Record;
import com.li.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class LoginController {
    @Autowired
    private StudentService studentService;
    @Autowired
    private TeacherService teacherService;
    @Autowired
    private QuestionService questionService;
    @Autowired
    private PaperService paperService;
    @Autowired
    private ClasseService classeService;
    @Autowired
    private RecordService recordService;

    @RequestMapping("/")
    public String view(Model model){
        //查询所有用户
        int teas=teacherService.queryCountAll();
        int stus=studentService.queryCOuntALlstu();
        int allogers=teas+stus;
        //统计试题
        int allQues=questionService.queryCountAllQues();
        //统计试卷
        int allPaps=paperService.queryCountALlPaps();
        model.addAttribute("allPaps",allPaps);
        model.addAttribute("allQues",allQues);
        model.addAttribute("allogers",allogers);
        return "stage/prexam";
    }

    @RequestMapping("/index")
    public String index(Model model) {
        //查询所有用户
        int teas = teacherService.queryCountAll();
        int stus = studentService.queryCOuntALlstu();
        int alllogers = teas + stus;
        //统计试题
        int allQues = questionService.queryCountAllQues();
        //统计试卷
        int allPaps = paperService.queryCountALlPaps();
        List<Record> ScoreHStu = recordService.queryRankScoreRecord();
        List<Record> AccHStu = recordService.queryRankAccRecord();
        model.addAttribute("ScoreHStu",ScoreHStu);
        model.addAttribute("AccHStu",AccHStu);
        model.addAttribute("alllogers",alllogers);
        model.addAttribute("allPaps",allPaps);
        model.addAttribute("allQues",allQues);
        return "index";
    }
}
