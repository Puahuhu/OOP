public class ConvenientCard implements Payment{
	private double soDu;
	private IDCard id;
    private String type;

	public ConvenientCard(IDCard id) throws CannotCreateCard {
		this.id = id;
		this.soDu = 100.0;
		if(getTuoi() < 12) {
			throw new CannotCreateCard("Not enough age");
		}
		else if(getTuoi() <= 18) {
			this.type = "Student";
		}
		else {
			this.type = "Adult";
		}
	}
		 
	public String getType() {
		return this.type;
	}

	public boolean pay(double amount) {
		if(this.soDu < amount) {
			return false;
		}
		if(getType().equals("Student")) {
			this.soDu -= amount;
		}
		if(getType().equals("Adult")) {
			this.soDu -= (amount + (1.0)/100 * amount);
		}
		return true;
	}

    public double checkBalance() {
		return this.soDu;
	}

	public void topUp(double amount) {
		this.soDu += amount;
	}

	public int getTuoi() {
		return this.id.getTuoi();
	}

	public int getSoDienThoai() {
		return this.id.getSoDienThoai();
	}

    public int getSoDinhDanh() {
        return this.id.getSoDinhDanh();
    }

	public IDCard getID() {
		return this.id;
	}

	public String toString() {
		return this.id.toString() + "," + this.type + "," + this.soDu;
	}
}
