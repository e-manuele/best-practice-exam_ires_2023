package src;

import java.util.Map;

public class PoundStringAPI {
    PoundOperation op;
//    Map<String, Runnable> operationMap;

    public PoundStringAPI(PoundOperation op) {
        this.op = op;
    }

    public String decodeAndApply(String input) {
        try {
            applyOp(input);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return "";
    }


    public String applyOp(String s) throws IncorrectInputException {
        if (s.contains("+")) {
            Pound a = op.conv.fromStringToPound(s.substring(0, s.indexOf("+")));
            Pound b = op.conv.fromStringToPound(s.substring(s.indexOf("+") + 1));
            return op.sum(a, b);
        } else if (s.contains("-")) {
            Pound a = op.conv.fromStringToPound(s.substring(0, s.indexOf("-")));
            Pound b = op.conv.fromStringToPound(s.substring(s.indexOf("-") + 1));
            return op.subtraction(a, b);
        } else if (s.contains("*")) {
            Pound a = op.conv.fromStringToPound(s.substring(0, s.indexOf("*")));
            int b = Integer.parseInt(s.substring(s.indexOf("*") + 1));
            return op.multiplication(a, b);
        } else if (s.contains("/")) {
            Pound a = op.conv.fromStringToPound(s.substring(0, s.indexOf("/")));
            int b = Integer.parseInt(s.substring(s.indexOf("/") + 1));
            return op.division(a, b);
        } else throw new IncorrectInputException("Operation not found");
    }
}
/*canner input = new Scanner(System.in);
System.out.print("Enter: ");
String name = input.next();

Pattern p = Pattern.compile("[A-Za-z]");
Matcher m = p.matcher(name);
boolean n = m.matches();

if (n == true) {
   System.out.println(name);
}
else {
   System.out.println("This is not a valid name.");
}
*/

