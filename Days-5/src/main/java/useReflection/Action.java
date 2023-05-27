package useReflection;

import newFeature.Product;

@ValidAction
public class Action {

    private String name = "Ali";
    private int age = 30;


    public Action() {

    }

    public Action(String name, int age, Product product) {
        this.name = name;
        this.age = age;
    }

    @AgeValid
    public void ageData( int age ) {
        this.age = age + 10;
    }


}
