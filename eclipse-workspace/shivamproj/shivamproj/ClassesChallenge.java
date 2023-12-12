package shivamproj;
import java.util.*;
public class ClassesChallenge {
private double accountnumber;
private double accountbalance;
private String customername;
private String email;
private double phno;
double balance=0;
public ClassesChallenge() {
	System.out.println("constructor called");
}
public ClassesChallenge(String customername,String email,double phno,double accountbalance,double accountnumber) {
	this.customername=customername;
	this.accountbalance=accountbalance;
	this.email=email;
	setAccountnumber(accountnumber);
	this.phno=phno;
//	System.out.println("constructor  another called");
	}
	public double getAccountnumber() {
	return accountnumber;
}
public void setAccountnumber(double accountnumber) {
	if(accountnumber<30) {
		
		this.accountnumber = accountnumber;   //in setters we can add validations
	}else {
		System.out.println("value high");
	}
}
public double getAccountbalance() {
	return accountbalance;
}
public void setAccountbalance(double accountbalance) {
	this.accountbalance = accountbalance;
}
public String getCustomername() {
	return customername;
}
//public void setCustomername(String customername) {
//	this.customername = customername;
//}
public String getEmail() {
	return email;
}
//public void setEmail(String email) {
//	this.email = email;
//}
public double getPhno() {
	return phno;
}
//public void setPhno(double phno) {
//	this.phno = phno;
//}

public double depositfund(double value){
	balance +=value;
	System.out.println(balance);
	return balance;
}
public double withdrawfund(double withdraw) {
	if(balance <=0 || withdraw >balance) {
		System.out.println("balance low");
	}
	else {
		
	balance -=withdraw;
	System.out.println(balance);
	}
	
	return balance;
}
public double balanceinacc() {
	return balance;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter a value");
//		double c=sc.nextDouble();
		ClassesChallenge cd=new ClassesChallenge("shivam","s@gmail.com",22,123,66);
		System.out.println(cd.getAccountbalance());
		System.out.println(cd.getAccountnumber());
		System.out.println(cd.getCustomername());
		System.out.println(cd.getEmail());
		System.out.println(cd.getPhno());
//		ClassesChallenge cdn=new ClassesChallenge();
		
//		cd.depositfund(c);
//		cd.balanceinacc();	
//		cd.withdrawfund(7000);
//		cd.balanceinacc();
	}

}
