package co.edu.unilibre.user.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name = "user")
public class User implements Serializable{

	private static final long serialVersionUID = -1462302884002834226L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Long countryId;
	private String name;
	
	@Column(name = "creation_date")
	@Temporal(TemporalType.DATE)
	private Date createDate;
	
	@Transient
	private Long port;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Long getCountryId() {
		return countryId;
	}
	
	public void setCountryId(Long id) {
		this.countryId = id;
	}

	
	
}
