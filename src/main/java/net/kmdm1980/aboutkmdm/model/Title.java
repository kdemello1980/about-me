package net.kmdm1980.aboutkmdm.model;


import java.sql.Date;
import java.util.Set;
import java.util.TreeSet;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Embeddable
@Table(name = "titles")
public class Title {


	private long titleId;
	

	private Employer employer;
	
	private String name;
	
	@Column(name = "from_date")
	private Long fromDate;
	
	@Column(name = "to_date")
	private Long toDate;
	
	@OneToMany(mappedBy = "title")
	private Set<Item> items = new TreeSet<>();

	public Title(long id, Employer employer, String name, Long fromDate, Long toDate) {
		super();
		this.titleId = id;
		this.employer = employer;
		this.name = name;
		this.fromDate = fromDate;
		this.toDate = toDate;
	}

	public Title() {
		super();
	}

	public Title(Employer employer, String name, Long fromDate, Long toDate) {
		super();
		this.employer = employer;
		this.name = name;
		this.fromDate = fromDate;
		this.toDate = toDate;
	}

	public long getId() {
		return titleId;
	}

	public void setId(long id) {
		this.titleId = id;
	}

	public Employer getEmployer() {
		return employer;
	}

	public void setEmployer(Employer employer) {
		this.employer = employer;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getFromDate() {
		return fromDate;
	}

	public void setFromDate(Long fromDate) {
		this.fromDate = fromDate;
	}

	public Long getToDate() {
		return toDate;
	}

	public void setToDate(Long toDate) {
		this.toDate = toDate;
	}

	@Override
	public String toString() {
		return "Title [id=" + titleId + ", employer=" + employer + ", name=" + name + ", fromDate=" + fromDate
				+ ", toDate=" + toDate + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((employer == null) ? 0 : employer.hashCode());
		result = prime * result + ((fromDate == null) ? 0 : fromDate.hashCode());
		result = prime * result + ((items == null) ? 0 : items.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + (int) (titleId ^ (titleId >>> 32));
		result = prime * result + ((toDate == null) ? 0 : toDate.hashCode());
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
		Title other = (Title) obj;
		if (employer == null) {
			if (other.employer != null)
				return false;
		} else if (!employer.equals(other.employer))
			return false;
		if (fromDate == null) {
			if (other.fromDate != null)
				return false;
		} else if (!fromDate.equals(other.fromDate))
			return false;
		if (items == null) {
			if (other.items != null)
				return false;
		} else if (!items.equals(other.items))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (titleId != other.titleId)
			return false;
		if (toDate == null) {
			if (other.toDate != null)
				return false;
		} else if (!toDate.equals(other.toDate))
			return false;
		return true;
	}
	
	
}
