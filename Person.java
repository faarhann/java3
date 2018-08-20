public class Person {
    private String name;
    private int age;
    private int weight;
    private int height;

    public Person(String name) {
      this(name, 0);
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 0;
        this.height = 0;
    }


    public void setHeight(int newHeight) {
        this.height = newHeight;
    }

    public int getHeight(){
        return this.height;
    }

    public String getName(){
        return this.name;
    }

    public void setWeight(int newWeight) {
        this.weight = newWeight;
    }

    public int getWeight(){
        return this.weight;
    }

    public double bodyMassIndex(){
        double heightDividedByHundred = this.height / 100.0;
        return this.weight / ( heightDividedByHundred * heightDividedByHundred );
    }


    public void becomeOlder() {
        this.becomeOlder(1);
    }

    public void becomeOlder(int years){
        this.age+=years;
    }

    public boolean isAdult() {
        return this.age >= 18;
    }
    public String toString(){
        return this.name + ", age " + this.age + " years";
    }
}
