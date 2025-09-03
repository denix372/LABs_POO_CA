package lab5.task1;

import java.util.Random;

public class RandomOutTask implements Task{
    private static final Random random = new Random(12345);
    private final int num;

    public RandomOutTask() {
        num = random.nextInt();
    }

    @Override
    public void execute(){
        System.out.println("Numarul generat este: " + num);
    }
}
