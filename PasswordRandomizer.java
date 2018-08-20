import java.util.Random;

public class PasswordRandomizer {

    public int passwordLength;
    public Random random;


    public PasswordRandomizer(int length) {
        this.passwordLength = length;
        this.random = new Random();

    }

    public String createPassword() {
        String letters = "abcdefghijklmnopqrstuvwxyz";
        String password = "";
        int count = 0;

        while (count < this.passwordLength){
            int number = this.random.nextInt(26);
            char c = letters.charAt(number);
            password+=c;
            count++;
        }
        return password;

    }
}
