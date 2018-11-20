import javax.swing.JOptionPane;
public class BankAccount {
	
	private static String accountName;
	private static double accountBalance;
	private static double lowBalance;
	public static String yesOrNo = "yes";
	
	public BankAccount(String name, double balance, double low) {
		setName(name);
		setBalance(balance, low );
		setLowestBalance(low);
		
		
	}
	public BankAccount(String name, double balance) {
		setName(name);
		lowBalance = 100; 
		setBalance(balance, lowBalance);
	}
	public static void setLowestBalance(double low) {
		if(low < 0) {
			lowBalance = 100;
		}else {
			lowBalance = low;
		}
	}
	public static void setName(String name) {
		if(name.equals(" ")) {
			accountName = "Steve";
		}else {
			accountName = name;
		}
	}
	private static void setBalance(double balance, double low) {
		if(balance <= 0) {
			accountBalance = 0;
			JOptionPane.showMessageDialog(null,"You have no money in the bank.");
			
		}
		else if(balance < low) {
			accountBalance = balance;
			JOptionPane.showMessageDialog(null,"You have less money in the bank than the lowest balance allowable.");
		}else {
			accountBalance = balance;
		}
			
	}
	public static void deposit(double accountBalance, double lowBalance) {
		String amount = JOptionPane.showInputDialog("Enter the amount of money you want to deposit into your account");
		double newAmount = Double.parseDouble(amount);
		accountBalance += newAmount;
		JOptionPane.showMessageDialog(null, "Your account now holds $"+accountBalance);
	}
	public static void withdrawl(double accountBalance, double lowBalance, String yesOrNo) {
		String amount = JOptionPane.showInputDialog("Enter the amount of money you want to withdraw from your account");
		double newAmount = Double.parseDouble(amount);
		if ((accountBalance - newAmount)< lowBalance) {
			yesOrNo = JOptionPane.showInputDialog("Are you sure?");
			if(yesOrNo.equals("yes")) {
				accountBalance -= newAmount;
			}else {
				JOptionPane.showMessageDialog(null, "Cancelling withdrawl...");
			}
		}else {
			accountBalance -= newAmount;
			JOptionPane.showMessageDialog(null, "Your withdrawl has been made. Your current balance is "+accountBalance);
		}
		
		
	}
	public static String getName() {
		return accountName;
	}
	public static double getBalance() {
		return accountBalance;
	}
	public static double getLowest() {
		return lowBalance;
	}

	
	
	
}
