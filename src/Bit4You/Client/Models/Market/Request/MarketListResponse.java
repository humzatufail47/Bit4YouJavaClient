package Bit4You.Client.Models.Market.Request;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MarketListResponse {
    @SerializedName("iso")
    private String Iso;
    @SerializedName("name")
    private String Name;
    @SerializedName("precision")
    private int Precision;
    @SerializedName("value")
    private double Value;
    @SerializedName("change")
    private double Change;
    @SerializedName("spread")
    private double Spread;
    @SerializedName("category")
    private String Category;

    public void setIso(String iso) {
        Iso = iso;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setPrecision(int precision) {
        Precision = precision;
    }

    public void setValue(double value) {
        Value = value;
    }

    public void setChange(double change) {
        Change = change;
    }

    public void setSpread(double spread) {
        Spread = spread;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public String getIso() {
        return Iso;
    }

    public String getName() {
        return Name;
    }

    public int getPrecision() {
        return Precision;
    }

    public double getValue() {
        return Value;
    }

    public double getChange() {
        return Change;
    }

    public double getSpread() {
        return Spread;
    }

    public String getCategory() {
        return Category;
    }
}

class MarketList
{
    @SerializedName("marketLisResponse")
    public List<MarketListResponse> MarketLisResponse;

    public List<MarketListResponse> getMarketLisResponse() {
        return MarketLisResponse;
    }

    public void setMarketLisResponse(List<MarketListResponse> marketLisResponse) {
        MarketLisResponse = marketLisResponse;
    }
}
