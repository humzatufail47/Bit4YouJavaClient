package Bit4You.Client.Models.Portfolio.Response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class PortfolioListResponse {

    @SerializedName("items")
    private List<Item> Items;
    @SerializedName("wallet")
    private String Wallet;

    public List<Item> getItems() {
        return Items;
    }

    public String getWallet() {
        return Wallet;
    }

    public void setItems(List<Item> items) {
        Items = items;
    }

    public void setWallet(String wallet) {
        Wallet = wallet;
    }
}

class Item {
    @SerializedName("id")
    private int Id;
    @SerializedName("baseIso")
    private String BaseIso;
    @SerializedName("market")
    private String Market;
    @SerializedName("invested")
    private String Invested;
    @SerializedName("quantity")
    private String Quantity;
    @SerializedName("openTime")
    private int OpenTime;


    public void setId(int id) {
        Id = id;
    }

    public void setBaseIso(String baseIso) {
        BaseIso = baseIso;
    }

    public void setMarket(String market) {
        Market = market;
    }

    public void setInvested(String invested) {
        Invested = invested;
    }

    public void setQuantity(String quantity) {
        Quantity = quantity;
    }

    public void setOpenTime(int openTime) {
        OpenTime = openTime;
    }

    public int getId() {
        return Id;
    }

    public String getBaseIso() {
        return BaseIso;
    }

    public String getMarket() {
        return Market;
    }

    public String getInvested() {
        return Invested;
    }

    public String getQuantity() {
        return Quantity;
    }

    public int getOpenTime() {
        return OpenTime;
    }
}
