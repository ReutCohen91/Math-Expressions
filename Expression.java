//This abstract class represents an abstract mathematical expression
public abstract class Expression {

    protected double result;//the result of the expression is a double variable

    public abstract double calculate();//a method which calculates the expression

    public boolean equals(Object ob){//overriding equals method to find if two expressions are equal,
        //that is, if the result of the calculation is the same
        if(ob instanceof Expression) {
            if (this.calculate() == ((Expression) ob).calculate())
                return true;
        }
        return false;
    }
}
