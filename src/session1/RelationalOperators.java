void main () {

    int PeterAge = 17;
    int JohnAge = 18;
    int MaryAge = 19;

    int LegalAge = 18;

    boolean Peter = (PeterAge >= LegalAge);
    IO.println("Is PeterAge equal to 18? " + Peter);

    boolean Johns = (JohnAge >= LegalAge);
    IO.println("Is JohnsAge equal to 18? " + Johns);

    boolean Mary = (MaryAge >= LegalAge);
    IO.println("Is MarysAge equal to 18? " + Mary);

// without boolean
    IO.println("Is Peter of legal age? " + (PeterAge >= LegalAge));
    IO.println("Is John of legal age? " + (JohnAge >= LegalAge));
    IO.println("Is Mary of legal age? " + (MaryAge >=LegalAge));


    // Conditional operators
    int a = 5;
    int b = 2; // change the value around to affect the booleans
    int c = 15;

    boolean logicalAND = a < b && b < c;
    IO.println("The value is b between a & c? " + logicalAND);

    boolean logicalOR = a > b || b > c;
    IO.println("The value is not between a and c " + logicalOR);

    //can also be solved like:

    boolean bIsLargerThanA = (a < b);
    boolean bIsSmallerThanC = (b < c);
    boolean result = bIsLargerThanA && bIsSmallerThanC;
    IO.println("Is b between a and c? " + result);

    boolean bIsSmallerThanA = (b < a);
    boolean bIsLargerThanC = (b > c);
    boolean result1 = bIsSmallerThanA || bIsLargerThanC;
    IO.println("Is b not between a and c? " + result1);
}