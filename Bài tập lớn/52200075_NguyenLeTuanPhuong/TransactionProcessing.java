import java.util.*;
import java.io.*;

public class TransactionProcessing {
    private ArrayList<Payment> paymentObjects;
    private IDCardManagement idcm;
    
    public TransactionProcessing(String idCardPath, String paymentPath) {
        idcm = new IDCardManagement(idCardPath);
        readPaymentObject(paymentPath);
    }

    public ArrayList<Payment> getPaymentObject() {
        return this.paymentObjects;
    }

    // Requirement 3
    public boolean readPaymentObject(String path) {
        paymentObjects = new ArrayList<Payment>();
        try {
            File f = new File(path);
            Scanner sc = new Scanner(f);
            String data = "";
            String[] dataArr;
            while(sc.hasNextLine()) {
                data = sc.nextLine();
                dataArr = data.split(",");
                for(IDCard id : idcm.getIDCards()) {
                    if(id.getSoDinhDanh() == Integer.parseInt(dataArr[0]) && dataArr.length == 1) {
                        try {
                            paymentObjects.add(new ConvenientCard(id));
                        }
                        catch (CannotCreateCard e) {
                            e.printStackTrace();
                        }
                    }
                    if(id.getSoDienThoai() == Integer.parseInt(dataArr[0]) && dataArr.length == 1) {
                        paymentObjects.add(new EWallet(Integer.parseInt(dataArr[0])));
                    }
                    if(id.getSoDinhDanh() == Integer.parseInt(dataArr[0]) && dataArr.length == 2){
                        paymentObjects.add(new BankAccount(Integer.parseInt(dataArr[0]), Double.parseDouble(dataArr[1])));
                    }
                }
            }
            sc.close();
        }
        catch(IOException e) {
            e.printStackTrace();
        }
        return true;
    }

    // Requirement 4
    public ArrayList<ConvenientCard> getAdultConvenientCards() {
        ArrayList<ConvenientCard> temp = new ArrayList<ConvenientCard>();
        for(Payment p : paymentObjects) {
            if(p instanceof ConvenientCard) {
                ConvenientCard k = (ConvenientCard) p;
                if(k.getType().equals("Adult")) {
                    temp.add(k);
                }
            }
        }
        return temp;
    }

    // Requirement 5
    public ArrayList<IDCard> getCustomersHaveBoth() {
        ArrayList<IDCard> id = new ArrayList<IDCard>();
        ArrayList<ConvenientCard> cc = new ArrayList<ConvenientCard>();
        ArrayList<EWallet> ew = new ArrayList<EWallet>();
        ArrayList<BankAccount> bc = new ArrayList<BankAccount>();
        for(Payment p : paymentObjects) {
            if(p instanceof ConvenientCard) {
                ConvenientCard c = (ConvenientCard) p;
                cc.add(c);
            }
            if(p instanceof EWallet) {
                EWallet e = (EWallet) p;
                ew.add(e);
            }
            if(p instanceof BankAccount) {
                BankAccount b = (BankAccount) p;
                bc.add(b);
            }
        }
        
        for(ConvenientCard c : cc) {
            for(BankAccount b : bc) {
                if(c.getSoDinhDanh() == b.getSoTaiKhoan()) {
                    for(EWallet e : ew) {
                        if(c.getSoDienThoai() == e.getSoDienThoai()) {
                            id.add(c.getID());
                        }
                    }
                }
            }
        }

        return id;
    }

