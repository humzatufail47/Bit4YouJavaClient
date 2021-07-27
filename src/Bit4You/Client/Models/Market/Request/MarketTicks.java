package Bit4You.Client.Models.Market.Request;

import com.google.gson.annotations.SerializedName;

public class MarketTicks {
    @SerializedName("market")
    private String Market;
    @SerializedName("interval")
    private int Interval;
    @SerializedName("ClientId")
    protected String ClientId;
    @SerializedName("TimingForce")
    protected String TimingForce;

    public String getClientId() {
        return ClientId;
    }

    public void setClientId(String clientId) {
        ClientId = clientId;
    }

    public String getTimingForce() {
        return TimingForce;
    }

    public void setTimingForce(String timingForce) {
        TimingForce = timingForce;
    }

    public String getMarket() {
        return Market;
    }

    public int getInterval() {
        return Interval;
    }

    public void setMarket(String market) {
        Market = market;
    }

    public void setInterval(int interval) {
        Interval = interval;
    }
}
