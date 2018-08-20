public class Counter {
    private int number;
    private boolean check;

    public Counter(){
        this(0,false);

    }
    public Counter(boolean check){
        this(0);
        this.check = check;

    }
    public Counter(int startingValue){
        this(startingValue, false);


    }
    public Counter(int startingValue, boolean check){
        this.check = check;
        this.number = startingValue;
    }

    public void increase(){
        this.number++;
    }



    public void increase(int number){
        if (number > 0){
            this.number+=number;
        }
    }

    public void decrease(){
        if (this.number != 0){
            this.number--;
        }
    }

    public void decrease(int number){
        if (this.check){
            if (this.number - number < 0){

            }else {
                this.number -= number;
            }
        }

    }

    public int value(){
        return this.number;
    }
}
