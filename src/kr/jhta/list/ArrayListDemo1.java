package kr.jhta.list;

import java.util.ArrayList;

import javax.print.DocFlavor.STRING;

public abstract class ArrayListDemo1 {
	public static void main(String[] args) {
		// 방문자 이름을 저장하는 ArrayList를 생성
		// 방문자 이름을 여러개 입력하기
		// 출력은 "김"씨 성을 가진 사람만 화면에 출력하기
		ArrayList<String> names = new ArrayList<String>();
		
		names.add("김민수");
		names.add("김진수");
		names.add("김수민");
		names.add("황수민");
		names.add("권건");
		names.add("류성현");
				
		for (String name :names) {
			String firstLetter = name.substring(0,1);
			if("김".equals(firstLetter)) {	//nullpointerException이 발생할 수 있으므로 순서를 바꿔서 적는다. 
				System.out.println(name);
			}
		}
		
		
	}
}
