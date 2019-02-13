package com.jianshen.bck.jianshenhomemanger.po;


import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="t_js")
public class JianShen {
    @Id
    @GeneratedValue
    @Column(length = 11)
    private Integer id;

    @Column(length = 20)
    private String jstitle;
    
    @Column(length = 20)
    private String jscontent;			
    
    @Column(length = 20)
    private String jsimg;
    
    @Column(name="jstime")
    private Date jstime; 
    
    @Column(length = 11)
    private Integer jsuid; 

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getJstitle() {
		return jstitle;
	}

	public void setJstitle(String jstitle) {
		this.jstitle = jstitle;
	}

	public String getJscontent() {
		return jscontent;
	}

	public void setJscontent(String jscontent) {
		this.jscontent = jscontent;
	}

	public String getJsimg() {
		return jsimg;
	}

	public void setJsimg(String jsimg) {
		this.jsimg = jsimg;
	}

	public Date getJstime() {
		return jstime;
	}

	public void setJstime(Date jstime) {
		this.jstime = jstime;
	}

	public Integer getJsuid() {
		return jsuid;
	}

	public void setJsuid(Integer jsuid) {
		this.jsuid = jsuid;
	}

}
