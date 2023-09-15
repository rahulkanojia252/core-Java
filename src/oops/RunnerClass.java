package oops;

public class RunnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee E1 = new Employee();

		E1.Name = "Mike";
		E1.EmpId = 1000;
		E1.Department = "HR";
		E1.Display();

		Employee E2 = new Employee("Jack", 1001, "Finance");
		E2.Display();

		Bank B = new Bank();

		B.DisplayBalance();
		int Bal = B.GetBalance();
		B.AccountNum = 500;

		System.out.println("The Balance is " + B.GetBalance());
		System.out.println("The Balance is " + Bal);

		BOABank B1 = new BOABank();

		B1.CCBalance();
		B1.DisplayBalance();

		B1.AccountNum =100;

		//overloading example
		OverLoadingExample obj =new OverLoadingExample();

		int RecArea = obj.GetArea(3, 4);
		System.out.println(RecArea);
		int SqArea = obj.GetArea(4);
		System.out.println(SqArea);
		float SqAreaFloat = obj.GetArea(22f);
		System.out.println(SqAreaFloat);
		//overridingexmaple
		B1.CloseAccount(12345);
		B.CloseAccount(123456);
		
		//Abstarctionexample
		Chrome Ch= new Chrome();
		Ch.OpenBrowser();
		
		Browser Br= new Chrome();  //Chrome is used since Browser is parent abstract
		Br.OpenBrowser();
		Br.DisplayName();
		//Br.Show();   can't be used as Browser doesn't has it
		
		
		HondaCar car1 = new HondaCar();
		CarInterface car2 = new HondaCar();
		
		//encapsulation
		EncapsulationEx En= new EncapsulationEx();
		En.setBalance(3000);
		System.out.println(En.getBalance());
	}

}
