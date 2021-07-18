package Bit4You.Client.Models.Wallet.Response;

import com.google.gson.annotations.SerializedName;

public class WalletBalanceResponse {
    @SerializedName("iso")
    private String Iso;
    @SerializedName("name")
    private String Name;
    @SerializedName("tx")
    private String Tx;
    @SerializedName("tx_enabled")
    private boolean TxEnabled;
    @SerializedName("erc20")
    private boolean Erc20;
    @SerializedName("balance")
    private String Balance;
    @SerializedName("tx_explorer")
    private String TxExplorer;
    @SerializedName("digits")
    private int Digits;

    public void setIso(String iso) {
        Iso = iso;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setTx(String tx) {
        Tx = tx;
    }

    public void setTxEnabled(boolean txEnabled) {
        TxEnabled = txEnabled;
    }

    public void setErc20(boolean erc20) {
        Erc20 = erc20;
    }

    public void setBalance(String balance) {
        Balance = balance;
    }

    public void setTxExplorer(String txExplorer) {
        TxExplorer = txExplorer;
    }

    public void setDigits(int digits) {
        Digits = digits;
    }

    public String getIso() {
        return Iso;
    }

    public String getName() {
        return Name;
    }

    public String getTx() {
        return Tx;
    }

    public boolean isTxEnabled() {
        return TxEnabled;
    }

    public boolean isErc20() {
        return Erc20;
    }

    public String getBalance() {
        return Balance;
    }

    public String getTxExplorer() {
        return TxExplorer;
    }

    public int getDigits() {
        return Digits;
    }
}
