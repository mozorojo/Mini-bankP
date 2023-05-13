package com.ssi;

public class Main extends BankActions {

	public static void main(String[] args) {
		BankActions bankFunction= new Main();
		
		bankFunction.addAccount("1234567", 15000);
		//bank1.addAccount("1234567",12000);
		bankFunction.getBalance("1234567");
		bankFunction.deposit("1234567", 2020);
		bankFunction.accountExists("1234567");


		bankFunction.addAccount("987654", 10000);
		bankFunction.withdraw("987654", 1500);



	}


}
