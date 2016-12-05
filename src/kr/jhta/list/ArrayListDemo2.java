package kr.jhta.list;

import java.util.ArrayList;

public class ArrayListDemo2 {
	public static void main(String[] args) {
		// 방문자 이름을 저장하는 ArrayList를 생성하고
		// 방문자 이름을 여러개 입력하기
		// "김"씨 성을 가진 사람만 새로운 ArrayList에 저장하기
		ArrayList<String> names = new ArrayList<String>();
		
		names.add("권건");
		names.add("류성현");
		names.add("김민석");
		names.add("박재범");
		
		ArrayList<String> kims = new ArrayList<String>();
		
		for (String name : names) {
			String firstLetter = name.substring(0,1);
			if("김".equals(firstLetter)) {
				kims.add(name);
				System.out.println(name);
			}			
		}		
	}
}

