package kr.jhta.list;

import java.util.ArrayList;

public class ArrayListDemo3 {
	
	public static void main(String[] args) {
		// 상품 정보를 담는 ArrayList를 생성하고
		// 상품 정보 여러개를 담기
		// 저장된 상품 중에서 색상이 "검정"색인 상품만 화면에 출력하기
		ArrayList<Product> productList = new ArrayList<>();
		productList.add(new Product("청바지", "검정", 45000));
		productList.add(new Product("목도리", "빨강", 25000));
		productList.add(new Product("스카프", "노랑", 11000));
		productList.add(new Product("패딩", "회색", 99000));
		productList.add(new Product("레깅스", "흰색", 36000));	
		
		for(Product product : productList) {
			String color = product.getColor();
			if("검정".equals(color)) {
				System.out.println(product.toString());
			}
		}
		}
	
	
	public static class Product {
		
		private String name;
		private String color;
		private int price;
		
		public Product() {}

		public void add(String a) {
			// TODO Auto-generated method stub
			
		}

		public Product(String name, String color, int price) {
			super();
			this.name = name;
			this.color = color;
			this.price = price;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}

		public int getPrice() {
			return price;
		}

		public void setPrice(int price) {
			this.price = price;
		}
		
		public String toString() {
			return "이름: " + name + "\t색상: " + color + "\t가격: " + price;
		}
		
	
	}
}
