package Bit4You.Client.Models.Portfolio.Request;

import Bit4You.Client.Models.Simulations;
import com.google.gson.annotations.SerializedName;

public class PortfolioCancelOrder extends Simulations {

    @SerializedName("id")
    private int Id;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }
}
