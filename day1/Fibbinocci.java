package week1.day1;

public class Fibbinocci {

	public static void main(String[] args) {
		
		int firstNum=0,secNum=1,n3,i,sum=13;    
		 System.out.print(firstNum+" "+secNum);  
		    
		 for(i=2;i<sum;++i)    
		 {    
		  n3=firstNum+secNum;    
		  System.out.print(" "+n3);    
		  firstNum=secNum;    
		  secNum=n3;    
		 }    

	}

}
