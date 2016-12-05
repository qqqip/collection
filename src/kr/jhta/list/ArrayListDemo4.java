package kr.jhta.list;

import java.util.ArrayList;

public class ArrayListDemo4 {
	
	// 정적 메소드 정의하기
	// ArrayList와 "성씨"를 전달받아서 그 "성씨"에 해당하는 이름을 출력하는 메소드
	public static void displayNameByFamilyName(ArrayList<String> list, String familyName) {
		for (String name : list) {
			boolean a = name.substring(0,1).equals(familyName);
			if (a) {
				System.out.println(name);
			}
		}
	}
	
	// 정적메소드 정의하기
	// ArrayList와 "성씨"를 전달받아서 그 "성씨"에 해당하는 이름을 ArrayList에 담아서 반환하는 메소드
	public static ArrayList<String> getNamesByFamilyName(ArrayList<String> list, String familyName) {
		ArrayList<String> result = new ArrayList<>();				
		for (String name : list) {
			if(name.substring(0, 1).equals(familyName)){
				result.add(name);
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		
		names.add("권건");
		names.add("류성현");
		names.add("김민석");
		names.add("박재범");
		
		ArrayList<String> l = getNamesByFamilyName(names, "김");
		
		System.out.println(l);
	}
}
