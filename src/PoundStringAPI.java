package src;

import java.util.List;
import java.util.Map;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PoundStringAPI {
    PoundOperation op;
//    Map<String, Runnable> operationMap;

    public PoundStringAPI(PoundOperation op) {
        this.op = op;
    }

    public String decodeAndApply(String input) {


        return applyOp(input);


    }


    public String applyOp(String s) {
        if (isValid(s)) {
            System.out.println("OK");
        }
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
            int b = Integer.parseInt(s.substring(s.indexOf("*") + 1).replaceAll("\\s+",""));
            return op.multiplication(a, b);
        } else if (s.contains("/")) {
            Pound a = op.conv.fromStringToPound(s.substring(0, s.indexOf("/")));
            int b = Integer.parseInt(s.substring(s.indexOf("/") + 1).replaceAll("\\s+",""));
            return op.division(a, b);
        }
        return "";
    }

    private boolean isValid(String s) {  /// tentativo parte 2
        Pattern p = Pattern.compile("(\\d+[p]\\s*\\d++[s]\\s*\\d+[d]\\s*[+\\-*\\/]*)+");
        Matcher m = p.matcher(s);

        List<String> ress = m.results().map(String::valueOf).collect(Collectors.toList());
        if (ress.size() >2) {
            Pound res = op.conv.fromStringToPound(String.valueOf(ress.get(0)));
            for (int i = 1; i <= ress.size() - 1; i++) {
                res = op.conv.fromStringToPound(res.toString() + " " + m.group(i + 1));
                System.out.println("OK");
            }
            System.out.println("risultato Soo" + res);
        }
        return m.matches();
    }
}


