import java.util.ArrayList;
import java.util.Random;

public class Driver {
    public static void main(String[] args) {

        Random rn = new Random();
        ArrayList <Expression> list = new ArrayList();//the list which will contain the expressions
        
        for (int i = 0; i < 3 ; i++) {//creating different random expressions
            AtomicExpression a1 = new AtomicExpression(rn.nextInt());
            AtomicExpression a2 = new AtomicExpression(rn.nextInt());
            AdditionExpression e1 = new AdditionExpression(a1,a2);
            SubtractionExpression e2 = new SubtractionExpression(a1,a2);
            AdditionExpression e3 = new AdditionExpression(e1,e2);
            list.add(e1);
            list.add(e2);
            list.add(e3);

        }
        for (int i = 0; i < list.size() ; i++) {
            System.out.println("Expression no "+i+" is: "+list.get(i).toString());//printing the expression
            System.out.println("result is: "+list.get(i).calculate());//printing the result
            for (int j = i+1; j <list.size() ; j++) {
                if(list.get(i).equals(list.get(j)))//finding if any expressions in the list are equal
                    System.out.println("The expression: "+list.get(i).toString() +
                            "and the expression: "+list.get(j).toString() + " are equal");
            }
        }
    }
}
