package Bit4You.Client.Models.Portfolio.Response;

import com.google.gson.annotations.SerializedName;

public class PortfolioCreateResponse {
    @SerializedName("txid")
    private String Txid;
    @SerializedName("type")
    private String Type;
    @SerializedName("market")
    private String Market;
    @SerializedName("isOpen")
    private boolean IsOpen;
    @SerializedName("requested_rate")
    private String RequestedRate;
    @SerializedName("quantity")
    private String Quantity;
    @SerializedName("base_quantity")
    private String BaseQuantity;
    @SerializedName("blocked_quantity")
    private String BlockedQuantity;
    @SerializedName("remaining")
    private Remaining Remaining;
    @SerializedName("fee")
    private Fee Fee;
    @SerializedName("position")
    private Position Position;
    @SerializedName("open_time")
    private int OpenTime;
    @SerializedName("update_time")
    private int UpdateTime;

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

    public void setRequestedRate(String requestedRate) {
        RequestedRate = requestedRate;
    }

    public void setQuantity(String quantity) {
        Quantity = quantity;
    }

    public void setBaseQuantity(String baseQuantity) {
        BaseQuantity = baseQuantity;
    }

    public void setBlockedQuantity(String blockedQuantity) {
        BlockedQuantity = blockedQuantity;
    }

    public void setRemaining(Bit4You.Client.Models.Portfolio.Response.Remaining remaining) {
        Remaining = remaining;
    }

    public void setFee(Bit4You.Client.Models.Portfolio.Response.Fee fee) {
        Fee = fee;
    }

    public void setPosition(Bit4You.Client.Models.Portfolio.Response.Position position) {
        Position = position;
    }

    public void setOpenTime(int openTime) {
        OpenTime = openTime;
    }

    public void setUpdateTime(int updateTime) {
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

    public String getRequestedRate() {
        return RequestedRate;
    }

    public String getQuantity() {
        return Quantity;
    }

    public String getBaseQuantity() {
        return BaseQuantity;
    }

    public String getBlockedQuantity() {
        return BlockedQuantity;
    }

    public Bit4You.Client.Models.Portfolio.Response.Remaining getRemaining() {
        return Remaining;
    }

    public Bit4You.Client.Models.Portfolio.Response.Fee getFee() {
        return Fee;
    }

    public Bit4You.Client.Models.Portfolio.Response.Position getPosition() {
        return Position;
    }

    public int getOpenTime() {
        return OpenTime;
    }

    public int getUpdateTime() {
        return UpdateTime;
    }
}

class Remaining {
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

class Fee {
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

class Position {
    @SerializedName("id")
    private Object Id;

    @SerializedName("history_id")
    private Object HistoryId;

    public Object getId() {
        return Id;
    }

    public Object getHistoryId() {
        return HistoryId;
    }

    public void setId(Object id) {
        Id = id;
    }

    public void setHistoryId(Object historyId) {
        HistoryId = historyId;
    }
}