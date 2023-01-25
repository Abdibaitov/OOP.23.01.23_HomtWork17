import java.util.Arrays;

public class Farm {
    private String address;
    private Cow[] cow;
    private Horse[] horse;
    private Sheep[] sheep;
    private String ownername;


    public Farm(String address, Cow[] cow, Horse[] horse, Sheep[] sheep, String ownername) {
        this.address = address;
        this.cow = cow;
        this.horse = horse;
        this.sheep = sheep;
        this.ownername = ownername;
    }

    public Farm(String address, Cow[] cow) {
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Cow[] getCow() {
        return cow;
    }

    public void setCow(Cow[] cow) {
        this.cow = cow;
    }

    public Horse[] getHorse() {
        return horse;
    }

    public void setHorse(Horse[] horse) {
        this.horse = horse;
    }

    public Sheep[] getSheep() {
        return sheep;
    }

    public void setSheep(Sheep[] sheep) {
        this.sheep = sheep;
    }

    public String getOwnername() {
        return ownername;
    }

    public void setOwnername(String ownername) {
        this.ownername = ownername;
    }

    @Override
    public String toString() {
        return "Farm{" +
                "address='" + address + '\'' +
                ", cow=" +   Arrays.toString(cow) +
                ", horse=" + Arrays.toString(horse) +
                ", sheep=" + Arrays.toString(sheep) +
                ", ownername='" + ownername + '\'' +
                '}';
    }
}
