package com.springjpaupdatedb.jpaupdatedb.model;

import java.io.Serializable;

public class NameId implements Serializable {

	private static final long serialVersionUID = 1L;
	private long id;
	private String sub;

	public String getSub() {
		return sub;
	}

	public void setSub(String sub) {
		this.sub = sub;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

}
