package week1.day1;

public class Fibbinocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
           int firstNum=0;
           int secNum=1;
           int num=20;
           int sum;
           
           System.out.println(firstNum);
           System.out.println(secNum);
           for(int i=3;i<=num;i++)
           {
            sum=firstNum+secNum;
            System.out.println(sum);
            firstNum=secNum;
            secNum=sum;
            
           }
	}
}
        		   
           