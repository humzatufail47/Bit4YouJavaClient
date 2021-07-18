package Bit4You.Client.Models.Wallet.Request;

import Bit4You.Client.Models.Simulations;
import com.google.gson.annotations.SerializedName;

public class WalletTransaction extends Simulations {

    @SerializedName("iso")
    private String Iso;

    public void setIso(String iso) {
        Iso = iso;
    }

    public String getIso() {
        return Iso;
    }
}
