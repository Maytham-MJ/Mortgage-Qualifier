
    public class MortgageCalculations {
        private int principal;
        private float annualInterest;
        private byte years;

        public MortgageCalculations(int principal, float annualInterest, byte years) {
            this.principal = principal;
            this.annualInterest = annualInterest;
            this.years = years;
        }

        public  double calculateBalance( short numberOfPaymentsMade) {
            float monthlyInterest = getMonthlyInterest();
            float numberOfPayments = getNumberOfPayments();

            return principal * (Math.pow(1 + monthlyInterest, numberOfPayments) - Math.pow(1 + monthlyInterest, numberOfPaymentsMade)) / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
        }

        public  double calculateMortgage() {      //Here we are bringing all the mortgage calculation is one place.

            float monthlyInterest = getMonthlyInterest();
            float numberOfPayments = getNumberOfPayments();

            return principal * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                    / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        }



        public double[] getBalancePayments() {
            double[] balances = new double[getNumberOfPayments()];
            for (short month = 1; month <= balances.length; month++) {
                balances[month-1] = calculateBalance(month);
            }
            return balances;
        }




        private int getNumberOfPayments() {
            return years * Main.MONTHS_IN_YEAR;
        }

        private float getMonthlyInterest() {
            return annualInterest / Main.PERCENT / Main.MONTHS_IN_YEAR;
        }
    }


