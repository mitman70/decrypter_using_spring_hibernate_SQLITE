package com.mahmud.decrypt.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "crypt")
public class Crypt {
	
	//@Id
	//@GeneratedValue
	
	
	@Id
	private int start;
	@Column(name="length")
	private int length;
	@Column(name="rotate")
	private int rotate;
	
	
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getRotate() {
		return rotate;
	}
	public void setRotate(int rotate) {
		this.rotate = rotate;
	}
	 
	

}
