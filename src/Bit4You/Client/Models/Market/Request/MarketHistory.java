package Bit4You.Client.Models.Market.Request;

import com.google.gson.annotations.SerializedName;

public class MarketHistory {
    @SerializedName("market")
    private String Market;
    @SerializedName("limit")
    private int Limit;
    @SerializedName("from")
    private String From;
    @SerializedName("to")
    private String To;

    public void setMarket(String market) {
        Market = market;
    }

    public void setLimit(int limit) {
        Limit = limit;
    }

    public void setFrom(String from) {
        From = from;
    }

    public void setTo(String to) {
        To = to;
    }

    public String getMarket() {
        return Market;
    }

    public int getLimit() {
        return Limit;
    }

    public String getFrom() {
        return From;
    }

    public String getTo() {
        return To;
    }
}
