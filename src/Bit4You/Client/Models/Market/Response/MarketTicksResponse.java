package Bit4You.Client.Models.Market.Response;

import com.google.gson.annotations.SerializedName;

public class MarketTicksResponse {

    @SerializedName("time")
    private int Time;
    @SerializedName("open")
    private String Open;
    @SerializedName("close")
    private String Close;
    @SerializedName("low")
    private String Low;
    @SerializedName("high")
    private String High;
    @SerializedName("volume")
    private String Volume;
    @SerializedName("marketVolume")
    private String MarketVolume;

    public void setTime(int time) {
        Time = time;
    }

    public void setOpen(String open) {
        Open = open;
    }

    public void setClose(String close) {
        Close = close;
    }

    public void setLow(String low) {
        Low = low;
    }

    public void setHigh(String high) {
        High = high;
    }

    public void setVolume(String volume) {
        Volume = volume;
    }

    public void setMarketVolume(String marketVolume) {
        MarketVolume = marketVolume;
    }

    public int getTime() {
        return Time;
    }

    public String getOpen() {
        return Open;
    }

    public String getClose() {
        return Close;
    }

    public String getLow() {
        return Low;
    }

    public String getHigh() {
        return High;
    }

    public String getVolume() {
        return Volume;
    }

    public String getMarketVolume() {
        return MarketVolume;
    }
}
