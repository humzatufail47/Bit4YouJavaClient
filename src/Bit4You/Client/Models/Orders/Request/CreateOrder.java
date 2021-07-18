package Bit4You.Client.Models.Orders.Request;

import com.google.gson.annotations.SerializedName;

public class CreateOrder {
    @SerializedName("market")
    private String Market;
        //[System.Text.Json.Serialization.JsonConverter(typeof(StringEnumConverter))]
    @SerializedName("type")
    private String Type;
    @SerializedName("quantity")
    private int Quantity;
    @SerializedName("quantity_iso")
    private String QuantityIso;
    private double Rate;

    public void setMarket(String market) {
        Market = market;
    }

    public void setType(String type) {
        Type = type;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }

    public void setQuantityIso(String quantityIso) {
        QuantityIso = quantityIso;
    }

    public void setRate(double rate) {
        Rate = rate;
    }

    public String getMarket() {
        return Market;
    }

    public String getType() {
        return Type;
    }

    public int getQuantity() {
        return Quantity;
    }

    public String getQuantityIso() {
        return QuantityIso;
    }

    public double getRate() {
        return Rate;
    }
}
