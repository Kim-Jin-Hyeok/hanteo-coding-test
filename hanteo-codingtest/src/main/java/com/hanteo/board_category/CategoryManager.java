package com.hanteo.board_category;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CategoryManager {
	
	/* 
	 * 카테고리 식별자 및 카테고리명으로 검색이 되어야하며, 
	 * 검색된 결과 값은 해당 카테고리의 하위 카테고리를 모두 담고 있어야 한다.
	 */
	private Map<Integer, Category> idMap = new HashMap<>();
	private Map<String, List<Category>> nameMap = new HashMap<>();
	
	// 카테고리 객체 등록
	public void addCategory(int id, String name) {
		if(idMap.containsKey(id)) return;
		
		Category category = new Category(id, name);
		idMap.put(id,  category);
		
		if(!nameMap.containsKey(name)) {
			nameMap.put(name, new ArrayList<>());
		}
		nameMap.get(name).add(category);
	}
	
	// 부모 자식 카테고리 간 연결
	public void addRelation(int parentId, int childId) {
		Category parent = idMap.get(parentId);
		if(parent == null) {
			throw new IllegalArgumentException("부모 카테고리가 존재하지 않습니다.");
		}
		Category child = idMap.get(childId);
		if(child == null) {
			throw new IllegalArgumentException("자식 카테고리가 존재하지 않습니다.");
		}
		
		parent.addChild(child);
	}
	
	public Category searchById(int id) {
		return idMap.get(id);
	}
	
	public List<Category> searchByName(String name){
		// 이름으로 검색 시 데이터가 없는 경우 null을 리턴하면 후에 null exception 가능성 있음  
		return nameMap.getOrDefault(name, new ArrayList<>());
	}
}
