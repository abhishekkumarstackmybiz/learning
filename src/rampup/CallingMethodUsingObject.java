package rampup;
class DisplayHelloWorld{
    public void display(){
        System.out.println("Hello World");
    }
}
public class CallingMethodUsingObject {
    public static void main(String[] args) {
        DisplayHelloWorld displayHelloWorld=new DisplayHelloWorld();
        displayHelloWorld.display();
    }
}
