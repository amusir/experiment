package com.lnzz.service;

import com.lnzz.pojo.Sc;

import java.util.List;

/**
 * ClassName：ScService
 *
 * @Description:
 */
public interface ScService {

    Sc saveSc(Sc sc);

    Sc getSc(Long id);


    /**
     * 查询是否选择该课程
     * @param courseId
     * @param studentId
     * @return
     */
    Sc getScByCourseIdAndStudentId(Long courseId,Long studentId);

    /**
     * 学生退选课程
     * @param courseId
     * @param studentId
     * @return
     */
    int deleteScByCourseIdAndStudentId(Long courseId,Long studentId);

    /**
     * 教师课程打分
     * @param courseId
     * @param studentId
     * @param score
     * @return
     */
    int updateScoreByByCourseIdAndStudentId(Long courseId, Long studentId, Double score);
}
