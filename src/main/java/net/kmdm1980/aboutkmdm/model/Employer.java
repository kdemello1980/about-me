package net.kmdm1980.aboutkmdm.model;

import java.util.Set;
import java.util.TreeSet;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "employers")
public class Employer {

	
	private Long employerId;
	
	private String name;
	private Long hireYear;
	
	private Set<Title> titles = new TreeSet<>();
	
	public Employer(long employerId, String name) {
		super();
		this.employerId = employerId;
		this.name = name;
	}
	
	public Employer() {
		super();
	}

	public Employer(String name) {
		super();
		this.name = name;
	}

	public Long getEmployerId() {
		return employerId;
	}

	public void setEmployerId(Long employerId) {
		this.employerId = employerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getHireYear() {
		return hireYear;
	}

	public void setHireYear(Long hireYear) {
		this.hireYear = hireYear;
	}

	public Set<Title> getTitles() {
		return titles;
	}

	public void setTitles(Set<Title> titles) {
		this.titles = titles;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((employerId == null) ? 0 : employerId.hashCode());
		result = prime * result + ((hireYear == null) ? 0 : hireYear.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((titles == null) ? 0 : titles.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employer other = (Employer) obj;
		if (employerId == null) {
			if (other.employerId != null)
				return false;
		} else if (!employerId.equals(other.employerId))
			return false;
		if (hireYear == null) {
			if (other.hireYear != null)
				return false;
		} else if (!hireYear.equals(other.hireYear))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (titles == null) {
			if (other.titles != null)
				return false;
		} else if (!titles.equals(other.titles))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Employer [employerId=" + employerId + ", name=" + name + ", hireYear=" + hireYear + ", titles=" + titles
				+ "]";
	}


	
	
}
