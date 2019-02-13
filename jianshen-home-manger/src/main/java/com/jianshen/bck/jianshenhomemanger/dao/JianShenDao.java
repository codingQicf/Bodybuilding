package com.jianshen.bck.jianshenhomemanger.dao;

import com.jianshen.bck.jianshenhomemanger.po.JianShen;
import com.jianshen.bck.jianshenhomemanger.po.News;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * 增删改需用@modify注解
 * 使用原生sql > @Query(value="select * from t_book order by RAND() LIMIT ?1",nativeQuery=true)
 */
public interface JianShenDao extends JpaRepository<JianShen,Integer> {
	/**
	   * 资讯列表查询
	 * @return
	 */
	@Query(value="SELECT * FROM t_user t ,t_js j where t.id=j.jsuid  AND j.jsuid=:jsuid",nativeQuery=true)
	JianShen getProjectInfo(Integer jsuid);
	
}

