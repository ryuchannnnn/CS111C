public class parcelTester {
    public static void main(String[] args) {
        Parcel o=new Parcel("fn6xtmnm4", 8.0);
        Parcel p=new Parcel("1f5gmads7", 1.0);
        o.meetsCriteria('x', 'm', 2);
        p.meetsCriteria('x', 'm', 2);
        System.out.println(o.toString());
        System.out.println(p.toString());
        System.out.println(o.meetsCriteria('x', 'm', 2));
        System.out.println(p.meetsCriteria('x', 'm', 2));
        String returnedResult;
        if(p.meetsCriteria('x','m',2)==true)
            returnedResult="true";
        else
            returnedResult="false";
        System.out.println(returnedResult);
        System.out.println(o.equals(p));
        System.out.println(p.getParcelid()+" "+p.getWeight());
    }

}