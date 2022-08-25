package hcf;

public class hcf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=60;   
        int num2=36;   
        int hcf=1;  
        for(int i=1;i<=num1||i<=num2;i++)  
        {
            if( num1%i==0 && num2%i==0)  
              
            {
                hcf=i;
            }
        }
        System.out.println("HCF of num1 and num2:"+hcf);
	}

}
