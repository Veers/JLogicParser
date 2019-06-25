package ru.veers;

public class Main {

    public static void main(String[] args) throws Exception {
//        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
//        String countStr = r.readLine();

//        String condition = "A & B | C | D & F & G | H";
        String condition = "A & B | C | D";
        ExpressionParser.parse(condition);

//            Evaluator evaluator = new Evaluator();
//            evaluator.doIt("T && ( F || ( F && T ) )");
//            evaluator.doIt("(T && T) || ( F && T )");
    }
}
