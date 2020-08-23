package com.lnzz.dao;

import com.lnzz.pojo.College;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * ClassName：CollegeRepository
 * @Description:
 */
public interface CollegeRepository extends JpaRepository<College,Long> {
}
