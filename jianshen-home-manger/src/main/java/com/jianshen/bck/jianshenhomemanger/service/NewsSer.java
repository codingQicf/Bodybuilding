package com.jianshen.bck.jianshenhomemanger.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jianshen.bck.jianshenhomemanger.dao.NewsDao;
import com.jianshen.bck.jianshenhomemanger.po.News;

/**
 * @date ${date} ${time}
 */
@Service
public class NewsSer {

    @Autowired
    private NewsDao dao;
    
    public List<News> NewsAll(){
    	return dao.findAll();
    }
    
    public News getNewsById(Integer id) {
		return dao.getNewsById(id);
    }
    
    public News addNews(News News) {
    	return dao.save(News);
    }
    
    public void delNews(Integer id) {
    	 dao.deleteById(id);
    }
    
    public List<News> NewsList() {
    	return dao.getNewsList();
    }
    
}
