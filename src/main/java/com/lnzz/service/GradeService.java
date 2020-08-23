package com.lnzz.service;

import com.lnzz.pojo.Grade;

import java.util.List;

/**
 * ClassName：ClassService

public interface GradeService {
    Grade saveGrade(Grade grade);

    List<Grade> listGrade();

    Grade updateGrade(Long id, Grade grade);

    Grade getGrade(Long id);

    /**
     * 查询专业下所属班级
     * @param id
     * @return
     */
    List<Grade> findAllByMajor_Id(Long id);
}
