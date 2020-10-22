package com.aug.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="TEST")
public class Test {
	
	@Id
    @GenericGenerator(name="gen", strategy="increment")
    @GeneratedValue(generator="gen")
    @Column(name="TEST_ID", unique=true, nullable=false, precision=15, scale=0)
    private int id;
    
    @Column(name="TEXT")
    private String text;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return "Test [id=" + id + ", text=" + text + "]";
	}

}
