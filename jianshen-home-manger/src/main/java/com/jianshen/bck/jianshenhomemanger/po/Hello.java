package com.jianshen.bck.jianshenhomemanger.po;

import javax.persistence.*;

@Entity
@Table(name="t_hello")
public class Hello {
		@Id
	    @GeneratedValue
	    @Column(length = 11)
	    private Integer id;
	
	    @Column(length = 20)
	    private String username;
	
	    @Column(length = 20)
	    private String password;
	    public Integer getId() {
	        return id;
	    }
	
	    public void setId(Integer id) {
	        this.id = id;
	    }
}
