package com.demo.jee.model;

import java.io.Serializable;

import com.demo.jee.stereotype.Model;

@Model
public class SimpleOutput implements Serializable {

	private String value = "PrimeFaces label";

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}

