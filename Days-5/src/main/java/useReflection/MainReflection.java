package useReflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedType;
import java.lang.reflect.Constructor;

public class MainReflection {
    public static void main(String[] args) {

        Class ac = Action.class;

        // Annotations
        Annotation[] annotations = ac.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println( annotation.toString() );
        }

        // Constructor
        Constructor[] constructors = ac.getConstructors();
        for ( Constructor item : constructors ) {
            System.out.println("=================");
            System.out.println( item.getParameterCount() );
            Class[] classes = item.getParameterTypes();
            for ( Class aClass : classes ) {
                System.out.println(aClass.toString());
            }
        }


    }
}
