//This abstract class represents a compound expression which consists of different expressions combined
public abstract class CompoundExpression extends Expression {
    //The attributes are two expressions which are calculated together
    protected Expression opOne;
    protected Expression opTwo;

    //The constructor receives two expressions and initializes the attributes of the class by poinbting to these expressions
    public CompoundExpression(Expression a, Expression b){
        opOne = a;
        opTwo = b;
    }

}
