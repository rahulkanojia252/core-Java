package test;

public class LoopingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num =2;
		
		while(num<=10) {
			
			if(num==6) {
				
				num = num+2;
				continue;
			}
				
			System.out.println(num);	
			num = num+2;
			
		}
		
		
		System.out.println("After While Loop");
		

		// for loop
		
		for(int index=1;index<=10;index++) {
			
			if(index==6) {
				continue;
			}
			
			System.out.println(index);
			
		}
		
		System.out.println("After For Loop");
		
		int[] array1 = {10,20,30,40,50,60};
		
		for(int num1:array1) {
			
			System.out.println(num1);
		}


		// Write the logic to print all the array values using normal for loop

for(int index=0;index<array1.length;index++) {
			
			System.out.println(array1[index]);
		}
		



	}

}
