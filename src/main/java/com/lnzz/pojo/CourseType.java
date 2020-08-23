package com.lnzz.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Proxy;

import javax.persistence.*;
import java.util.Date;

/**
 * ClassName：CourseType
 *
 *
 * @Description:
 */
@Entity
@Table(name = "t_course_type")
@Data
@NoArgsConstructor
@Proxy(lazy = false)
public class CourseType {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @Column(name = "create_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createTime;
}
