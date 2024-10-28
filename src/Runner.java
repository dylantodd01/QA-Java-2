import com.qa.Tortoise;

public class Runner {
    public static void main(String[] args) {
        Tortoise shell = new Tortoise("Russian Tortoise", 18, 78);
        Tortoise tony = new Tortoise("Red-Footed Tortoise", 54);
        Tortoise bill = new Tortoise();

        System.out.println(shell);
        System.out.println(tony);

        bill.setAge(46);
        System.out.println(bill);

        Tortoise.makeNoise();

    }

}