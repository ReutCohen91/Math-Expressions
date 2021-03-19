//This class represents a compound expression with the addition operator between the operands
public class AdditionExpression extends CompoundExpression {

    //The constructor receives two expressions and uses CompoundExpression's constructor to initialize the attributes
    public AdditionExpression(Expression a, Expression b){
        super(a,b);
    }

    @Override
    public double calculate() {//calculate adds the results of the two expressions
        result = opOne.result+opTwo.result;
        return result;
    }

    public String toString(){//the string representation of the expressions with the "+" symbol
        String expression = opOne + " + " + opTwo;
        return expression;
    }
}
