package com.lnzz.service;

import com.lnzz.pojo.CourseType;
import java.util.List;

/**
 * ClassName：CourseTypeService
 *

 */
public interface CourseTypeService {
    CourseType saveCourseType(CourseType courseType);

    List<CourseType> listCourseType();

    CourseType updateCourseType(Long id, CourseType courseType);

    CourseType getCourseType(Long id);

}
