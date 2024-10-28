import com.qa.Tortoise;

import java.sql.SQLSyntaxErrorException;

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


        Tortoise tilly = new Tortoise("Cool", 12, 12);
        Tortoise ted = new Tortoise("Uncool", 13, 13);
        Tortoise toby = new Tortoise("Very cool", 130, 15);

        Tortoise[] torts = {tilly, ted, toby};

        for (int i = 0; i < torts.length; i++) {
            System.out.println(torts[i]);
        }

        System.out.println("MIDDLE OF LOOPS");

        for (Tortoise tort: torts) {
            System.out.println(tort);
        }

        System.out.println("String time");

        String firstPart = "this is a stringy string";
        String secondPart = "|| this is a second stringy string";

        StringBuilder sb = new StringBuilder();

        String answer = new StringBuilder(firstPart).append(".").append(secondPart).toString();

        String secondAns = firstPart + "." + secondPart;

        System.out.println(answer);


        System.out.println("INSERT DELETE TIME");

        String deletedAns = new StringBuilder(answer).delete(4,12).toString();

        System.out.println("NEW --> " +deletedAns);
        System.out.println("ORIG --> " + answer);

        StringBuilder sbAns = new StringBuilder(answer);

        System.out.println("INLINE --> " + sbAns.delete(5,15));
        System.out.println(sbAns);

        

    }

}