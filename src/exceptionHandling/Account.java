package exceptionHandling;

class Account {

	private String ownerName;
	private double balance;

	public Account() {
		ownerName = "Unassigned";
		balance = 0.0;
	}

	// amt cannot be 0 or negative
	public void add(double amt) throws IllegalArgumentException {
		// Exception IllegalArgumentException = new IllegalArgumentException("The value
		// is to small");
		if (balance <= 0)
			throw new IllegalArgumentException(" amount cannot be 0 or negative");
		balance = balance + amt;

	}

	// amt cannot be 0 or negative
	public void deduct(double amt) throws IllegalArgumentException {
		add(amt);
		balance = balance - amt;
	}

	public double getBalance() {
		return balance;
	}

	public String getOwnerName() {
		return ownerName;
	}

	// bal cannot be negative
	public void setBalance(double bal) throws IllegalArgumentException {
		deduct(bal);
		balance = bal;
	}

	public void setOwnerName(String name) {
		ownerName = name;
	}

	public static void main(String[] args) throws IllegalArgumentException {
		Account balance = new Account();
		balance.deduct(400);
		System.out.println(balance.getBalance());
		balance.add(200);
		System.out.println(balance.getBalance());

//or
//		try {
//			if (balance.getBalance() <= 0) {
//				throw new IllegalArgumentException("H");
//			} else {
//				System.out.println(balance.getBalance());
//			}
//		} catch (InputMismatchException e) {
//			System.out.println("please add greter than 0 number");
//		} catch (IllegalArgumentException e) {
//			System.out.println(e.getMessage());
//		}

	}
}