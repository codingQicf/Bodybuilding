package com.jianshen.bck.jianshenhomemanger.dao;

import com.jianshen.bck.jianshenhomemanger.po.User;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * 增删改需用@modify注解
 * 使用原生sql > @Query(value="select * from t_book order by RAND() LIMIT ?1",nativeQuery=true)
 */
public interface UserDao extends JpaRepository<User,Integer> {
	/**
	 * 用户列表查询
	 * @return
	 */
	@Query(value="select * from t_user LIMIT 0,8",nativeQuery=true)
	List<User> getUserList();
	
	/**
	 * 用户列表查询
	 * @return
	 */
	@Query(value="select * from t_user WHERE username=:username AND password =:password",nativeQuery=true)
	User getUserInfo(@Param("username")String username,@Param("password")String password);
	
	/***
	 * 单个用户查询
	 * @param id
	 * @return
	 */
	@Query(value="select * from t_user WHERE id=:id",nativeQuery=true)
	User getUserById(@Param("id")Integer id);
	
	/**
	 * 教练列表查询
	 * @return
	 */
	@Query(value="select * from t_user WHERE isJs = 1 LIMIT :count,8",nativeQuery=true)
	List<User> getCoachUserList(@Param("count")Integer count);
	
}

