package Bit4You.Client.Models.Portfolio.Request;

import Bit4You.Client.Models.Simulations;
import com.google.gson.annotations.SerializedName;

public class PortfolioCreateOrder extends Simulations {

    @SerializedName("market")
    private String Market;
    @SerializedName("quantity")
    private double Quantity;
    @SerializedName("rate")
    private double Rate;

    public void setMarket(String market) {
        Market = market;
    }

    public void setQuantity(double quantity) {
        Quantity = quantity;
    }

    public void setRate(double rate) {
        Rate = rate;
    }

    public String getMarket() {
        return Market;
    }

    public double getQuantity() {
        return Quantity;
    }

    public double getRate() {
        return Rate;
    }
}
