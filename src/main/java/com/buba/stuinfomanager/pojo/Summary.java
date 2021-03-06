package com.buba.stuinfomanager.pojo;

import java.io.Serializable;

/**
 * @description:
 * @author: liYong
 * @createDate: 2019/12/11
 * @remark:  学生每日总结表
 */
public class Summary implements Serializable {

    public final static Integer sum_eduRec_army_yes = 1;
    public final static Integer sum_eduRec_army_no = 0;
    public final static Integer sum_eduRec_tradition_yes = 1;
    public final static Integer sum_eduRec_tradition_no = 0;
    public final static Integer sum_eduRec_school_yes = 1;
    public final static Integer sum_eduRec_school_no = 0;
    public final static Integer sum_eduRec_workplace_yes = 1;
    public final static Integer sum_eduRec_workplace_no = 0;
    public final static Integer sum_eduRec_politics_yes = 1;
    public final static Integer sum_eduRec_politics_no = 0;
    public final static Integer sum_state_authstr = 2;
    public final static Integer sum_state_done = 1;
    public final static Integer sum_state_undone = 0;
    private static final long serialVersionUID = -7081481607937392711L;

    private Integer sum_id;  //每日总结主键
    private String sum_time;  //总结的日期
    private String sum_plan;  //项目进度
    private String sum_techGrasp;  //技术掌握进度
    private String sum_techExpand;  //技术拓展
    private String sum_growth;  //我的成长
    private String sum_break;  //违纪情况
    private String sum_shortcoming;  //我的不足
    private Integer sum_eduRec_army;  //军队文化教育情况： 0 没上； 1上了
    private Integer sum_eduRec_tradition;  //传统文化教育情况： 0 没上； 1上了
    private Integer sum_eduRec_school;  //学校文化教育情况： 0 没上； 1上了
    private Integer sum_eduRec_workplace;  //职场文化教育情况： 0 没上； 1上了
    private Integer sum_eduRec_politics;  //政治思想文化教育情况： 0 没上； 1上了
    private String sum_eduRec_thoughts;  //教育课感悟
    private Integer sum_state;  //总结状态  0未总结  1已总结  2待审核
    private String class_name;  //用来映射的
    private Integer stu_id;
    private String stu_name;
    private String stu_num;
    private String tea_name;
    private Student student;  //外键学生表
    private Teacher teacher;

    public Summary(String sum_time, String sum_plan, String sum_techGrasp, String sum_techExpand,
                   String sum_growth, String sum_break, String sum_shortcoming, Integer sum_eduRec_army,
                   Integer sum_eduRec_tradition, Integer sum_eduRec_school, Integer sum_eduRec_workplace,
                   Integer sum_eduRec_politics, String sum_eduRec_thoughts, Integer sum_state) {
        this.sum_time = sum_time;
        this.sum_plan = sum_plan;
        this.sum_techGrasp = sum_techGrasp;
        this.sum_techExpand = sum_techExpand;
        this.sum_growth = sum_growth;
        this.sum_break = sum_break;
        this.sum_shortcoming = sum_shortcoming;
        this.sum_eduRec_army = sum_eduRec_army;
        this.sum_eduRec_tradition = sum_eduRec_tradition;
        this.sum_eduRec_school = sum_eduRec_school;
        this.sum_eduRec_workplace = sum_eduRec_workplace;
        this.sum_eduRec_politics = sum_eduRec_politics;
        this.sum_eduRec_thoughts = sum_eduRec_thoughts;
        this.sum_state = sum_state;
    }

    public Summary() {
        super();
    }

    public Integer getSum_id() {
        return sum_id;
    }

    public void setSum_id(Integer sum_id) {
        this.sum_id = sum_id;
    }

    public String getSum_time() {
        return sum_time;
    }

    public void setSum_time(String sum_time) {
        this.sum_time = sum_time;
    }

    public String getSum_plan() {
        return sum_plan;
    }

    public void setSum_plan(String sum_plan) {
        this.sum_plan = sum_plan;
    }

    public String getSum_techGrasp() {
        return sum_techGrasp;
    }

    public void setSum_techGrasp(String sum_techGrasp) {
        this.sum_techGrasp = sum_techGrasp;
    }

    public String getSum_techExpand() {
        return sum_techExpand;
    }

