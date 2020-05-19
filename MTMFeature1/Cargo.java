import java.util.*;
/**
 *Cargo requirements
 * 
 * Dongheng Zhan
 * 18/5/2020
 */
public class Cargo
{

    private String cargoRequirements;

    public void Cargo()
    {
        cargoRequirements = "";
    }

    public Cargo(String cargoRequirements) {
        this.cargoRequirements = cargoRequirements;
    }

    public void setCargoRequirements(String cargoRequirements) {
        this.cargoRequirements = cargoRequirements;
    }

    public String getCargoRequirements() {
        return cargoRequirements;
    }
}
