package Bit4You.Client.Models.Orders.Response;

import com.google.gson.annotations.SerializedName;

public class OrderListResponse {

    @SerializedName("txid")
    private String Txid;
    @SerializedName("type")
    private String Type;
    @SerializedName("market")
    private String Market;
    @SerializedName("isOpen")
    private boolean IsOpen;
    @SerializedName("requestedRate")
    private double RequestedRate;
    @SerializedName("quantity")
    private double Quantity;
    @SerializedName("baseQuantity")
    private double BaseQuantity;
    @SerializedName("blockedQuantity")
    private double BlockedQuantity;
    @SerializedName("remaining")
    private Remaining Remaining;
    @SerializedName("fee")
    private Fee Fee;
    @SerializedName("position")
    private Position Position;
    @SerializedName("openTime")
    private double OpenTime;
    @SerializedName("updateTime")
    private double UpdateTime;

    public void setTxid(String txid) {
        Txid = txid;
    }

    public void setType(String type) {
        Type = type;
    }

    public void setMarket(String market) {
        Market = market;
    }

    public void setOpen(boolean open) {
        IsOpen = open;
    }

    public void setRequestedRate(double requestedRate) {
        RequestedRate = requestedRate;
    }

    public void setQuantity(double quantity) {
        Quantity = quantity;
    }

    public void setBaseQuantity(double baseQuantity) {
        BaseQuantity = baseQuantity;
    }

    public void setBlockedQuantity(double blockedQuantity) {
        BlockedQuantity = blockedQuantity;
    }

    public void setRemaining(Bit4You.Client.Models.Orders.Response.Remaining remaining) {
        Remaining = remaining;
    }

    public void setFee(Bit4You.Client.Models.Orders.Response.Fee fee) {
        Fee = fee;
    }

    public void setPosition(Bit4You.Client.Models.Orders.Response.Position position) {
        Position = position;
    }

    public void setOpenTime(double openTime) {
        OpenTime = openTime;
    }

    public void setUpdateTime(double updateTime) {
        UpdateTime = updateTime;
    }

    public String getTxid() {
        return Txid;
    }

    public String getType() {
        return Type;
    }

    public String getMarket() {
        return Market;
    }

    public boolean isOpen() {
        return IsOpen;
    }

    public double getRequestedRate() {
        return RequestedRate;
    }

    public double getQuantity() {
        return Quantity;
    }

    public double getBaseQuantity() {
        return BaseQuantity;
    }

    public double getBlockedQuantity() {
        return BlockedQuantity;
    }

    public Bit4You.Client.Models.Orders.Response.Remaining getRemaining() {
        return Remaining;
    }

    public Bit4You.Client.Models.Orders.Response.Fee getFee() {
        return Fee;
    }

    public Bit4You.Client.Models.Orders.Response.Position getPosition() {
        return Position;
    }

    public double getOpenTime() {
        return OpenTime;
    }

    public double getUpdateTime() {
        return UpdateTime;
    }
}
class Remaining
{
    @SerializedName("quantity")
    private String Quantity;
    @SerializedName("iso")
    private String Iso;

    public void setQuantity(String quantity) {
        Quantity = quantity;
    }

    public void setIso(String iso) {
        Iso = iso;
    }

    public String getQuantity() {
        return Quantity;
    }

    public String getIso() {
        return Iso;
    }
}

class Fee
{
    @SerializedName("quantity")
    private String Quantity;
    @SerializedName("iso")
    private String Iso;

    public String getQuantity() {
        return Quantity;
    }

    public String getIso() {
        return Iso;
    }

    public void setQuantity(String quantity) {
        Quantity = quantity;
    }

    public void setIso(String iso) {
        Iso = iso;
    }
}

class Position
{
    @SerializedName("id")
    private int Id;
    @SerializedName("historyId")
    private Object HistoryId;

    public int getId() {
        return Id;
    }

    public Object getHistoryId() {
        return HistoryId;
    }

    public void setId(int id) {
        Id = id;
    }

    public void setHistoryId(Object historyId) {
        HistoryId = historyId;
    }
}