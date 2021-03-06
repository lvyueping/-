package com.buba.stuinfomanager.service;

import com.buba.stuinfomanager.pojo.CardStu;
import com.buba.stuinfomanager.pojo.Classes;
import com.buba.stuinfomanager.pojo.Student;
import com.buba.stuinfomanager.pojo.Teacher;
import com.buba.stuinfomanager.util.ResultUtil;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface ClassesService {
    //查询所有班级
    PageInfo<Classes> selAllClasses(String class_name, String headmaster, String teacher,
                                    Integer page, Integer limit);

    //查询单个班级
    Classes selOneClasses(Integer class_id);

    //查询单个班级的班干部
    PageInfo<Student> selClassCadre(Integer class_id, Integer page, Integer limit);

    //查询单个班级的学生
    List<Student> selClassStudent(Integer class_id);

    //添加一个班级
    void insClasses(Classes classes);

    //删除一个班级
    void delClasses(Integer class_id);

    //删除多个班级
    void delMoreClasses(String[] ids);

    //修改一个班级
    void updClasses(Classes classes);

    //修改学生班干部职位
    void updStuCard(CardStu cardStu);

    //添加学生班干部职位
    void insStuCard(Integer stu_id, Integer class_id, Integer card_id);

    //删除学生班干部职位
    void delStuCard(CardStu delStuCard);

    //查询当前学生
    CardStu selOneCardStudent(Integer stu_id);

    //查询所有老师
    List<Teacher> selAllClassTeacher();

    List<Teacher> selAllClassHeadmaster();

    //导入Excel
    ResultUtil importExcel(MultipartFile file) throws IOException;

    //导出数据
    ResultUtil exportData(List<Classes> classes);
}
