import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.statTime();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Start now ? (y/n) : ");
        String answer = scanner.nextLine();
        System.out.println(answer);

        if (answer.equals("y")){
            stopWatch.star();
            System.out.println("Stop yet :3 (y/n)");
            String secondAnswer = scanner.nextLine();

            if (secondAnswer.equals("y")){
                stopWatch.stop();
                System.out.println("Elapse Time : " + stopWatch.getElapsedTime());
            }
        } else if (answer.equals("n")){
            System.out.println("Ok");
        }
    }
}
