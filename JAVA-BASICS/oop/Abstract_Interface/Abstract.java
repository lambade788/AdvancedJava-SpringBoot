package oop.Abstract_Interface;

// 1. ABSTRACT CLASS: Defined using the 'abstract' keyword.
// It acts as a blueprint. You CANNOT instantiate it (no 'new Animal()').
abstract class Animal {

    // 2. ABSTRACT METHOD: Has no body {}. 
    // It forces every non-abstract subclass (like dog or cat) 
    // to provide its own specific implementation of this method.
    public abstract void sayhello();
}

// 3. CONCRETE SUBCLASS: Inherits from the abstract class.
// Because it 'extends Animal', it MUST implement the 'sayhello()' method.
class dog extends Animal {
    @Override
    public void sayhello() {
        System.out.println("Bhaw bhaw");
    }
}

class cat extends Animal {
    String type;

    cat(String type) {
        this.type = type; 
    }

    cat() {}

    // Implementing the required abstract method from the parent.
    @Override
    public void sayhello() {
        System.out.println("Mewo Mewo");
    }
}

public class Abstract {
    public static void main(String[] args) {
        
        // 4. POLYMORPHISM: We use the Abstract class as the Reference Type.
        // This is useful because we can treat all different animals 
        // as just 'Animal' objects, but they still behave like their specific types.
        Animal a = new dog(); 
        dog A = new dog();
        
        a.sayhello(); // Calls dog's version
        A.sayhello(); // Calls dog's version
        
        // Even though 'c1' is typed as Animal, it executes the cat's logic.
        Animal c1 = new cat();
        c1.sayhello();
    }
}