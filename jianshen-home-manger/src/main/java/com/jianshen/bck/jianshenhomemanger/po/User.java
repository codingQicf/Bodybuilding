package com.jianshen.bck.jianshenhomemanger.po;

import javax.persistence.*;

@Entity
@Table(name="t_user")
public class User {
    @Id
    @GeneratedValue
    @Column(length = 11)
    private Integer id;

    @Column(length = 20)
    private String username;
    
    @Column(length = 11)
    private Integer isJs;			//'是否是健身教练(1是，0不是)',
    
    @Column(length = 11)
    private Integer isPm;			//'是否是管理员(1是 0不是)'

    @Column(length = 20)
    private String nickname;
    
    @Column(length = 20)
    private String password;
    
    public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(length = 11)
    private Integer age;
    
    @Column(length = 20)
    private String sex; 			//'男，女 字符串表示'
    
    @Column(length = 20)
    private String name;
    
    @Column(length = 255)
    private String describe;
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Integer getIsJs() {
		return isJs;
	}

	public void setIsJs(Integer isJs) {
		this.isJs = isJs;
	}

	public Integer getIsPm() {
		return isPm;
	}

	public void setIsPm(Integer isPm) {
		this.isPm = isPm;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getDescribe() {
		return describe;
	}

	public void setDescribe(String describe) {
		this.describe = describe;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public void setName(String name) {
        this.name = name;
    }

}
