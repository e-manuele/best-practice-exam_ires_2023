package src;

public class PoundConverter {


    public int fromOldFashionToPence(Pound pound) {
        return (pound.getPound() * 240) + (pound.getShilling() * 12) + pound.getPence();
    }

    public  Pound fromPenceToOldFashion(int pence) {
        int p = fromPenceToPound(pence);
        int s = fromPenceToShilling(pence - fromPoundToPence(p));
        int d = pence - fromPoundToPence(p) - fromShillingToPence(s);
        return new Pound(p, s, d);
    }

    public  int fromPoundToPence(int pound) {
        return pound * 240;
    }

    public  int fromShillingToPence(int shill) {
        return shill * 12;
    }

    public int fromPenceToPound(int pence) {
        return pence / 240;
    }

    public int fromPenceToShilling(int pence) {
        return pence / 12;
    }
}
