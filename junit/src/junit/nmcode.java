package junit;

public class nmcode {
	
	int num1,num2;
	
	nmcode(int num1,int num2){
		this.num1=num1;
		this.num2=num2;
	}
	
	int add()
	{
		return num1+num2;
	}

	int sub()
	{
		return num1-num2;
	}

	int mul()
	{
		return num1*num2;
	}

	int div()
	{
		return num1/num2;
	}
	boolean validate(){
		if(num1>2 && num2>2) {
			return true;
			
		}
		else {
			return false;
		}
		
	
	}
	

}
