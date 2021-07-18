package Bit4You.Client.Models.Orders.Request;

import Bit4You.Client.Models.Simulations;
import com.google.gson.annotations.SerializedName;

public class OrderListRequest extends Simulations {

    @SerializedName("page")
    private int Page;
    @SerializedName("limit")
    private int Limit;
    @SerializedName("market")
    private String Market;

    public void setPage(int page) {
        Page = page;
    }

    public void setLimit(int limit) {
        Limit = limit;
    }

    public void setMarket(String market) {
        Market = market;
    }

    public int getPage() {
        return Page;
    }

    public int getLimit() {
        return Limit;
    }

    public String getMarket() {
        return Market;
    }
}
