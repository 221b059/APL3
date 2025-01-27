class Mother {
    public void show() {
        System.out.println("Hello World");
    }
}

class Child extends Mother{
    @Override
    public void show() {
        System.out.println("Hello JUET");
    }
}

public class Application {
    public static void main(String[] args) {
        Mother mother = new Mother();
        Child child = new Child();

        mother.show(); 
        
        child.show(); 

        Mother m = new Child();
        m.show(); 
    }
}
