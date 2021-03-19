//This class represents an atomic expression which is a single double variable
public class AtomicExpression extends Expression {



    //default constructor
    public AtomicExpression(double num){
        result = num;
    }

    @Override
    public double calculate() {//the result of the expression is the atomic expression (double) itself
        return result;
    }

    public String toString(){//returning the string representation of the expression
        String numStr = String.valueOf(result);
        return numStr;
    }

}
