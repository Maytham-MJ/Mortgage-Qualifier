# Mortgage-Qualifier

This is the Mortgage Qualifier app. In this app the user will be prompt to answer several equations to see if he/she
is qualified to receive Mortgage loan. The app will use various mathematical equations as well as if statements to come up
with the results.

Below are some of the steps that I have used to build this app.

  1.               // Here I will aks the user for his first and last name.
  2.              // Ask the user for his credit score
  3.             // Ask the user if he/she has recent BK
  4.            //Ask the user if he/she is renting or owning
  5.            \\ if they have any dept that is grater than %30 of their monthly income.
  6.             \\ if all looks good: Then I will link the Mortgage calculator.
  7.              \\ The Mortgage calculator will then take it step further if you want to know what your monthly payments will be.


                                    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
                                                    Equations
                                  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
                //B = L[(1 + c)n - (1 + c)p]/[(1 + c)n - 1]
               // This is the formula that allow us to calculate the remaining balance.
              // L == the loan amount
              \\ c == the monthly interest
               \\ n == the number of payments
                \\ p == the number of payments we have paid.



              //   monthlyIncome = income / 12;                          Calculate user monthly income
              \\   maximumMonthlyLimit = monthlyIncome / 2;               Calculate how much can you be qualified for per month.
