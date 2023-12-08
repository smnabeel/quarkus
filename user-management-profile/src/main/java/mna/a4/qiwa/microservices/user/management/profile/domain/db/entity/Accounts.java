package mna.a4.qiwa.microservices.user.management.profile.domain.db.entity;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Accounts {

	@Id
	@GeneratedValue
	@Column(name = "user_id")
	private Long userId;
	private String username;
	private String password;
	private String email;
	@Column(name = "created_on")
	private Timestamp createdOn;
	@Column(name = "last_login")
	private Timestamp lastLogin;
	
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long id) {
		this.userId = id;
	}
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Timestamp getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(Timestamp createdOn) {
		this.createdOn = createdOn;
	}
	public Timestamp getLastLogin() {
		return lastLogin;
	}
	public void setLastLogin(Timestamp lastLogin) {
		this.lastLogin = lastLogin;
	}
	@Override
	public String toString() {
		return "Accounts [userId=" + userId + ", username=" + username + ", password=" + password + ", email=" + email
				+ ", createdOn=" + createdOn + ", lastLogin=" + lastLogin + "]";
	}
}
