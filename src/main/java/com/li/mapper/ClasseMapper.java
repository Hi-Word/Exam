package com.li.mapper;


import com.li.bean.Classe;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface ClasseMapper {
    //查询所有班级
    List<Classe> queryAll();

    //添加班级
    void addClasse(Classe classe);

    //获取班级id
    Classe queryClasseById(Integer  id);

    //通过班级id删除
    void deleteClasseById(Integer id);

    //编辑班级信息
    void editClasse(Classe classe);

    //班级班级教师对应id
    Classe queryByTeacherId(Integer id);

    //获取所有的教师id
    List<Classe> queryAllTeacherId();

    //获取班级名id
    Classe queryClaNameById(int claId);
}
