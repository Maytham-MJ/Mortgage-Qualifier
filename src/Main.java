import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;


public class Main {
                final static byte MONTHS_IN_YEAR = 12;  // So we can access them everywhere.
                final static byte PERCENT = 100;
    public static void main (String[]args) {
                float maximumMonthlyLimit;      //initializing these variables
                float monthlyIncome;
                float interestRate;


                Scanner scanner = new Scanner(System.in);
                System.out.println("Do you work ?");
                String doYouWork = scanner.next();
                if (!doYouWork.equals("YES".toLowerCase()) && !doYouWork.equals("NO".toLowerCase())) {  //if statements with the use of !
                    System.out.println("Please enter a valid answer");
                    System.exit(0);
                } else if (doYouWork.equals("no")) {
                    System.out.println("Sorry, you are not qualified!");
                    System.exit(0);
                } else {
                    System.out.println("Continue ......");
                }
                System.out.println("========================="); //Here we asked the user for option 1 ot 2. So that we can introduce the switch statement later.
                System.out.println("""                           
                        Pick (1) or (2):\s                         
                        1) w2 employee
                        2) self-employed
                        """);
                int w2 = scanner.nextInt();
                    switch (w2) {
                        case 1:
                            System.out.println("How many years have you been in your job?");
                            break;
                        case 2:
                            System.out.println("What is your average income in the last 5 years?");
                            break;
                        default:
                            System.out.println();
                            break;
                    }
                            System.out.println();

                    //New variable
                   //if Statement with the focus on how many years a user has in his/her job.                                                      /
                int answer = scanner.nextInt();
                if (answer < 2)
                    System.out.println("You need @ least 2 years of stable job before you can apply! ");
                else
                    System.out.println("Continue........");
                System.out.println("================================");


                // if statement checking is user income below the minimum.
                System.out.println("Enter your income: ");
                int income = scanner.nextInt();
                if (income < 65_000) {
                    System.out.println("Sorry you income is below our threshold, you are not qualified!");
                    System.exit(0);
                } else if (income > 65_000) {
                    System.out.println("You are Pre_qualified");
                }

                System.out.println("=============================================================");
                interestRate = 0;
                //Asking user for Credit input
                //Comparing and checking against user input.
                System.out.println("What is your Credit Score: ");
                int creditScore = scanner.nextInt();
                if (creditScore < 650) {
                    System.out.println("Sorry, you may need to work on your credit score first before applying for mortgage");
                    System.exit(0);
                } else if (creditScore > 650 && creditScore <= 700) {
                    System.out.println("Good!");
                    if (creditScore == 700) {
                        interestRate = 5.3f;
                    }
                } else if (creditScore > 700 && creditScore <= 800) {
                    System.out.println("Great!");
                    if (creditScore > 730) {
                        interestRate = 3.0f;
                    }
                }

                System.out.println("====================================================");
                System.out.println("NEXT...");
                System.out.println("====================================================");

                System.out.println("Did you have bankruptcy in the past 3 years: ?");
                String bKAnswer = scanner.next();
                if (!bKAnswer.equals("yes") && !bKAnswer.equals("no")) {
                    System.out.println("Please answer with yes or no");
                    System.exit(0);
                } else if (bKAnswer.equals("yes")) {
                    System.out.println("More docs are required. You will be contacted by one of our agents.");
                } else {
                    System.out.println("Great!");
                }

                monthlyIncome = income / 12;                           //Calculate user monthly income
                maximumMonthlyLimit = monthlyIncome / 2;              //Calculate how much can you be qualified for per month.
                                                                     // Asking user if he/she has asset.
                System.out.println("Is this your first time Mortgage?");
                String firstTimeHome = scanner.next();

                if (firstTimeHome.equals("yes")) {
                    System.out.println("You will be contacted by one of our agents to tell you about our first time home owners programs!");
                } else if (firstTimeHome.equals("no")) {
                    System.out.println("Congratulation on your achievement!");
                }
                System.out.println("==================================================================================");
                System.out.println("NEXT");
                System.out.println("==================================================================================");

               AccountHolderDownPayment down0 = new AccountHolderDownPayment();
               down0.downPayment();
                double down = scanner.nextDouble();
                if(down <= 0){
                    System.out.println("You can not have 0 down payment mortgage, you have to show some financial capability!");
                    System.exit(0);
                }else {
                    System.out.println();
                }

                System.out.println("Do you have dept?");
                String deptAnswer = scanner.next();

                int totalDept = 0;                  //Declaring totalDept as int
                switch (deptAnswer) {
                    case "yes" -> {
                        System.out.println("How much do you pay monthly in total for all of your dept: "); //Asking user if there is any dept and storing the answer.
                        totalDept = scanner.nextInt();   //Using totalDept to store the answer.
                    }
                    case "no" -> System.out.println("Great!");
                }


                if (totalDept == maximumMonthlyLimit) {
                    System.out.println("Sorry, your Dept to income ratio is too high. We can't get you qualified");  //Compare and check to see if user can be qualified or not if he/she has dept
                    System.exit(0);
                } else
                    System.out.println();
                System.out.println("===========================================================================");
                System.out.println("You are qualified!");
                System.out.println("===========================================================================");

                scanner = new Scanner(System.in);
                System.out.println("Enter your First and Last name:  ");
                String name = scanner.nextLine();

        System.out.println("=========================================================================");
                System.out.println("NEXT");
                System.out.println("=========================================================================");



                double DOB = 0;

                try {
                    System.out.println("What is your date of birth: in ddmmyyyy format ");
                    DOB = scanner.nextDouble();
                } catch (InputMismatchException ex) {
                    System.out.println("Please re-enter your DOB without / or - ");
                    System.exit(0);
                }

        int mortgageYears=0;
                System.out.println("How long you want to finance your mortgage: 10, 15 or 30 years?");
                mortgageYears = scanner.nextInt();
                System.out.println("===========================================================");


                AccountHolderDownPayment accountHolder = new AccountHolderDownPayment();
                accountHolder.setName(name);
                accountHolder.setIncome(income);


                double $youQualyfiedFor = maximumMonthlyLimit * 12 * 10;
                NumberFormat formatter = NumberFormat.getCurrencyInstance();
                ArrayList<String> data = new ArrayList<>();
                data.add("Your Credit: " + creditScore);
                data.add("Years of mortgage: " + mortgageYears);
                data.add("Your down payment: " + formatter.format(down));
                for (String DATA : data)
                    System.out.println(DATA);


                System.out.println("==============================");
                System.out.println("Your account has been created.");
                System.out.println("=============================");

                System.out.println("Your account name is: " + accountHolder.getName());
                System.out.println("Your income is: " + formatter.format(income));


                System.out.println("Your accountNumber is: " + DOB);
                formatter = NumberFormat.getCurrencyInstance();
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("You qulified for a maximum of " + formatter.format(maximumMonthlyLimit) + " in monthly mortgage");
                System.out.println("You are qualified for " + formatter.format($youQualyfiedFor));
                System.out.println("Your interest rate is: % " + interestRate);
                System.out.println("Over: " + mortgageYears + " Years");

                System.out.println("===================================================================");


                System.out.println("Have you find a home?");
                String home = scanner.next();
                if (home.equals("yes")) {
                    System.out.println("Congratulation, if you want to see what will be your monthly payments, move on and enter your home value");
                } else if (home.equals("no")) {
                    System.out.println("That is fine home search is important step in your buying process. Feel free to use our Mortgage Calculator later when you fine your home.");
                    System.out.println("Thanks for using Mortgage Qualifier");
                    System.exit(0);
                }

                //Here we are declaring the principal, annualInterest and the mortgage years. So we can access them everywhere below.
                int principal;
                float annualInterest;
                byte years;
                // Here we are asking and  checking for Home price/Principal
                while (true) {
                    System.out.println("Principal: ");
                    principal = scanner.nextInt();
                    if (principal >= 100_000 && principal <= 1_000_000)
                        break;
                    System.out.println("Enter a number between 100,000 _ 1,000,000");
                }
                // Here we are asking and checking for the annual Interest rate.
                while (true) {
                    System.out.println("Annual Interest Rate: ");
                    annualInterest = scanner.nextFloat();
                    if (annualInterest >= 1 && annualInterest <= 30)
                        break;
                    else System.out.println("Enter Interest Rate between 1 - 30");
                }
                // Here we are asking and checking for the numbers of years
                while (true) {
                    System.out.println("Period (Years): ");
                    years = scanner.nextByte();
                    if (years > 1 && years <= 30)
                        break;
                    else
                        System.out.println("Enter a number between 1 - 30");
                }
                // Here we are getting the return value of this method and store it in a variable called mortgage.
                var calculations = new MortgageCalculations(principal, annualInterest, years);
                double mortgage = calculations.calculateMortgage();
                String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
                System.out.println();
                System.out.println("MORTGAGE\n" + "===========\n" + "Your Monthly Payments: " + mortgageFormatted);
                System.out.println();
                System.out.println("PAYMENTS SCHEDULE");
                System.out.println("======================");
                for (double balance : calculations.getBalancePayments())
                    System.out.println(NumberFormat.getCurrencyInstance().format(balance));

                System.out.println();
                System.out.println("===================================");
                System.out.println("Thanks for using Mortgage Qualifier");


                System.out.println("~~   ~~");
                System.out.println("~~ ~~  ~~     ~~     ~~~     ~~~~~~     ~~ ~     ~~      ~~ ~    ~~~~");
                System.out.println("~~   ~   ~~   ~~~~    ~~~~      ~~      ~   ~~    ~~~    ~   ~~   ~~~");
                System.out.println("~~        ~~    ~~    ~    ~~     ~       ~~~     ~   ~    ~~     ~~~");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("~~~    ~   ~   ~~    ~~     ~   ~~~~  ~   ~~~~   ~~~");
                System.out.println("~~~    ~   ~   ~~~   ~~     ~   ~~~   ~   ~~~    ~~~~");
                System.out.println("~~~ ~   ~~~   ~   ~  ~~~~~  ~   ~     ~   ~~~~   ~   ~~");


            }

            }














