package com.jianshen.bck.jianshenhomemanger.po;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="t_news")
public class News {
    @Id
    @GeneratedValue
    @Column(length = 11)
    private Integer id;

    @Column(length = 20)
    private String ntitle;
    
    @Column(length = 20)
    private String ncontent;			
    
    @Column(name="ntime")
    private Date ntime;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNtitle() {
		return ntitle;
	}

	public void setNtitle(String ntitle) {
		this.ntitle = ntitle;
	}

	public String getNcontent() {
		return ncontent;
	}

	public void setNcontent(String ncontent) {
		this.ncontent = ncontent;
	}

	public Date getNtime() {
		return ntime;
	}

	public void setNtime(Date ntime) {
		this.ntime = ntime;
	}			

}
