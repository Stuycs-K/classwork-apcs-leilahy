public class Warrior extends Adventurer {
  private int rages;

  public Warrior(String name){
    super(name);
    rages = 5;
  }
  public Warrior(String name, int hp){
    super(name, hp);
    rages = 5;
  }

  public String getSpecialName(){
    return "rage";
  }

  public int getSpecial(){
    return rages;
  }

  public void setSpecial(int n){
    rages = n;
  }

  public int getSpecialMax(){
    return 10;
  }

  public String attack(Adventurer other){
    int damage = (int)(Math.random() * 2 + 5);
    other.applyDamage(damage);
    return this.getName() + " stabs " + other.getName() + " for " + damage + "hp.";
  }

  public String support(Adventurer other){
    int healed =  (int)(Math.random() * 2);
    other.applyDamage(-healed);
    return this.getName() + " gives a battle cry for " + other.getName() + " restoring " + healed + "hp.";
  }

  public String support(){
    int healed =  (int)(Math.random() * 2);
    this.applyDamage(-healed);
    return this.getName() + " gets into battle position! Restores " + healed + "hp.";
  }

  public String specialAttack(Adventurer other){
    if (this.getSpecial() != 0){
      int damage = (int)(Math.random() * 3);
      this.setSpecial(this.getSpecial() - 1);
      other.applyDamage(damage);
      return this.getName() + " glares at " + other.getName() + " for " + damage + "hp.";
    }
    return "unable to " + this.getSpecialName();
    }

}
