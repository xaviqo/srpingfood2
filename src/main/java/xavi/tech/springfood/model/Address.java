package xavi.tech.springfood.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Address {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long addressId;
    @ManyToOne(fetch= FetchType.LAZY)
    @JoinColumn(name="user_id")
	private Client client;

}
