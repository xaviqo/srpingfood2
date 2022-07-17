package xavi.tech.springfood.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "client_id")
public class Client extends Account{

	@Column(length = 40, nullable = false)
	private String name;
    @Column(length = 12, nullable = false)
	private String phone;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "client")
    private List<Address> addresses;
    
	public Client(String email, String password, Role role, String name, String phone, List<Address> addresses) {
		super(email, password, role);
		this.name = name;
		this.phone = phone;
		this.addresses = addresses;
	}
    
    
    
    
}
