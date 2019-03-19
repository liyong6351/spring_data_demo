package com.liyong.jpa_demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * <p> author liyong  </p>
 * <p> date 2019-03-18 23:04 </p>
 * <p> description  </p>
 **/
@Entity
@Table(name = "t_user")
public class TUserDo {
    @Id
    private Long id;
    @Column(length = 48)
    private String name;
    @Column(length = 3)
    private Integer age;
    @Column(length = 1)
    private Integer sex;
    @Column()
    private Date birthday;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
