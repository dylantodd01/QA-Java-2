import com.qa.Animal;
import com.qa.AnimalActions;
import com.qa.Pigeon;
import com.qa.Tortoise;

import java.sql.SQLSyntaxErrorException;

public class Runner {
    public static void main(String[] args) {
        Tortoise shell = new Tortoise(18, 78);
        Tortoise tony = new Tortoise(34, 54, "Blue");
        Tortoise toby = new Tortoise(4, 1, "Black");

        shell.makeNoise();
        Animal[] torts = {shell, tony, toby};

        for (Animal tort:torts) {
            System.out.println(tort);
            tort.makeNoise();
            System.out.println("-------------");
        }

        Pigeon pigey = new Pigeon(3, 4);
        Pigeon podge = new Pigeon(1, 3);
        AnimalActions[] birds = {pigey, podge};

        for (AnimalActions bird:birds) {
            System.out.println(bird);
        }

        pigey.makeNoise();
        pigey.sleepTime();
        System.out.println(pigey.getAge());


        //Tortoise tilly = new Tortoise("Cool", 12, 12);
        //Tortoise ted = new Tortoise("Uncool", 13, 13);
        //Tortoise toby = new Tortoise("Very cool", 130, 15);

        //Tortoise[] torts = {tilly, ted, toby};

        /*
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
    */
        

    }

}