package sample;

import java.util.List;
import java.util.Map;

public class VendingMachine {
	
	private String drinks[] = {"�ݶ�","���̴�","ȯŸ"}; //��������
	private String drink;
	private int price; //����ݾ�
	private int amt; //���Աݾ�
	
	
	VendingMachine(int amt){
		this.amt = amt; 
	}
	
	private boolean isEmpty(int num){ //�ش�������� �����ϴ��� Ȯ��
		return drinks.length < num;
	}
	
	public boolean checkingBlance(){
		return amt >= price;
	}
	
	public String getDrink(int num){ //���Ḧ �����Ͽ� �������� ���

		if( isEmpty(num) ){
			return "Drink get Fail";
		}
		
		drink = drinks[num];
		
		if( drink == "�ݶ�" ){
			price = 1000;
		}else if( drink == "���̴�" ){
			price = 900;
		}else if( drink == "ȯŸ" ){
			price = 800;
		} 
		
		if(!checkingBlance()){
			System.out.println("�ܾ׺���");
			return "�ܾ� : "+getBanlance();
		}
		amt = amt - price;
		return drink+"�� �޾Ҵ�.";
	}
	
	
	public int getBanlance(){
		int temp = amt;
		amt = 0;
		return temp;
	} 
	//�ܾ� �������� ���
	
	
	
}
