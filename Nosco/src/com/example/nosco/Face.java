package com.example.nosco;

public class Face {
	private String name;
	private String id;

	public Face() {
	}

	public Face(String name, String id) {
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getId() {
		return id;
	}
}
