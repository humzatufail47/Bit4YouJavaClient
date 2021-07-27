package Bit4You.Client.Models;

import Bit4You.Client.IBaseRequest;
import com.google.gson.annotations.SerializedName;

public class Simulations {
    @SerializedName("simulation")
    protected Boolean Simulation;
    @SerializedName("ClientId")
    protected String ClientId;
    @SerializedName("TimingForce")
    protected String TimingForce;

    public void setSimulation(Boolean simulation) {
        Simulation = simulation;
    }

    public Boolean getSimulation() {
        return Simulation;
    }

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
}
