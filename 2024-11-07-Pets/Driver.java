/* Before the getName in the Bird class was overwritten, it used the getName from the Animal class without any changes
After the getName in the Bird class was overwritten, whenever a bird called getName it used the new one. The getName in Animal stayed the same.
Methods that are overwritten are prioritized over those in the parent class and any methods that call overwritten methods use the new one*/
/* The first 2 worked (a1 and b1) because they used the constructor that correlates with the variable class. Animals is-a Animal! Bird is-a Bird!
b2 did not work because Animal does not have an is-a relationship with bird (in that order), causing an error when you use a constructor from the Animal class
a2 worked because Bird has the is-a relationship with Animal (in that order), which allows you to call a bird constructor while the variable is an Animal*/
public class Driver {
  public static void main(String[]args){
    Animal man = new Animal("hi", 10, "jim");
    man.speak();

    Bird finch = new Bird("chirp", 2, "john", 2.0, "blue");
    finch.speak();
    System.out.println(finch.getName());

    // step 9
    Animal a1 = new Animal("a",1,"a");
    Bird b1 = new Bird("b",1,"b",1.0,"b");
//    Bird b2 = new Animal("b",2,"b");
    Animal a2 = new Bird("a",1,"a",1.0,"a");


    System.out.println();
    a1.speak();
    b1.speak();
    a2.speak();
  }
}
