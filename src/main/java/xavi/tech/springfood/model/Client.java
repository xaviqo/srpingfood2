package xavi.tech.springfood.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;

import lombok.ToString;

@Entity
@PrimaryKeyJoinColumn
@ToString(callSuper=true, includeFieldNames=true)
public class Client extends Account{
	
	@Column(length = 40, nullable = false)
	private String name;
    @Column(length = 12, nullable = false)
	private String phone;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "client", cascade = CascadeType.PERSIST)
    private List<Address> addresses;
    
	public Client(String email, String password, Role role, String name, String phone) {
		super(email, password, role);
		this.name = name;
		this.phone = phone;
		this.addresses = new ArrayList<>();
	}

	public void setAddress(Address address) {
		this.addresses.add(address);
	}
	
	
	
	
    
}
