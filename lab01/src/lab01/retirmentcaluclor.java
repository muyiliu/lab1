package lab01;

import java.util.Scanner;
//Muyi Liu, Bryan Leach, ruoyang wang
public class retirmentcaluclor {

	public static void main(String[] args) {
	double Years_to_work;
	double Return_while_working;
	double Years_retired;
	double Return_while_retire;
	double Required_income;
	double SSI;
	double What_you_need_saved;
	double Monthly_payment;
	
	
	Scanner input = new Scanner(System.in);
	System.out.println("How many years are you working?");
	Years_to_work=input.nextDouble();
	do{
	System.out.println("How many rate do you want to return? The range is 0-20");
	Return_while_working=input.nextDouble();
	}while(Return_while_working<=0||Return_while_working>20);
	System.out.println("How many years do you retire?");
	Years_retired= input.nextDouble();
	do{
	System.out.println("How many rate do want after you retiring? ");
	Return_while_retire=input.nextDouble();}while(Return_while_retire<=0||Return_while_retire>3);
	System.out.println("How many money do you want for require income?");
	Required_income=input.nextDouble();
	System.out.println("How many money do you expect from the government?");
	SSI=input.nextDouble();
	input.close();
	What_you_need_saved= ((Required_income-SSI)*(1-(1/Math.pow((1+Return_while_retire/1200),Years_retired*12))))/(Return_while_retire/1200);
	System.out.println(What_you_need_saved);
	Monthly_payment = ((Return_while_working/1200)*What_you_need_saved)/(Math.pow(1+Return_while_working/1200,12*Years_to_work)-1);
	System.out.println(Monthly_payment);
	
	
	
		// TODO Auto-generated method stub

	}

}
