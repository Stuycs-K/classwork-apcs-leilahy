/* Before the getName in the Bird class was overwritten, it used the getName from the Animal class without any changes
After the getName in the Bird class was overwritten, whenever a bird called getName it used the new one. The getName in Animal stayed the same.
Methods that are overwritten are prioritized over those in the parent class*/
public class Driver {
  public static void main(String[]args){
    Animal man = new Animal("hi", 10, "jim");
    man.speak();

    Bird finch = new Bird("chirp", 2, "john", 2.0, "blue");
    finch.speak();
    System.out.println(finch.getName());
  }
}
