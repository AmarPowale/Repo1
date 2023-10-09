package com.nt.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="SP_DATA_MOVIE")
public class Movie implements Serializable{
	
	@Id
	@Column(name = "MID")
	private Integer mid;
	
	@Column(name = "MNAME", length = 20)
	private String mname;
	
	@Column(name = "YEAR", length = 20)
	private Integer year;
	
	@Column(name = "RATING")
	private Float rating;

	public void setMname(String string) {
		// TODO Auto-generated method stub
		mname=string;
	}

	public void setRating(Float f) {
		// TODO Auto-generated method stub
		rating=f;
	}

	public void setYear(Integer string) {
		// TODO Auto-generated method stub
		year=string;
	}

	public Integer getMid() {
		// TODO Auto-generated method stub
		return mid;
	}

	
	

}
