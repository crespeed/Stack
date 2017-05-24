package sample;

import java.util.List;
import java.util.Map;

public class VendingMachine {
	
	private String drinks[] = {"콜라","사이다","환타"}; //음료수목록
	private String drink;
	private int price; //가격
	private int amt; //투입금액
	
	 
	VendingMachine(int amt){ 
		this.amt = amt; 
	}
	
	private boolean isEmpty(int num){ //해당음료수가 있는지 확인 
		return drinks.length < num;
	}
	
	public boolean checkingBlance(){
		return amt >= price;
	}
	
	public String getDrink(int num){ //음료수 가져오기 

		if( isEmpty(num) ){
			return "Drink get Fail";
		}
		
		drink = drinks[num];
		
		if( drink == "콜라" ){
			price = 1000;
		}else if( drink == "사이다" ){
			price = 900;
		}else if( drink == "환타" ){
			price = 800;
		} 
		
		if(!checkingBlance()){
			System.out.println("잔액부족");
			return "잔액: "+getBanlance();
		}
		amt = amt - price;
		return drink+"를 받는다.";
	}
	
	
	public int getBanlance(){//현재남아있는 잔액을 가져오고 금액 0원으로 초기화
		int temp = amt;
		amt = 0;
		return temp;
	} 
	
	
	
	
}
