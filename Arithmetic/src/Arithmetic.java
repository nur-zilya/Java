public class Arithmetic {
    private int number1;
    private int number2;

    public Arithmetic(int param1, int param2){
        this.number1 = param1;
        this.number2 = param2;
    }

    public int sumNumbers(){
        return number1 + number2;
    }

    public int multipleNumbers(){
        return number1 * number2;
    }

    public int findMax(){
        if(number1 > number2){
            return number1;
        }
        return number2;
    }

    public int findMin(){
        if(number1 < number2){
            return number1;
        }
        return number2;
    }
}
