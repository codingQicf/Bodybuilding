package com.jianshen.bck.jianshenhomemanger.dao;

import com.jianshen.bck.jianshenhomemanger.po.Project;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * 增删改需用@modify注解
 * 使用原生sql > @Query(value="select * from t_book order by RAND() LIMIT ?1",nativeQuery=true)
 */
public interface ProjectDao extends JpaRepository<Project,Integer> {
	/**
	   * 项目列表查询
	 * @return
	 */
	@Query(value="select * from t_project LIMIT 0,8",nativeQuery=true)
	List<Project> getProjectList();
	
	
	@Query(value="select * from t_project WHERE id=:id",nativeQuery=true)
	Project getProjectById(@Param("id")Integer id);
}

