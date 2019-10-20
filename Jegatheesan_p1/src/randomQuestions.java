import java.security.SecureRandom;
import java.util.Scanner;
import java.lang.Math;


public class
randomQuestions {
    public static double generate(int type, int difficulty) {
        if (type == 1) {
            if (difficulty == 1) {
                SecureRandom random = new SecureRandom();
                double y = random.nextInt(9);
                double x = random.nextInt(9);
                System.out.println("How much is " +x+ " + " +y+ "?");
                return x + y;
            } else if (difficulty == 2) {
                SecureRandom random = new SecureRandom();
                double y = 10 + random.nextInt(89);
                double x = 10 + random.nextInt(89);
                System.out.println("How much is " +x+ " + " +y+ "?");
                return x + y;
            } else if (difficulty == 3) {
                SecureRandom random = new SecureRandom();
                double y = 100 + random.nextInt(899);
                double x = 100 + random.nextInt(899);
                System.out.println("How much is " +x+ " + " +y+ "?");
                return x + y;
            } else if (difficulty == 4) {
                SecureRandom random = new SecureRandom();
                double y = 1000 + random.nextInt(8999);
                double x = 1000 + random.nextInt(8999);
                System.out.println("How much is " +x+ " + " +y+ "?");
                return x + y;
            }
        } else if (type == 2) {
            if (difficulty == 1) {
                SecureRandom random = new SecureRandom();
                double y = random.nextInt(9);
                double x = random.nextInt(9);
                System.out.println("How much is " +x+ " * " +y+ "?");
                return x * y;
            } else if (difficulty == 2) {
                SecureRandom random = new SecureRandom();
                double y = 10 + random.nextInt(89);
                double x = 10 + random.nextInt(89);
                System.out.println("How much is " +x+ " * " +y+ "?");
                return x * y;
            } else if (difficulty == 3) {
                SecureRandom random = new SecureRandom();
                double y = 100 + random.nextInt(899);
                double x = 100 + random.nextInt(899);
                System.out.println("How much is " +x+ " * " +y+ "?");
                return x * y;
            } else if (difficulty == 4) {
                SecureRandom random = new SecureRandom();
                double y = 1000 + random.nextInt(8999);
                double x = 1000 + random.nextInt(8999);
                System.out.println("How much is " +x+ " * " +y+ "?");
                return x * y;
            }

        } else if (type == 3) {
            if (difficulty == 1) {
                SecureRandom random = new SecureRandom();
                double y = random.nextInt(9);
                double x = random.nextInt(9);
                if ( y > x)
                {
                    double temp = x;
                    x = y;
                    y = temp;
                }
                System.out.println("How much is " +x+ " - " +y+ "?");
                return x - y;
            } else if (difficulty == 2) {
                SecureRandom random = new SecureRandom();
                double y = 10 + random.nextInt(89);
                double x = 10 + random.nextInt(89);
                if ( y > x)
                {
                    double temp = x;
                    x = y;
                    y = temp;
                }
                System.out.println("How much is " +x+ " - " +y+ "?");
                return x - y;
            } else if (difficulty == 3) {
                SecureRandom random = new SecureRandom();
                double y = 100 + random.nextInt(899);
                double x = 100 + random.nextInt(899);
                if ( y > x)
                {
                    double temp = x;
                    x = y;
                    y = temp;
                }
                System.out.println("How much is " +x+ " - " +y+ "?");
                return x - y;
            } else if (difficulty == 4) {
                SecureRandom random = new SecureRandom();
                double y = 1000 + random.nextInt(8999);
                double x = 1000 + random.nextInt(8999);
                if ( y > x)
                {
                    double temp = x;
                    x = y;
                    y = temp;
                }
                System.out.println("How much is " +x+ " - " +y+ "?");
                return x - y;
            }
        } else if (type == 4) {
            if (difficulty == 1) {
                SecureRandom random = new SecureRandom();
                double y = 1+ random.nextInt(9);
                double x = 1+ random.nextInt(9);
                System.out.println("How much is " +x+ " / " +y+ "?minimum two decimal places");
                return x / y;
            } else if (difficulty == 2) {
                SecureRandom random = new SecureRandom();
                double y = 10 + random.nextInt(89);
                double  x = 10 + random.nextInt(89);
                System.out.println("How much is " +x+ " / " +y+ "?minimum two decimal places");
                return x / y;
            } else if (difficulty == 3) {
                SecureRandom random = new SecureRandom();
                double y = 100 + random.nextInt(899);
                double  x = 100 + random.nextInt(899);
                System.out.println("How much is " +x+ " / " +y+ "?minimum two decimal places");
                return x / y;
            } else if (difficulty == 4) {
                SecureRandom random = new SecureRandom();
                double y = 1000 + random.nextInt(8999);
                double x = 1000 + random.nextInt(8999);
                System.out.println("How much is " +x+ " / " +y+ "?minimum two decimal places");
                return x / y;
            }

        } else if (type == 5) {
            int s;
            int m;
            SecureRandom random = new SecureRandom();
            s = 1 + random.nextInt(4);
            m = 1 + random.nextInt(4);
            return generate(s, difficulty);
        }
        return 0;
    }
    public static void responser(int response, int correct)
    {
        if (correct == 1)
        {
            switch (response) {
                case 1:
                    System.out.println("Correct");
                    break;
                case 2:
                    System.out.println("Excellent!");
                    break;
                case 3:
                    System.out.println("Nice Work!");
                    break;
                case 4:
                    System.out.println("Keep up the good work!");
                    break;
                case 5:
                    System.out.println("Very good!");
                    break;
            }
        }
        else
        {
            switch (response) {
                case 1:
                    System.out.println("No. Please try again.");
                    break;
                case 2:
                    System.out.println("Wrong. Try once more.");
                    break;
                case 3:
                    System.out.println("Dont give up!");
                    break;
                case 4:
                    System.out.println("No. Keep trying!");
                    break;
                case 5:
                    System.out.println("Incorrect, try it again!");
                    break;
            }

        }
    }

    public static void ask()
    {
        Scanner m = new Scanner(System.in);
        int type;
        int level;
        System.out.println("1. addition problems 2. multiplication problems 3. subtraction problems 4.division problems 5.random mix 6. QUIT");
        type = m.nextInt();
        if (type == 6)
        {
            System.out.printf("Goodbye.");
            System.exit(0);
        }
        System.out.println("1. single digit 2. double digit 3. triple digit 4. quadruple digits");
        level = m.nextInt();
        evaluater(type, level);

    }
    public static void evaluater(int type, int level)
    {
        SecureRandom p = new SecureRandom();
        double userValue;
        int response;
        Scanner s = new Scanner(System.in);
        int score = 0;
        for (int i = 0; i < 10; i++) {
            response = 1 + p.nextInt(5);
            double correct = generate(type, level);
            userValue = s.nextDouble();
            double epsilon = 0.01;
            if (Math.abs(userValue - correct) < epsilon) {
                score++;
                responser(response, 1);
            }
            else {
                responser(response, 0);
            }
        }
        System.out.printf("Your score is %d out of 100 percent.\n", score*10);
        if (score < 75) {
            System.out.println("Please ask your teacher for extra help");
        } else {
            System.out.println("Congratulations, you are ready to go to the next level!");
        }

    }


    public static void main(String[] args) {
        while (true) {
            ask();
            int userChoice;
            Scanner m = new Scanner(System.in);
            System.out.printf("Press 0 to Exit and any other number to continue\n");
            userChoice = m.nextInt();
            if (userChoice == 0)
            {
                System.out.printf("Goodbye.");
                System.exit(0);
            }


        }

    }
}