    public void setSum_techExpand(String sum_techExpand) {
        this.sum_techExpand = sum_techExpand;
    }

    public String getSum_growth() {
        return sum_growth;
    }

    public void setSum_growth(String sum_growth) {
        this.sum_growth = sum_growth;
    }

    public String getSum_break() {
        return sum_break;
    }

    public void setSum_break(String sum_break) {
        this.sum_break = sum_break;
    }

    public String getSum_shortcoming() {
        return sum_shortcoming;
    }

    public void setSum_shortcoming(String sum_shortcoming) {
        this.sum_shortcoming = sum_shortcoming;
    }

    public Integer getSum_eduRec_army() {
        return sum_eduRec_army;
    }

    public void setSum_eduRec_army(Integer sum_eduRec_army) {
        this.sum_eduRec_army = sum_eduRec_army;
    }

    public Integer getSum_eduRec_tradition() {
        return sum_eduRec_tradition;
    }

    public void setSum_eduRec_tradition(Integer sum_eduRec_tradition) {
        this.sum_eduRec_tradition = sum_eduRec_tradition;
    }

    public Integer getSum_eduRec_school() {
        return sum_eduRec_school;
    }

    public void setSum_eduRec_school(Integer sum_eduRec_school) {
        this.sum_eduRec_school = sum_eduRec_school;
    }

    public Integer getSum_eduRec_workplace() {
        return sum_eduRec_workplace;
    }

    public void setSum_eduRec_workplace(Integer sum_eduRec_workplace) {
        this.sum_eduRec_workplace = sum_eduRec_workplace;
    }

    public Integer getSum_eduRec_politics() {
        return sum_eduRec_politics;
    }

    public void setSum_eduRec_politics(Integer sum_eduRec_politics) {
        this.sum_eduRec_politics = sum_eduRec_politics;
    }

    public String getSum_eduRec_thoughts() {
        return sum_eduRec_thoughts;
    }

    public void setSum_eduRec_thoughts(String sum_eduRec_thoughts) {
        this.sum_eduRec_thoughts = sum_eduRec_thoughts;
    }

    public Integer getSum_state() {
        return sum_state;
    }

    public void setSum_state(Integer sum_state) {
        this.sum_state = sum_state;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public String getClass_name() {
        return class_name;
    }

    public void setClass_name(String class_name) {
        this.class_name = class_name;
    }

    public String getTea_name() {
        return tea_name;
    }

    public void setTea_name(String tea_name) {
        this.tea_name = tea_name;
    }

    public Integer getStu_id() {
        return stu_id;
    }

    public void setStu_id(Integer stu_id) {
        this.stu_id = stu_id;
    }

    public String getStu_name() {
        return stu_name;
    }

    public void setStu_name(String stu_name) {
        this.stu_name = stu_name;
    }

    public String getStu_num() {
        return stu_num;
    }

    public void setStu_num(String stu_num) {
        this.stu_num = stu_num;
    }

    @Override
    public String toString() {
        return "Summary{" +
                "sum_id=" + sum_id +
                ", sum_time='" + sum_time + '\'' +
                ", sum_plan='" + sum_plan + '\'' +
                ", sum_techGrasp='" + sum_techGrasp + '\'' +
                ", sum_techExpand='" + sum_techExpand + '\'' +
                ", sum_growth='" + sum_growth + '\'' +
                ", sum_break='" + sum_break + '\'' +
                ", sum_shortcoming='" + sum_shortcoming + '\'' +
                ", sum_eduRec_army=" + sum_eduRec_army +
                ", sum_eduRec_tradition=" + sum_eduRec_tradition +
                ", sum_eduRec_school=" + sum_eduRec_school +
                ", sum_eduRec_workplace=" + sum_eduRec_workplace +
                ", sum_eduRec_politics=" + sum_eduRec_politics +
                ", sum_eduRec_thoughts='" + sum_eduRec_thoughts + '\'' +
                ", sum_state=" + sum_state +
                ", class_name='" + class_name + '\'' +
                ", stu_id=" + stu_id +
                ", stu_name='" + stu_name + '\'' +
                ", stu_num='" + stu_num + '\'' +
                ", tea_name='" + tea_name + '\'' +
                '}';
    }
}
