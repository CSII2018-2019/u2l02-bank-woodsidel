import javax.swing.JOptionPane;
public class U2L02Bank {

	public static void main(String[] args) {
		String withOrDes = "";
		JOptionPane.showMessageDialog(null, "Welcome to the Bank!");
		String accountType = JOptionPane.showInputDialog("Do you want to open an account with the default or a custom low balance?");
		if(accountType.equals("custom")) {
			BankAccount newAccount = new BankAccount("Lowrie",382.38, 150);
			String customOne = JOptionPane.showInputDialog("Input your lowest balance allowable");
			double custom = Double.parseDouble(customOne);
			withOrDes = JOptionPane.showInputDialog("Do you want to withdraw or deposit?");
			if(withOrDes.equals("withdraw")) {
				BankAccount.withdrawl(382.38, custom, "yes");;
			}
			else if(withOrDes.equals("deposit")){
				BankAccount.deposit(392.38, custom);
			}
			JOptionPane.showMessageDialog(null,BankAccount.getName()+"'s Bank Account holds $"+BankAccount.getBalance()+" with a lowest balance allowable of $"+BankAccount.getLowest());
		}else if(accountType.equals("default")) {
			BankAccount newAccount = new BankAccount("Lowrie",382.38);
			withOrDes = JOptionPane.showInputDialog("Do you want to withdraw or deposit?");
			if(withOrDes.equals("withdraw")) {
				BankAccount.withdrawl(382.38, 100, "yes");;
			}
			else if(withOrDes.equals("deposit")){
				BankAccount.deposit(392.38, 100);
			}
			JOptionPane.showMessageDialog(null,BankAccount.getName()+"'s Bank Account holds $"+BankAccount.getBalance()+" with a lowest balance allowable of $"+BankAccount.getLowest());
				
			}
		}

	
		

	}


