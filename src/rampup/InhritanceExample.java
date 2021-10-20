package rampup;
class Mi{
    public void userInterface(){
        System.out.println("User Interface :- MIUI");
    }
    public void price(){
        System.out.println("Price :- 9000");
    }
    public void ads(){
        System.out.println("Ads :- Yes");
    }
}
class Poco extends Mi{
    @Override
    public void price(){
        System.out.println("Price :- 11000");
    }

    @Override
    public void ads() {
        System.out.println("Ads :- Few");
    }

    public void design(){
        System.out.println("Design :- design");
    }

    public void advertisement(){
        System.out.println("Adverisement :- Diffrent Style");
    }
}
public class InhritanceExample {
    public static void main(String[] args) {
        Poco poco=new Poco();
        poco.ads();
        poco.price();
        poco.design();
        poco.advertisement();
        poco.userInterface();
    }
}
