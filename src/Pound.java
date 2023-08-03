package src;

public class Pound {
    private Integer pence;

    private Integer shilling;

    private Integer pound;

    public Pound(Integer pound, Integer shilling, Integer pence) {
        this.pence = pence;
        this.pound = pound;
        this.shilling = shilling;
    }

    public Integer getPence() {
        return pence;
    }

    public Integer getPound() {
        return pound;
    }

    public Integer getShilling() {
        return shilling;
    }


    @Override
    public String toString() {
      if((pound != null && pound<0) || (shilling != null && shilling<0) || (pence != null && pence <0)){
          return "0d (" + this.signedToString() +")";
      } else
          return this.signedToString();

    }
    public String signedToString(){
        if (pound != null && pound !=0) {
            return pound + "p " + shilling + "s " + pence + "d";
        } else if (shilling != null && shilling !=0) {
            return shilling + "s " + pence + "d";
        } else
            return pence + "d";
    }
//    @Override
//    public String toString() {
//        if (negativePound != null) {
//            return pound + "(" + negativePound + ')';
//        } else
//            return pound.toString();
//    }
}
