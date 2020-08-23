package com.lnzz.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Proxy;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * ClassName：College 
 *
 * @author 冷8:55
 * @Description:
 */
@Entity
@Table(name = "t_college",uniqueConstraints=@UniqueConstraint(columnNames="name"))
@Data
@NoArgsConstructor
@Proxy(lazy = false)//hibernate延时加载
public class College{
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @Column(name = "create_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createTime;
}
