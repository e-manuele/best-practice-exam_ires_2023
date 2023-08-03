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
        String remainder = this.subtraction(p1, this.conv.fromStringToPound(this.multiplication(p, p2)));
        return p + "(" + remainder + ")";
    }


}
