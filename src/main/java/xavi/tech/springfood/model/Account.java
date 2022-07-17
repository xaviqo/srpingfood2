package xavi.tech.springfood.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table
@Getter
@Setter
@ToString
@Inheritance(strategy = InheritanceType.JOINED)
public class Account {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
	private long userId;
    @Column(length = 40, nullable = false, unique = true)
	private String email;
    @Column(length = 40, nullable = false)
	private String password;
    @Column(nullable = false)
	private Role role;
    
	public Account(String email, String password, Role role) {
		super();
		this.email = email;
		this.password = password;
		this.role = role;
	}
    
    

}
