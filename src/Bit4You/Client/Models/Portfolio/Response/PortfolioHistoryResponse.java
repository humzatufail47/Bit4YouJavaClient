package Bit4You.Client.Models.Portfolio.Response;

import com.google.gson.annotations.SerializedName;

public class PortfolioHistoryResponse {

    @SerializedName("id")
    private int Id;
    @SerializedName("market")
    private String Market;
    @SerializedName("baseCurrency")
    private String BaseCurrency;
    @SerializedName("invested")
    private String Invested;
    @SerializedName("closed_amount")
    private String ClosedAmount;
    @SerializedName("quantity")
    private String Quantity;
    @SerializedName("fee")
    private String Fee;
    @SerializedName("open_time")
    private int OpenTime;
    @SerializedName("close_time")
    private int CloseTime;


    public void setId(int id) {
        Id = id;
    }

    public void setMarket(String market) {
        Market = market;
    }

    public void setBaseCurrency(String baseCurrency) {
        BaseCurrency = baseCurrency;
    }

    public void setInvested(String invested) {
        Invested = invested;
    }

    public void setClosedAmount(String closedAmount) {
        ClosedAmount = closedAmount;
    }

    public void setQuantity(String quantity) {
        Quantity = quantity;
    }

    public void setFee(String fee) {
        Fee = fee;
    }

    public void setOpenTime(int openTime) {
        OpenTime = openTime;
    }

    public void setCloseTime(int closeTime) {
        CloseTime = closeTime;
    }

    public int getId() {
        return Id;
    }

    public String getMarket() {
        return Market;
    }

    public String getBaseCurrency() {
        return BaseCurrency;
    }

    public String getInvested() {
        return Invested;
    }

    public String getClosedAmount() {
        return ClosedAmount;
    }

    public String getQuantity() {
        return Quantity;
    }

    public String getFee() {
        return Fee;
    }

    public int getOpenTime() {
        return OpenTime;
    }

    public int getCloseTime() {
        return CloseTime;
    }
}
