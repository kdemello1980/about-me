package net.kmdm1980.aboutkmdm.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "items")
public class Item {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "item_id")
	private Long itemId;
	
	@ManyToOne
	@JoinColumn(name = "titleId")
	private Title title;

	private String text;

	public Item(Long id, Title title, String text) {
		super();
		this.itemId = id;
		this.title = title;
		this.text = text;
	}

	public Item() {
		super();
	}

	public Long getId() {
		return itemId;
	}

	public void setId(long id) {
		this.itemId = id;
	}

	public Title getTitle() {
		return title;
	}

	public void setTitle(Title title) {
		this.title = title;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return "Item [id=" + itemId + ", title=" + title + ", text=" + text + "]";
	}
	
	

}
