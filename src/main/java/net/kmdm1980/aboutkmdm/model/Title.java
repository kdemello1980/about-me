package net.kmdm1980.aboutkmdm.model;


import java.sql.Date;
import java.util.Set;
import java.util.TreeSet;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "titles")
public class Title {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "tid")
	private long titleId;
	
	/**
	 * Not sure if I need a bi-directional relation here.
	 */
	@ManyToOne
	@JoinColumn(name = "employerId")
	private Employer employer;
	
	private String name;
	
	@Column(name = "from_date")
	private Date fromDate;
	
	@Column(name = "to_date")
	private Date toDate;
	
	@OneToMany(mappedBy = "itemId")
	private Set<Item> items = new TreeSet<>();

	public Title(long id, Employer employer, String name, Date fromDate, Date toDate) {
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

	public Title(Employer employer, String name, Date fromDate, Date toDate) {
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

	public Date getFromDate() {
		return fromDate;
	}

	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	public Date getToDate() {
		return toDate;
	}

	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}

	@Override
	public String toString() {
		return "Title [id=" + titleId + ", employer=" + employer + ", name=" + name + ", fromDate=" + fromDate
				+ ", toDate=" + toDate + "]";
	}
	
	
}
