import java.awt.image.BufferedImage;

/*
 * functional interface is an interface where there is only one abstract
 * method
 * */
@java.lang.FunctionalInterface
interface GreetingMessage
{
    public abstract void greet(String name);
}

public class FunctionalInterface {


    public static void main(String[] args)
    {
        GreetingMessage gm = new GreetingMessage() {
            @Override
            public void greet(String name) {
                System.out.println("Hello" + " "+name);
            }
        };

        gm.greet("Angkor");
        /*
        * lambda implementation
        * */
        GreetingMessage gm2 = (String name) -> {
            System.out.println("Hello" + " "+name);
        };
        gm2.greet("Angkor");

        /*
        * another way of writing definition for lambda is
        * className :: methodName; this a method reference syntax
        */
        /*
        * forEach loop does external iteration ,
        * i) it is hard to write parallel iteration
        * ii) requires a lot of boilerplate code like for (int i=0;i<num.size();i++)
        * iii) difficult to read the codebase
        * iv) not much abstraction between what we are doing and how we are doing
        *
        * streams use internal iteration
        * */
        BufferedImage a;
    }
}
