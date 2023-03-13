package Buoi3.BT1;

public class TelephoneNumber {
    private int telephoneNumber;
    public TelephoneNumber(){

    }

    public TelephoneNumber(int telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public int getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(int telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    @Override
    public String toString() {
        return "TelephoneNumber{" +
                "telephoneNumber=" + telephoneNumber +
                '}';
    }
}
