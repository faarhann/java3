public class NumberStatistics {
    private int amountOfNumbers;
    private int sum;

    public NumberStatistics() {

    }

    public void addNumber(int number) {
       this.sum += number;
       this.amountOfNumbers++;
    }

    public int amountOfNumbers() {
        return this.amountOfNumbers;
    }

    public int sum() {
      if (this.sum == 0){
          return 0;
      }else {
          return sum;
      }
    }

    public double average() {
        return this.sum/(double)this.amountOfNumbers;
    }
}
