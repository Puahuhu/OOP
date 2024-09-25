public class EWallet implements Payment, Transfer {
	private int soDienThoai;
	private double soDu;

	public EWallet(int soDienThoai) {
		this.soDienThoai = soDienThoai;
		this.soDu = 0.0;
	}

	public boolean pay(double amount) {
		if(this.soDu < amount) {
			return false;
		}
		this.soDu -= amount;
		return true;
	}

	public boolean transfer (double amount, Transfer to) {
		double soTienChuyen = 0.0;
		soTienChuyen = amount + transferFee * amount;
		if(soTienChuyen <= this.soDu) {
			if (to instanceof BankAccount) {
				BankAccount temp = (BankAccount) to;
				this.soDu -= soTienChuyen;
				temp.topUp(amount);
				return true;
			} 
		else if (to instanceof EWallet) {
				EWallet temp = (EWallet) to;
				this.soDu -= soTienChuyen;
				temp.topUp(amount);
				return true;
        	}
		}
		return false;
	}

    public double checkBalance() {
		return this.soDu;
	}

	public void topUp(double amount) {
		this.soDu += amount;
	}

	public int getSoDienThoai() {
		return this.soDienThoai;
	}

	public String toString() {
		return this.soDienThoai + "," + this.soDu;
	} 
}