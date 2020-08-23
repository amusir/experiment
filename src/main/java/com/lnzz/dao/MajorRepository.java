package com.lnzz.dao;

import com.lnzz.pojo.Major;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * ClassName：MajorRepository
 
 * @Description:
 */
public interface MajorRepository extends JpaRepository<Major, Long> {
    List<Major> findAllByCollege_Id(Long id);
}
