package com.qait.svm.Test;

public class PnbMain {

	public static void main(String[] args) {
		//Creating Object of class PNB
		Account pnbAcount=new PNB();
		
		//Calling Overridden class methods
		pnbAcount.currentAccount();
		pnbAcount.savingAccount();
		pnbAcount.fixedAccount();
		
		
		//Printing final veriable
		System.out.println(pnbAcount.MAX_ACCOUNT_PER_CUSTOMER);

	}

}
