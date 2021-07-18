package Bit4You.Client.Models.Wallet.Request;

import com.google.gson.annotations.SerializedName;

public class WalletFunds {

    @SerializedName("iso")
    private String Iso;
    @SerializedName("quantity")
    private double Quantity;
    @SerializedName("address")
    private String Address;


    public void setIso(String iso) {
        Iso = iso;
    }

    public void setQuantity(double quantity) {
        Quantity = quantity;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getIso() {
        return Iso;
    }

    public double getQuantity() {
        return Quantity;
    }

    public String getAddress() {
        return Address;
    }
}
