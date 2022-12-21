package org.bank;

public class AxisBank extends BankInfo {
	@Override
	public void deposite() {
		// TODO Auto-generated method stub
		System.out.println("Deposite 10%");
		System.out.println("dep");
	}
	
	public static void main(String[] args) {
		AxisBank a=new AxisBank();
		a.deposite();
		
		BankInfo b=new BankInfo();
		b.deposite();
		
		BankInfo b1=new AxisBank();
		b1.deposite();
		
	}


	}


