package com.jianshen.bck.jianshenhomemanger.po;

import javax.persistence.*;

@Entity
@Table(name="t_project")
public class Project {
    @Id
    @GeneratedValue
    @Column(length = 11)
    private Integer id;

    @Column(length = 20)
    private String pname;
    
    @Column(length = 20)
    private String ptype;			
    
    @Column(length = 20)
    private String pcomment;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPtype() {
		return ptype;
	}

	public void setPtype(String ptype) {
		this.ptype = ptype;
	}

	public String getPcomment() {
		return pcomment;
	}

	public void setPcomment(String pcomment) {
		this.pcomment = pcomment;
	}	
    
}
