package com.hanteo.board_category;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 카테고리 객체 클래스
 * 각 카테고리는 id, name, children 리스트를 가짐
 */
public class Category {
	// 변수 선언 캡슐화
	private int id;
	private String name;
	private List<Category> children = new ArrayList<>();
	
	// 카테고리 객체 생성자
	public Category(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public void addChild(Category child) {
		children.add(child);
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public List<Category> getChildren(){
		return children;
	}
	
	@JsonProperty("hasChildren")
	public boolean hasChildren() {
		return !children.isEmpty();
	}
}
