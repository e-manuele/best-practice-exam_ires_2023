package src;

import java.lang.reflect.Method;

import java.util.Map;

public class PoundOperation {
    PoundConverter conv;


    public PoundOperation(PoundConverter conv) {
        this.conv = conv;
    }

    public String sum(Pound p1, Pound p2) {
        return conv.fromPenceToOldFashion(conv.fromOldFashionToPence(p1) + conv.fromOldFashionToPence(p2)).toString();
    }


    public String subtraction(Pound p1, Pound p2) {
        return conv.fromPenceToOldFashion(conv.fromOldFashionToPence(p1) - conv.fromOldFashionToPence(p2)).toString();
    }


    public String multiplication(Pound p1, int p2) {
        return conv.fromPenceToOldFashion(conv.fromOldFashionToPence(p1) * p2).toString();
    }


    public String division(Pound p1, int p2) {
        Pound p = conv.fromPenceToOldFashion(conv.fromOldFashionToPence(p1) / p2);

        String remainder = this.subtraction(p1, this.fromStringToPound(this.multiplication(p, p2)));
        return p + "(" + remainder + ")";
    }

    public Pound fromStringToPound(String s) {
        System.out.println(s);
        int pIndex = s.indexOf("p");
        int p = Integer.parseInt(s.substring(0, pIndex));
        int sIndex = s.indexOf("s");
        int sh = Integer.parseInt(s.substring(pIndex+1, sIndex).replaceAll("\\s+",""));
        int dIndex = s.indexOf("d");
        int d = Integer.parseInt(s.substring(sIndex+1, dIndex).replaceAll("\\s+",""));
        return new Pound(p, sh, d);
    }
}
