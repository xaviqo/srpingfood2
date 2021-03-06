package xavi.tech.springfood.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@PrimaryKeyJoinColumn
public class Worker extends Account{

    @Column(length = 40, nullable = false)
	private String name;
    @Column(length = 12, nullable = false)
	private String phone;

	public Worker(String email, String password, Role role, String name, String phone) {
		super(email, password, role);
		this.name = name;
		this.phone = phone;
	}
}
