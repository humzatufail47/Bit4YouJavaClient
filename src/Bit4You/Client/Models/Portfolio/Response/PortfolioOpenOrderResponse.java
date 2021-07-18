package Bit4You.Client.Models.Portfolio.Response;

import com.google.gson.annotations.SerializedName;

public class PortfolioOpenOrderResponse {

    @SerializedName("id")
    private int Id;
    @SerializedName("type")
    private String Type;
    @SerializedName("execute_at")
    private String ExecuteAt;
    @SerializedName("remaining_quantity")
    private String RemainingQuantity;
    @SerializedName("remaining_iso")
    private String RemainingIso;
    @SerializedName("isOpening")
    private int IsOpening;
    @SerializedName("market")
    private String Market;
    @SerializedName("baseCurrency")
    private String BaseCurrency;
    @SerializedName("invested")
    private String Invested;
    @SerializedName("quantity")
    private String Quantity;
    @SerializedName("open_time")
    private int OpenTime;
    @SerializedName("close_time")
    private Object CloseTime;


    public void setId(int id) {
        Id = id;
    }

    public void setType(String type) {
        Type = type;
    }

    public void setExecuteAt(String executeAt) {
        ExecuteAt = executeAt;
    }

    public void setRemainingQuantity(String remainingQuantity) {
        RemainingQuantity = remainingQuantity;
    }

    public void setRemainingIso(String remainingIso) {
        RemainingIso = remainingIso;
    }

    public void setIsOpening(int isOpening) {
        IsOpening = isOpening;
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

    public void setQuantity(String quantity) {
        Quantity = quantity;
    }

    public void setOpenTime(int openTime) {
        OpenTime = openTime;
    }

    public void setCloseTime(Object closeTime) {
        CloseTime = closeTime;
    }

    public int getId() {
        return Id;
    }

    public String getType() {
        return Type;
    }

    public String getExecuteAt() {
        return ExecuteAt;
    }

    public String getRemainingQuantity() {
        return RemainingQuantity;
    }

    public String getRemainingIso() {
        return RemainingIso;
    }

    public int getIsOpening() {
        return IsOpening;
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

    public String getQuantity() {
        return Quantity;
    }

    public int getOpenTime() {
        return OpenTime;
    }

    public Object getCloseTime() {
        return CloseTime;
    }
}
