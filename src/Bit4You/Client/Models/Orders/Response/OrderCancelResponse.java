package Bit4You.Client.Models.Orders.Response;

import com.google.gson.annotations.SerializedName;

public class OrderCancelResponse {

    @SerializedName("status")
    private String Status;
    @SerializedName("message")
    private String Message;

    public void setStatus(String status) {
        Status = status;
    }

    public void setMessage(String message) {
        Message = message;
    }

    public String getStatus() {
        return Status;
    }

    public String getMessage() {
        return Message;
    }
}
