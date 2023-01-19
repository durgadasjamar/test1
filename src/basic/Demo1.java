package basic;

public class Demo1 {
	public static void main(String[]args) 
	{//Step1-Array declaration
		char cr1[]=new char[4];
	//Step2- Array initialization
		cr1[0]='A';
		cr1[1]='B';
		cr1[2]='C';
		cr1[3]='D';
		
		//Usage
		System.out.println(cr1.length);
		
		for(int i=0;i<=3;i=i+1) 
		{
			System.out.println(cr1[i]);
		}
		
}
}