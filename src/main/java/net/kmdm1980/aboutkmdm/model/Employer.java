package net.kmdm1980.aboutkmdm.model;

import java.util.Set;
import java.util.TreeSet;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "employers")
public class Employer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "eid")
	private Long employerId;
	
	private String name;
	
	public Employer(long id, String name) {
		super();
		this.employerId = id;
		this.name = name;
	}

	@OneToMany(mappedBy = "titleId")
	private Set<Title> titles = new TreeSet<>();
	
	public Employer() {
		super();
	}

	public Employer(String name) {
		super();
		this.name = name;
	}

	public Long getId() {
		return employerId;
	}

	public void setId(Long id) {
		this.employerId = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employer [id=" + employerId + ", name=" + name + "]";
	}
	
	
}
