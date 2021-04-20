import java.awt.*;

public class PrimitaveVsReferenceTypes {
    public static void main(String[] args){
        // Primittive Types ex
        byte x = 1;
        byte y = 1;
        x = 2;
        System.out.println(x); // Ignore this line. Wrote it just to get rid of error... It was killing me.
        System.out.println(y);

        // Reference Types ex
        Point point1 = new Point(1, 1);
        Point point2 = point1;
        point1.x = 2;
        System.out.println(point2);
    }
}

// Primitive variables that are seperate are in two different locations so they're completely inpdependent of eachother
// Primitive types are copied by their value

// When Java Runtime environment executes line 10 it's going to allocate some memory to store this point1 object
// And if the address of that memory location is 100 then it's going to allocate a seperate part of the memory and it's
// Going to attach this label to that memory location point1 and in that memory location it's going to store the address 
// Of our point object

// Reference types are copied by the references 

