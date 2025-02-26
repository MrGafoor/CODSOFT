import java.util.Scanner;
class BankAcc{
	private String Acc_Holder;
	private float balance;
	//to initialize variables use constructor
	BankAcc(String Acc_Holder,float balance){
		this.Acc_Holder=Acc_Holder;
		this.balance=balance;
	}

	public float checkBalance(){ //to check balance
		return balance;
	}
	
	public boolean deposit(float money){ //for deposit
		if(money>0){
			balance+=money;
		return true;
		}
	return false;
	}
	public boolean withdraw(float money){ //for withdraw
		if(money>0 && money<=balance){
			balance-=money;
		return true;
		}
	return false;
	}
}
class Atm{
	private BankAcc bankaccount; //using above class for bank account opreations (methods)
	Atm(BankAcc bankaccount){
		this.bankaccount=bankaccount;
	}
	Scanner sc=new Scanner(System.in);
	
	//check balance
	public void showbalance(){
		System.out.print("Now Your balance is : "+bankaccount.checkBalance());
		System.out.println();
	}
	//deposit
	public void depo(){
		float money=sc.nextInt();
		if(bankaccount.deposit(money)){
			System.out.println();
			System.out.print("==>Deposit of "+money+" rupees is Done successfully!");
		}	
		System.out.println();
	}

	//withdraw
	public void wthdw(){
		float money=sc.nextInt();
		if(bankaccount.withdraw(money)){
			System.out.println();
			System.out.print("==>WithDraw of "+money+" rupees is Done successfully!");
		}else{
			System.out.print("Insufficient balance..!");
		System.out.println();
		}
	}
	public void displayInterface(){
		while(true){
			System.out.println();
			System.out.println("--- ATM Menu ---");	
			System.out.println("1. Check Balance");
			System.out.println("2. Deposit Money");
			System.out.println("3. WithDraw Money");
			System.out.println("4. Exit");

			System.out.print("Choose an option:");
			
			int option=sc.nextInt();
			
			if(option==2 || option==3){
				System.out.print("Enter the Amount: ");
			}
			
			
			switch (option) {
				case 1:
                    			showbalance();
                    			break;
				case 2:
                    			depo();
                    			break;
				case 3:
                    			wthdw();
                    			break;
				case 4:
					System.out.println();
                   			System.out.println("Thank You , Have a Good Day..!");
                    			return;
				default:
                  			  System.out.println("Not valid option, Please try again..!");
            		}
		}
	}

}
public class AtmInterface {
    public static void main(String[] args) {
		BankAcc newacc= new BankAcc("Abdul_Gafoor",5000);
		Atm machine=new Atm(newacc);
		machine.displayInterface();
		
	}
}


				
				

			
			
			

			

	
	
