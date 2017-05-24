package sample;

public class ArrayStack {
	
	private int top;
	private int stackSize;
	private int[] arrayStack;
	
	ArrayStack(int stacksize){
		arrayStack = new int[stacksize];
		top = -1;
		this.stackSize = stacksize;
	}
	
	public boolean isEmpty(){
		return top == -1;
	}
	
	public boolean isFull(){
		return stackSize == top + 1;
	}
	
	public void push(int item){
		if( isFull() ){
			System.out.println("arrayStack is Full");
		}else{
			arrayStack[++top] = item;
		}
	}
	
	public int pop(){
		if( isEmpty() ){
			System.out.println("arrayStack is Empty");
			return -1;
		}else{
			return arrayStack[top--] = 0;
		}
	}
	
	public int get(int index){
		if( isEmpty() ){
			System.out.println("arrayStack is Empty");
			return -1;
		}else{
			return arrayStack[index];
		}
	}
	public int[] getAll(){
		if( isEmpty() ){
			System.out.println("arrayStack is Empty");
			return null;
		}else{
			return arrayStack;
		}
	}
}
