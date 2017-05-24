package sample;

public class VendingMachineClient {
	
	public static void main(String[] args){
		
		VendingMachine vm = new VendingMachine(2000); //10000 원 넣으면서 시작
		
		System.out.println(vm.getDrink(2));
		
		System.out.println("잔액 받기 : "+vm.getBanlance());
		
		System.out.println(vm.getDrink(2));
		
		vm = new VendingMachine(3000); //10000 원 넣으면서 시작
		
		System.out.println(vm.getDrink(4));
		
		System.out.println(vm.getDrink(0));
		System.out.println(vm.getDrink(0));
		System.out.println(vm.getDrink(0));
		System.out.println(vm.getDrink(0));
		
		
		
	}
}
