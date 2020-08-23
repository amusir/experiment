package com.lnzz.service;

import com.lnzz.pojo.College;

import java.util.List;

/**
 * ClassName：CollegeService
 *

 * @Description:
 */ 
public interface CollegeService {
    College saveCollege(College college);

    List<College> listCollege();

    College updateCollege(Long id, College college);

    College getCollege(Long id);


}
