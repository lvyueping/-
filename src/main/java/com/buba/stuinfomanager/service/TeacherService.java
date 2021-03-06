package com.buba.stuinfomanager.service;

import com.buba.stuinfomanager.pojo.Teacher;
import com.buba.stuinfomanager.util.ResultUtil;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface TeacherService {
    PageInfo<Teacher> findAllTeacher(Integer page, Integer limit,String t_num,String name);

    void deleteOneTeacher(Integer t_id);

    Teacher selectOneById(Integer t_id);

    void update(Teacher teacher);

    void add(Teacher teacher);

    void deleteMore(String[] ids);

    ResultUtil exportData(List<Teacher> list);
}
