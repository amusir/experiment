package com.lnzz.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Proxy;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * ClassName：Maj8:57
 * @Description:
 */
@Entity
@Table(name = "t_major",uniqueConstraints=@UniqueConstraint(columnNames="name"))
@Data
@NoArgsConstructor
@Proxy(lazy = false)//hibernate延时加载
public class Major {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @Column(name = "create_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createTime;
    @ManyToOne
    private College college;


}
