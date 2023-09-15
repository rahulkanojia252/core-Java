package oops;

public class BOABank extends Bank{
	public int CreditcardNum;
	public void CCBalance() {
		System.out.println("Inside CC balance");
	}
	//overridingexample
	public void CloseAccount(int CCNumber) {
		System.out.println("Inside BOA CloseAccount");
	}
}
