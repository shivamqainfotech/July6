package com.qait.svm.Test;

public class PNB implements Account {

	/**
	 * Method is used to show currentAccount
	 * 
	 * @return null
	 */
	public void currentAccount() {
		// currentAccount logic goes here
		System.out.println("currentAccount logic goes here");
		
	}

	@Override
	public void savingAccount() {
		// savingAccount logic goes here
		System.out.println("savingAccount logic goes here");
	}

	@Override
	public void fixedAccount() {
		// fixedAccount logic goes here
		System.out.println("fixedAccount logic goes here");
	}

}
