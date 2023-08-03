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

    public Pound fromStringToPound(String s) {
        //System.out.println(s);
        int pIndex = s.indexOf("p");
        int p = Integer.parseInt(s.substring(0, pIndex).replaceAll("\\s+",""));
        int sIndex = s.indexOf("s");
        int sh = Integer.parseInt(s.substring(pIndex+1, sIndex).replaceAll("\\s+",""));
        int dIndex = s.indexOf("d");
        int d = Integer.parseInt(s.substring(sIndex+1, dIndex).replaceAll("\\s+",""));
        return new Pound(p, sh, d);
    }
}
