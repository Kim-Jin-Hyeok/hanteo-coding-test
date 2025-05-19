package com.hanteo.board_category;

import java.util.List;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
	public static void main(String[] args) throws Exception{
		CategoryManager manager = new CategoryManager();
		
		manager.addCategory(1, "남자");
		manager.addCategory(2, "여자");
		
		manager.addCategory(3, "엑소");
		manager.addCategory(4, "방탄소년단");
		manager.addCategory(5, "블랙핑크");
		
		manager.addCategory(6, "익명게시판");
		
		manager.addCategory(10, "공지사항");
		manager.addCategory(11, "첸");
		manager.addCategory(12, "백현");
		manager.addCategory(13, "시우민");
		
		manager.addCategory(14, "공지사항");
		manager.addCategory(15, "뷔");
		
		manager.addCategory(16, "공지사항");
		manager.addCategory(17, "로제");
		
		manager.addRelation(1, 3);
		manager.addRelation(3, 10);
		manager.addRelation(3, 11);
		manager.addRelation(3, 12);
		manager.addRelation(3, 13);
		
		manager.addRelation(1, 4);
		manager.addRelation(4, 14);
		manager.addRelation(4, 6);
		manager.addRelation(4, 15);

        manager.addRelation(2, 5);
        manager.addRelation(5, 16);
        manager.addRelation(5, 6);
        manager.addRelation(5, 17);
        
        Category root = manager.searchById(1); // 남자 트리 출력
        // Category root = manager.searchById(5); // 블랙핑크 트리 출력
        // List<Category> root = manager.searchByName("공지사항"); // 공지사항 출력
        // List<Category> root = manager.searchByName("익명게시판"); // 익명게시판 출력
        
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(root);
        System.out.println(json);
		
	}
}
