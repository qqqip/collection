package kr.jhta.list;

import java.util.ArrayList;
import java.util.HashSet;

public class ArrayListDemo5 {
	
//		콜렉션과 제목을 전달받아서 제목이 포함된 책 정보를 반환하는 메소드
	public static ArrayList<Book> SearchBooksByTitle(ArrayList<Book> books, String keyword) {
		ArrayList<Book> result = new ArrayList<>();
		
		String lowerCaseKeyword = keyword.toLowerCase();
		
		for (Book a : books) {
			String lowerCaseTitle = a.getTitle().toLowerCase();
			
			if (lowerCaseTitle.contains(lowerCaseKeyword)) { // keyword == null || keyword.trim().isEmpty()
				result.add(a);
			}
		}
		return result;	
	}
	
//		콜렉션과 최소가격, 최대가격을 전달받아서 그 가격범위에 포함된 책 정보를 반환하는 메소드
	public static ArrayList<Book> SearchBooksByPrice(ArrayList<Book> books, int min, int max) {
		ArrayList<Book> result = new ArrayList<>();
		
		for (Book a : books) {
			if (a.getPrice() >= min && a.getPrice() <= max) {
				result.add(a);
			}
		}
		return result;
	}
	
//		콜렉션과 출판사를 전달받아서 그 출판사에서 출판한 책 정보를 반환하는 메소드
	public static ArrayList<Book> SearchBooksByPub(ArrayList<Book> books, String pub) {
		ArrayList<Book> result = new ArrayList<>();
		
		for (Book a : books) {
			if (a.getPub().equals(pub)) {
				result.add(a);
			}
		}
		
		return result;
	}
		
	
//	콜렉션을 전달받아서 출판사 정보를 반환하는 메소드	//Hashset에 담으면 중복안되게 담을 수 있다. 
	public static HashSet<String> collectPub(ArrayList<Book> books) {
		HashSet<String> pub = new HashSet<>();
		
		for (Book a : books) {
			pub.add(a.getPub());
		}
			return pub;
		
	}
	
	
		public static void main(String[] args) {
		ArrayList<Book> books = new ArrayList<>();
		books.add(new Book("이것이 자바다", "신용권", "한빛미디어", 30000));
		books.add(new Book("점프 투 파이썬", "박응용", "이지스퍼블리싱", 18000));
		books.add(new Book("열혈 C프로그래밍", "윤성우", "오렌지미디어", 30000));
		books.add(new Book("파이썬 웹 크롤러", "한성용", "한빛미디어", 24000));
		books.add(new Book("텐서플로 첫걸음", "박해선", "한빛미디어", 16000));
		books.add(new Book("자바의 정석", "남궁성", "도우출판사", 30000));
		books.add(new Book("AngularJS 2 프로그래밍", "정진욱", "위키북스", 27000));
		books.add(new Book("모두의 파이썬", "이승찬", "길벗", 12000));
		books.add(new Book("자바8 인 액션", "우정은", "한빛미디어", 28000));
		books.add(new Book("자바스크립트 패턴과 테스트", "이일웅", "길벗", 38000));
		
		ArrayList<Book> list1 = SearchBooksByTitle(books,"자바다");
		for (Book b: list1) {
			System.out.println(b.getTitle());
		}
		
		ArrayList<Book> list2 = SearchBooksByPrice(books, 2000,30000);
		for (Book b: list2) {
			System.out.println(b.getTitle());
		}
		
		
		ArrayList<Book> list3 = SearchBooksByPub(books,"길벗");
		for (Book b: list3) {
			System.out.println(b.getTitle());
			
		HashSet<String> list4 = collectPub(books);
		for (String pub : list4) {
			System.out.println(pub);
		}
			
		}
	}
	
	public static class Book{
		private String title;
		private String author;
		private String pub;
		private int price;
		
		public Book() {}

		public Book(String title, String author, String pub, int price) {
			super();
			this.title = title;
			this.author = author;
			this.pub = pub;
			this.price = price;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getAuthor() {
			return author;
		}

		public void setAuthor(String author) {
			this.author = author;
		}

		public String getPub() {
			return pub;
		}

		public void setPub(String pub) {
			this.pub = pub;
		}

		public int getPrice() {
			return price;
		}

		public void setPrice(int price) {
			this.price = price;
		}

		@Override
		public String toString() {
			return "Book [title=" + title + ", author=" + author + ", pub=" + pub + ", price=" + price + "]";
		}
		
	}
}
