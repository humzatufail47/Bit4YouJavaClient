package Bit4You.Client.Models.Market.Request;

import com.google.gson.annotations.SerializedName;

public class MarketOrderBook {
    @SerializedName("market")
    private String Market;
    @SerializedName("limit")
    private int Limit;
    @SerializedName("state")
    private boolean State;

    public void setMarket(String market) {
        Market = market;
    }

    public void setLimit(int limit) {
        Limit = limit;
    }

    public void setState(boolean state) {
        State = state;
    }

    public String getMarket() {
        return Market;
    }

    public int getLimit() {
        return Limit;
    }

    public boolean isState() {
        return State;
    }
}
