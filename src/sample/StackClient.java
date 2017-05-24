package sample;

public class StackClient {
	
	public static void main(String[]args){
		
		ArrayStack as = new ArrayStack(10);
		
		as.push(1); 
		as.push(2); 
		
		System.out.println("get :"+as.get(0));
		System.out.println("get :"+as.get(1));
		
		as.push(3);
		as.pop();
		
		System.out.println("get : "+as.get(2));
		
		as.push(3);
		
		System.out.println("get : "+as.get(2));
		System.out.println("수정 get : "+as.get(2)); 
		
		int[] arr = as.getAll();
		for( int i=0; i < arr.length; i++){
			System.out.println(arr[i]); 
		}

		
	}
}
