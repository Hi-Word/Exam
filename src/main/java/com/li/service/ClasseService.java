package com.li.service;

import com.li.bean.Classe;

import java.util.List;

public interface ClasseService {
    //显示所有班级
    List<Classe> getAll();

    //添加一个班级信息
    void addClasse(Classe classe);

    //id查询班级
    Classe getClasseById(Integer id);

    //修改班级信息
    void editClasse(Classe classe);

    //删除指定id班级
    void deleteClasseById(Integer id);

    //根据教师id查询所有教师对应id
    Classe queryByTeacherId(Integer id);

    //查询所有class表中所有对应教师信息
    List<Classe> queryAllTeacherId();

    //根据id查询班级名称
    Classe queryClaNameById(int ckaId);

}

