package com.liyong.jpa_demo.dao;

import com.liyong.jpa_demo.model.TUserDo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * <p> author liyong  </p>
 * <p> date 2019-03-18 23:10 </p>
 * <p> description  @Repository</p>
 **/
@Repository
public interface TUserDao extends JpaRepository<TUserDo, Long> {
}
