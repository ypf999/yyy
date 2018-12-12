package com.pojo;

import java.util.Date;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

public class User {

	@NotEmpty(message = "用户名不能为空")
	private String username;
	@NotEmpty(message = "密码不能为空")
	private String password;
	@Max(value = 80, message = "年龄不得大于80岁")
	@Min(value = 18, message = "年龄不能小于18岁")
	private int age;
	@Pattern(regexp = "^\\w+@\\w+\\.\\w+$", message = "邮箱不符合格式")
	private String email;
	@Pattern(regexp = "^(13|15|17|18)\\d{9}$", message = "请输入正确的手机号")
	private String phone;
	@Past(message="入职日期必须不能大于当前日期")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date hiredate;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Date getHiredate() {
		return hiredate;
	}

	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}
}
