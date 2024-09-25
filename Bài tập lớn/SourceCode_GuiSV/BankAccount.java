public class BankAccount implements Payment, Transfer{
    private int soTaiKhoan;
    private double tiLeLaiSuat;
    private double soDu;

    public BankAccount(int soTaiKhoan, double tiLeLaiSuat) {
        this.soTaiKhoan = soTaiKhoan;
        this.tiLeLaiSuat = tiLeLaiSuat;
        this.soDu = 50.0;
    }

    public boolean pay(double amount) {
		if(this.soDu < 50.0) {
			return false;
		}
		if(this.soDu < amount + 50.0) {
			return false;
		}
		this.soDu -= amount;
		return true;
	}

	public boolean transfer (double amount, Transfer to) {
		double soTienChuyen = 0.0;
		soTienChuyen = amount + transferFee * amount;
		if(50.0 + soTienChuyen <= this.soDu) {
			if (to instanceof EWallet) {
				EWallet temp = (EWallet) to;
				this.soDu -= soTienChuyen;
				temp.topUp(amount);
				return true;
			} 
			else if (to instanceof BankAccount) {
				BankAccount temp = (BankAccount) to;
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

	public int getSoTaiKhoan() {
		return this.soTaiKhoan;
	}
	
    public String toString() {
        return this.soTaiKhoan + "," + this.tiLeLaiSuat + "," + this.soDu;
    }
}