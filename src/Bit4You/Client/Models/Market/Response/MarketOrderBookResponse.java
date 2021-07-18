package Bit4You.Client.Models.Market.Response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MarketOrderBookResponse {
    @SerializedName("ask")
    public List<Ask> Ask;
    @SerializedName("bid")
    public List<Bid> Bid;

    public List<Bit4You.Client.Models.Market.Response.Ask> getAsk() {
        return Ask;
    }

    public List<Bit4You.Client.Models.Market.Response.Bid> getBid() {
        return Bid;
    }

    public void setAsk(List<Bit4You.Client.Models.Market.Response.Ask> ask) {
        Ask = ask;
    }

    public void setBid(List<Bit4You.Client.Models.Market.Response.Bid> bid) {
        Bid = bid;
    }
}

class Ask
{
    @SerializedName("quantity")
    private String  Quantity;
    @SerializedName("rate")
    private String Rate;
    @SerializedName("i")
    private int I;

    public String getQuantity() {
        return Quantity;
    }

    public String getRate() {
        return Rate;
    }

    public int getI() {
        return I;
    }

    public void setQuantity(String quantity) {
        Quantity = quantity;
    }

    public void setRate(String rate) {
        Rate = rate;
    }

    public void setI(int i) {
        I = i;
    }
}

class Bid
{
    @SerializedName("quantity")
    private String  Quantity;
    @SerializedName("rate")
    private String Rate;
    @SerializedName("i")
    private int I;

    public String getQuantity() {
        return Quantity;
    }

    public String getRate() {
        return Rate;
    }

    public int getI() {
        return I;
    }

    public void setQuantity(String quantity) {
        Quantity = quantity;
    }

    public void setRate(String rate) {
        Rate = rate;
    }

    public void setI(int i) {
        I = i;
    }
}
