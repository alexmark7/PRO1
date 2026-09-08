void main() {
    //select exercise to run
    E3();

}

//Exercise 1 - Triangle Type
void E1() {

    int firstSide = Integer.parseInt(IO.readln("Enter first side: "));
    int secondSide = Integer.parseInt(IO.readln("Enter second side: "));
    int thirdSide = Integer.parseInt(IO.readln("Enter third side: "));

    if ((firstSide + secondSide <= thirdSide) || (secondSide + thirdSide <= firstSide) || (thirdSide + firstSide <= secondSide)) {
        IO.println("Invalid: sum of any two sides <= third side");
    } else if (firstSide == secondSide && firstSide == thirdSide) {
        IO.println("Equilateral: all sides equal");
    } else if ((firstSide == secondSide) || (secondSide == thirdSide) || (thirdSide == firstSide)) {
        IO.println("Isosceles: exactly two sides equal");
    } else {
        IO.println("The sides are not equal");
    }

}

//Exercise 2 - Library Fine Calculator
void E2() {

    String bookType = IO.readln("Enter book type (fiction/non-fiction/reference): ").toLowerCase().trim();
    IO.println("Book Type: " + bookType);
    int overDue = Integer.parseInt(IO.readln("Enter overdue days: "));
    IO.println(overDue + " days overdue");

    //result = condition ? valueIfTrue : valueIfFalse;
    //Base fees
    double fictionFee = (0.50 * overDue > 10) ? 10 : 0.50 * overDue;
    double nonFictionFee = (0.25 * overDue > 5) ? 5 : 0.25 * overDue;
    double referenceFee = (overDue > 20) ? 20 : overDue;

    //Additional fees
    double processingFee = (overDue > 30) ? +5 : +0;
    double replacementFee = (overDue > 60) ? +10 : +0;
    double rushProcessingFee = (bookType.equals("reference") && overDue > 14) ? +15 : +0;

    //Totals
    double fictionTotal = fictionFee + processingFee + replacementFee;
    double nonFictionTotal = nonFictionFee + processingFee + replacementFee;
    double referenceTotal = referenceFee + processingFee + rushProcessingFee;

    if (bookType.equals("fiction")) {
        IO.println("Base fine: $" + fictionFee);
        IO.println("Processing fee: $" + processingFee);
        IO.println("Replacement fee: $" + replacementFee);
        IO.println("Total fine: $" + fictionTotal);
    } else if (bookType.equals("non-fiction")) {
        IO.println("base fine $: " + nonFictionFee);
        IO.println("Processing fee: $" + processingFee);
        IO.println("Replacement fee: $" + replacementFee);
        IO.println("Total fine: $" + nonFictionTotal);
    } else if (bookType.equals("reference")) {
        IO.println("base fine: $" + referenceFee);
        IO.println("Processing fee: $" + processingFee);
        IO.println("Rush processing fee: $" + rushProcessingFee);
        IO.println("Total fine: $" + referenceTotal);
    }

}

//Exercise 3
void E3() {

    double billAmount = Integer.parseInt(IO.readln("Enter bill amount: "));
    IO.println(billAmount);

    int drinksAmount = Integer.parseInt(IO.readln("How many drinks? (drinks are 5$ each): "));
    IO.println(drinksAmount);

    int numberOfPeople = Integer.parseInt(IO.readln("Enter number of people: "));
    IO.println(numberOfPeople);

    String weekend = IO.readln("Enter the day of week): ").toLowerCase().trim();
    IO.println(weekend.substring(0, 1).toUpperCase() + weekend.substring(1));

    int time = Integer.parseInt(IO.readln("Enter time (24-hour) format: "));
    IO.println(time);

    int age = Integer.parseInt(IO.readln("Enter your age: "));
    IO.println(age);

    //result = condition ? valueIfTrue : valueIfFalse;

    int drink = 5;
    boolean happyHour = time >= 15 && time <= 18;
    double drinksDiscount = happyHour ? (drinksAmount * drink) * 0.20 : 0;
    double drinksTotal = (drinksAmount * drink) - drinksDiscount;

    double groupDiscount = numberOfPeople > 8 ? billAmount * 0.15 : 0;

    double seniorDiscount = age > 65 ? (billAmount - groupDiscount) * 0.10 : 0;

    boolean isWeekend = (weekend.equals("saturday") || weekend.equals("sunday"));
    double weekendSurchage = isWeekend ? (billAmount - seniorDiscount - groupDiscount) * 0.05 : 0;

    double serviceCharge = billAmount > 100 ? (billAmount + weekendSurchage - seniorDiscount - groupDiscount) * 0.18 : (billAmount + weekendSurchage - seniorDiscount - groupDiscount) * 0.15;
    double serviceChargeProcentage = billAmount + serviceCharge > 100 ? 18 : 15;


    double finalBillAmount = billAmount - groupDiscount - seniorDiscount + weekendSurchage + serviceCharge + drinksTotal;

    IO.println("Original bill: $" + billAmount);
    IO.println("Group discount (15%): -$" + groupDiscount);
    IO.println("Senior discount (10%): -$" + seniorDiscount);
    IO.println("Weekend surchage (5%): +$" + weekendSurchage);
    IO.println("Service charge (" + serviceChargeProcentage + "%): +$" + serviceCharge);

    if (happyHour && 0 < drinksAmount) {
        IO.println("Drinks added: $" + drinksAmount + "@ 5$ = " + drinksAmount * drink );
        IO.println("Drinks discount (20%): -$" + drinksDiscount);
    } else {
        IO.println("Price for drinks: $" + drinksTotal);
    }

    IO.println("Final bill: $" + finalBillAmount);


}

//Exercise 4
void E4() {


}