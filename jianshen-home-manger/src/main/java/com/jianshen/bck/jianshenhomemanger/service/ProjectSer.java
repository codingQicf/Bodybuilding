package com.jianshen.bck.jianshenhomemanger.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;
import com.jianshen.bck.jianshenhomemanger.dao.ProjectDao;
import com.jianshen.bck.jianshenhomemanger.po.Project;

/**
 * @date ${date} ${time}
 */
@Service
public class ProjectSer {

    @Autowired
    private ProjectDao dao;
    
    public List<Project> ProjectAll(String ptype){
    	Project project = new Project();
    	if(!ptype.isEmpty() && ptype!="") {
    		project.setPtype(ptype);
    		Example<Project> example = Example.of(project);
    		List<Project> list = dao.findAll(example);
    		return list;
    	}
    	return dao.findAll();
    }
    
    public Project getProjectById(Integer id) {
		return dao.getProjectById(id);
    }
    
    public Project addProject(Project Project) {
    	return dao.save(Project);
    }
    
    public void delProject(Integer id) {
    	 dao.deleteById(id);
    }
    
    public List<Project> ProjectList(String ptype) {
    	Project project = new Project();
    	if(!ptype.isEmpty() && ptype!="") {
    		project.setPtype(ptype);
    		Example<Project> example = Example.of(project);
    		List<Project> list = dao.findAll(example);
    		return list;
    	}
    	return dao.getProjectList();
    }
    
}
