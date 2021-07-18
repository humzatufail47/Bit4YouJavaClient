package Bit4You.Client.Models.Market.Response;

import com.google.gson.annotations.SerializedName;

public class MarketSummrieResponse {

    @SerializedName("market")
    private String Market ;
    @SerializedName("marketCap")
    private double MarketCap;
    @SerializedName("high")
    private double High;
    @SerializedName("low")
    private double Low;
    @SerializedName("volume")
    private double Volume;
    @SerializedName("last")
    private double Last;
    @SerializedName("prevDay")
    private double PrevDay;
    @SerializedName("bid")
    private double Bid;
    @SerializedName("ask")
    private double Ask;
    @SerializedName("open")
    private double Open;


    public void setMarket(String market) {
        Market = market;
    }

    public void setMarketCap(double marketCap) {
        MarketCap = marketCap;
    }

    public void setHigh(double high) {
        High = high;
    }

    public void setLow(double low) {
        Low = low;
    }

    public void setVolume(double volume) {
        Volume = volume;
    }

    public void setLast(double last) {
        Last = last;
    }

    public void setPrevDay(double prevDay) {
        PrevDay = prevDay;
    }

    public void setBid(double bid) {
        Bid = bid;
    }

    public void setAsk(double ask) {
        Ask = ask;
    }

    public void setOpen(double open) {
        Open = open;
    }

    public String getMarket() {
        return Market;
    }

    public double getMarketCap() {
        return MarketCap;
    }

    public double getHigh() {
        return High;
    }

    public double getLow() {
        return Low;
    }

    public double getVolume() {
        return Volume;
    }

    public double getLast() {
        return Last;
    }

    public double getPrevDay() {
        return PrevDay;
    }

    public double getBid() {
        return Bid;
    }

    public double getAsk() {
        return Ask;
    }

    public double getOpen() {
        return Open;
    }
}
