package Bit4You.Client.Models.Wallet.Response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class WalletTransactionResponse {

    @SerializedName("balance")
    private double Balance;
    @SerializedName("pages")
    private double Pages;
    @SerializedName("txs")
    private List<Object> Txs;


    public void setBalance(double balance) {
        Balance = balance;
    }

    public void setPages(double pages) {
        Pages = pages;
    }

    public void setTxs(List<Object> txs) {
        Txs = txs;
    }

    public double getBalance() {
        return Balance;
    }

    public double getPages() {
        return Pages;
    }

    public List<Object> getTxs() {
        return Txs;
    }
}
