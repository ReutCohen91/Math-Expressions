//This class represents a compound expression with the subtraction operator between the operands

public class SubtractionExpression extends CompoundExpression {

    //The constructor receives two expressions and uses CompoundExpression's constructor to initialize the attributes
    public SubtractionExpression(Expression a, Expression b) {
        super(a, b);
    }

    @Override
    public double calculate() {//calculate subtracts the results of the two expressions
        result = opOne.result - opTwo.result;
        return result;
    }

    public String toString() {//the string representation of the expressions with the "-" symbol and parentheses
        String rightOP;
        rightOP=  "("+ opTwo.toString() +")";
        return
            opOne.toString() + " - " + rightOP;
    }

}