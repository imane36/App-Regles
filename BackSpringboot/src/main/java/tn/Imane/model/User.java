package tn.Imane.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class User {
	@Id
	@GeneratedValue
	private Integer id ;
	private String Login  ;
	private String PassWord ;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getLogin() {
		return Login;
	}
	public void setLogin(String login) {
		Login = login;
	}
	public String getPassWord() {
		return PassWord;
	}
	public void setPassWord(String passWord) {
		PassWord = passWord;
	}
	public User(Integer id, String login, String passWord) {
		super();
		this.id = id;
		Login = login;
		PassWord = passWord;
	}
	public User() {
		
	}

}
