package kr.jhta.bookstore;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class BookStore {
	private Scanner sc = new Scanner(System.in);
	private ArrayList<Customer> customerList = new ArrayList<Customer>();
	private Customer loginedUser = null;
//	가입 기능

	private boolean isExistId(String id) {
		boolean isExist = false;
		
		for (Customer customer : customerList) {
			if(customer.getId().equals(id)) {
				isExist = true;
				break;
			}
		}
		return isExist;
	}
	
	
	public void register() {
		System.out.println("아이디를 입력하세요: ");
		String id = sc.nextLine();
		if (isExistId(id)) {
			System.out.println("이미 사용중인 아이디 입니다.");
			return;
		}
		
		System.out.println("이름을 입력하세요: ");
		String name = sc.nextLine();
		
		System.out.println("비밀번호를 입력하세요: ");
		String pwd= sc.nextLine();
		System.out.println("전화번호를 입력하세요: ");
		String tel = sc.nextLine();
		System.out.println("이메일을 입력하세요: ");
		String email = sc.nextLine();	
		Date regdate =new Date(); 
	
		Customer customer = new Customer();
		customer.setName(name);
		customer.setId(id);
		customer.setPwd(pwd);
		customer.setTel(tel);
		customer.setEmail(email);
		customer.setRegdate(regdate);
		customer.setPoint(0);
		
		customerList.add(customer);

	}
	
//	로그인 기능	// 사용자의 식별정보를 서버에 담아두려고 로그인 기능을 이용한다. 
	
	
	
	public void login() {
		System.out.println("아이디를 입력하세요: ");
		String id = sc.nextLine();
		System.out.println("비밀번호를 입력하세요: ");
		String pwd= sc.nextLine();
		
		
		for (Customer customer: customerList) {
			if (customer.getId().equals(id) && customer.getPwd().equals(pwd)) {
				loginedUser = customer;
				System.out.println("["+loginedUser.getName()+"] 님 환영합니다.");
			}
		}
		
		if (loginedUser == null) {
			System.out.println("아이디가 올바르지 않거나 비밀번호가 일치하지 않습니다.");
		}
	}
	

}
