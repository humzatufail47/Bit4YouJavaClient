package Bit4You.Client.Models.Orders.Request;

import Bit4You.Client.Models.Simulations;
import com.google.gson.annotations.SerializedName;

public class OrderInfo extends Simulations {
    @SerializedName("txid")
    private String Txid;

    public String getTxid() {
        return Txid;
    }

    public void setTxid(String txid) {
        Txid = txid;
    }

    public Boolean getSimulation() {
        return Simulation;
    }
}
