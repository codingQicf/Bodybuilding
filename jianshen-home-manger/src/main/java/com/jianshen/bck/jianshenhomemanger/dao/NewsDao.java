package com.jianshen.bck.jianshenhomemanger.dao;

import com.jianshen.bck.jianshenhomemanger.po.News;
import com.jianshen.bck.jianshenhomemanger.po.User;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * 增删改需用@modify注解
 * 使用原生sql > @Query(value="select * from t_book order by RAND() LIMIT ?1",nativeQuery=true)
 */
public interface NewsDao extends JpaRepository<News,Integer> {
	/**
	   * 资讯列表查询
	 * @return
	 */
	@Query(value="select * from t_news LIMIT 0,8",nativeQuery=true)
	List<News> getNewsList();
	
	@Query(value="select * from t_news WHERE id=:id",nativeQuery=true)
	News getNewsById(@Param("id")Integer id);
	
}