    // Requirement 6
    public void processTopUp(String path) {
        try {
            File f = new File(path);
            Scanner sc = new Scanner(f);
            String data = "";
            String[] dataArr;
            while(sc.hasNextLine()) {
                data = sc.nextLine();
                dataArr = data.split(",");
                if(dataArr[0].equals("CC")) {
                    for(Payment p : paymentObjects) {
                        if(p instanceof ConvenientCard) {
                            ConvenientCard c = (ConvenientCard) p;
                            if(Integer.parseInt(dataArr[1]) == c.getSoDinhDanh()) {
                                c.topUp(Double.parseDouble(dataArr[2]));
                            }
                        }
                    }
                }

                if(dataArr[0].equals("BA")) {
                    for(Payment p : paymentObjects) {
                        if(p instanceof BankAccount) {
                            BankAccount b = (BankAccount) p;
                            if(Integer.parseInt(dataArr[1]) == b.getSoTaiKhoan()) {
                                b.topUp(Double.parseDouble(dataArr[2]));
                            }
                        }
                    }
                }

                if(dataArr[0].equals("EW")) {
                    for(Payment p : paymentObjects) {
                        if(p instanceof EWallet) {
                            EWallet e = (EWallet) p;
                            if(Integer.parseInt(dataArr[1]) == e.getSoDienThoai()) {
                                e.topUp(Double.parseDouble(dataArr[2]));
                            }
                        }
                    }
                }
            }
            sc.close();
        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }

    // Requirement 7
    public ArrayList<Bill> getUnsuccessfulTransactions(String path) {
        ArrayList<Bill> bill = new ArrayList<Bill>();
        try {
            File f = new File(path);
            Scanner sc = new Scanner(f);
            String data = "";
            String[] dataArr;
            while(sc.hasNextLine()) {
                data = sc.nextLine();
                dataArr = data.split(",");
                if(dataArr[3].equals("BA")) {
                    for(Payment p : paymentObjects) {
                        if(p instanceof BankAccount) {
                            BankAccount b = (BankAccount) p;
                            if(Integer.parseInt(dataArr[4]) == b.getSoTaiKhoan()) {
                                if(!b.pay(Double.parseDouble(dataArr[1]))) {
                                    bill.add(new Bill(Integer.parseInt(dataArr[0]), Double.parseDouble(dataArr[1]), dataArr[2]));
                                }
                            }
                        }
                    }
                }

                if(dataArr[3].equals("CC")) {
                    for(Payment p : paymentObjects) {
                        if(p instanceof ConvenientCard) {
                            ConvenientCard c = (ConvenientCard) p;
                            if(Integer.parseInt(dataArr[4]) == c.getSoDinhDanh()) {
                                if(!c.pay(Double.parseDouble(dataArr[1]))) {
                                    bill.add(new Bill(Integer.parseInt(dataArr[0]), Double.parseDouble(dataArr[1]), dataArr[2]));
                                }
                            }
                        }
                    }
                }

                if(dataArr[3].equals("EW")) {
                    for(Payment p : paymentObjects) {
                        if(p instanceof EWallet) {
                            EWallet e = (EWallet) p;
                            if(Integer.parseInt(dataArr[4]) == e.getSoDienThoai()) {
                                if(!e.pay(Double.parseDouble(dataArr[1]))) {
                                    bill.add(new Bill(Integer.parseInt(dataArr[0]), Double.parseDouble(dataArr[1]), dataArr[2]));
                                }
                            }
                        }
                    }
                }
            }
            sc.close();
        }
        catch(IOException e) {
            e.printStackTrace();
        }
        return bill;
    }

    // Requirement 8
    public ArrayList<BankAccount> getLargestPaymentByBA(String path) {5
    
        ArrayList<BankAccount> bc = new ArrayList<BankAccount>();
        ArrayList<BankAccount> result = new ArrayList<BankAccount>();
        ArrayList<Double> successPay = new ArrayList<Double>();
        try {
            File f = new File(path);
            Scanner sc = new Scanner(f);
            String data = "";
            String[] dataArr;
            while(sc.hasNextLine()) {
                data = sc.nextLine();
                dataArr = data.split(",");
                if(dataArr[3].equals("BA")) {
                    for(Payment p : paymentObjects) {
                        if(p instanceof BankAccount) {
                            BankAccount b = (BankAccount) p;
                            if(Integer.parseInt(dataArr[4]) == b.getSoTaiKhoan()) {
                                if(b.pay(Double.parseDouble(dataArr[1]))) {
                                    bc.add(b);
                                    successPay.add(Double.parseDouble(dataArr[1]));
                                }
                            }
                        }
                    }
                }
            }
            sc.close();
        }
        catch(IOException e) {
            e.printStackTrace();
        }
        ArrayList<BankAccount> largestPay = new ArrayList<BankAccount>();
        double max = 0.0;
        for(int i = 0; i < bc.size(); i++) {
            BankAccount currentBA = bc.get(i);
            double currentPay = successPay.get(i);
            double total = currentPay;
            for(int j = i + 1; j < bc.size(); j++) {
                if(bc.get(j).getSoTaiKhoan() == currentBA.getSoTaiKhoan()) {
                    total += successPay.get(j);
                }
            }
            if(total > max) {
                largestPay.clear();
                largestPay.add(currentBA);
                max = total;
            }
            if(total == max && !largestPay.contains(currentBA)) {
                largestPay.add(currentBA);
            }
        }
        return largestPay;
    }

    //Requirement 9
    public void processTransactionWithDiscount(String path) {
        try {
            File f = new File(path);
            Scanner sc = new Scanner(f);
            String data = "";
            String[] dataArr;
            while(sc.hasNextLine()) {
                data = sc.nextLine();
                dataArr = data.split(",");
                if(dataArr[3].equals("CC")) {
                    for(Payment p : paymentObjects) {
                        if(p instanceof ConvenientCard) {
                            ConvenientCard c = (ConvenientCard) p;
                            if(c.getSoDinhDanh() == Integer.parseInt(dataArr[4])) {
                                c.pay(Double.parseDouble(dataArr[1]));
                            }
                        }
                    }
                }
                if(dataArr[3].equals("BA")) {
                    for(Payment p : paymentObjects) {
                        if(p instanceof BankAccount) {
                            BankAccount b = (BankAccount) p;
                            if(b.getSoTaiKhoan() == Integer.parseInt(dataArr[4])) {
                                b.pay(Double.parseDouble(dataArr[1]));
                            }
                        }
                    }
                }
                if(dataArr[3].equals("EW")) {
                    for(Payment p : paymentObjects) {
                        if(p instanceof EWallet) {
                            EWallet ew = (EWallet) p; 
                            if(ew.getSoDienThoai() == Integer.parseInt(dataArr[4])) {
                                for(IDCard id : idcm.getIDCards()) {
                                    if(id.getSoDienThoai() == ew.getSoDienThoai()) {
                                        if((id.getTuoi() < 18 && id.getGioiTinh().equals("Female") && Double.parseDouble(dataArr[1]) > 500.0) || (id.getTuoi() < 20 && id.getGioiTinh().equals("Male") && Double.parseDouble(dataArr[1]) > 500.0)) {
                                            ew.pay(Double.parseDouble(dataArr[1]) * 85.0/100);
                                        }
                                        else {
                                            ew.pay(Double.parseDouble(dataArr[1]));
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}