public class overnightParcel extends Parcel{
    public boolean signature;
    public String id;
    public double weight;
    public overnightParcel(String id, double weight, boolean signature) {
        super(id, weight);
        this.id=id;
        this.weight=weight;
        this.signature=signature;
    }
}