//program to perform swapping and find factorial values

class Practical1{
	public static void main(String a[]){
		int num1=10, num2=20, temp; 
		
		//swapping
		
		
		temp = num1;    // tmp = a;
		num1 = num2;    //  a = b;
		num2 = temp;	// b = temp;
		
		//num1 = num1 + num2; //10+20=30     a = a + b;  -->> a = 30        
		//num2 = num1 - num2; //30-20=10     b = a - b;  -->> b = 10 *	   
		//num1 = num1 - num2; //30-10=20	 a = a - b;  -->> a = 20 *	   
		
		System.out.println(" \n num1 is  " + num1);
		System.out.println(" num2 is  " + num2);
		
		//Factorial
		int i, n, fact=1;
		
		n = Integer.parseInt(a[0]);
		
		for(i=1; i< n; i++){
			fact = fact + (fact * i);
		}
		
		System.out.println(" \n Value is : " + n);
		System.out.println(" \n Factorial of " + n + " is " + fact);
	}
}
