package Bit4You.Client.Models;

import com.google.gson.annotations.SerializedName;

public class Simulations {
    @SerializedName("simulation")
    protected Boolean Simulation;

    public void setSimulation(Boolean simulation) {
        Simulation = simulation;
    }

    public Boolean getSimulation() {
        return Simulation;
    }
}
