package sample;

public class VendingMachineClient {
	
	public static void main(String[] args){
		
		VendingMachine vm = new VendingMachine(2000); //10000 �� �����鼭 ����
		
		System.out.println(vm.getDrink(2));
		
		System.out.println("�ܾ� �ޱ� : "+vm.getBanlance());
		
		System.out.println(vm.getDrink(2));
		
		vm = new VendingMachine(3000); //10000 �� �����鼭 ����
		
		System.out.println(vm.getDrink(4));
		
		System.out.println(vm.getDrink(0));
		System.out.println(vm.getDrink(0));
		System.out.println(vm.getDrink(0));
		System.out.println(vm.getDrink(0));
		
		
		
	}
}
