package com.lnzz.dao;

import com.lnzz.pojo.Grade;
import com.lnzz.pojo.Major;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * ClassName：ClassRepository
 *
 * @Description:
 */
public interface GradeRepository extends JpaRepository<Grade, Long> {

    List<Grade> findAllByMajor_Id(Long id);


}
