public class Tester{
  public static void main(String[] args){
    RealNumber A = new RealNumber(100);
    RealNumber B = new RealNumber(-0);
    System.out.println(A.getValue());
    System.out.println(B.getValue());

    System.out.println(A.equals(B));
    System.out.println(B.equals(A));

    System.out.println("\nequals() test");
    A = new RealNumber(1.00001);
    B = new RealNumber(1.000001);

    System.out.println(A.equals(B));
    System.out.println(B.equals(A));

    A = new RealNumber(0.000000000);
    B = new RealNumber(0.00000);

    System.out.println(A.equals(B));
    System.out.println(B.equals(A));

    System.out.println("\nadd() test");
    RealNumber C = new RealNumber(25);
    RealNumber D = C.add(C);
    RealNumber one = new RealNumber(1);
    System.out.println(D);
    System.out.println(A.add(C));
    System.out.println(B.add(C));

    System.out.println("\nmultiply() test");
    System.out.println(C.multiply(D)); //25 * 50
    System.out.println(C.multiply(A)); //0
    System.out.println(C.multiply(B)); //0
    System.out.println(A.multiply(B)); //0
    System.out.println(A.multiply(C)); //0
    System.out.println(D.multiply(C)); //50 * 25
    System.out.println(one.multiply(C)); //25

    System.out.println("\ndivide test");
    System.out.println(C.divide(one)); //25
    System.out.println(one.divide(one)); //1
    System.out.println(C.divide(C)); //1
    System.out.println(D.divide(C)); //2
    System.out.println(A.divide(C)); //0

    System.out.println("\ndivide test");
    System.out.println(D.subtract(C)); //25
    System.out.println(C.subtract(D)); //-25
    System.out.println(C.subtract(C)); //0
    System.out.println(D.subtract(A)); //50
    System.out.println(A.subtract(D)); //-50
    System.out.println(A.subtract(A)); //0

    System.out.println("\nSTART OF RATIONAL NUMBERS");
    RationalNumber A1 = new RationalNumber(50, 2);
    RationalNumber zero = new RationalNumber(101010010, 0);
    RationalNumber twnty5 = new RationalNumber(-50, -1);

    System.out.println("\ngetValue test");
    System.out.println(A1); //25
    System.out.println(zero); //0
    System.out.println(twnty5); //50

    System.out.println("\ngetNumerator test");
    System.out.println(A1.getNumerator()); //50
    System.out.println(zero.getNumerator()); //0
    System.out.println(twnty5.getNumerator()); //50

    System.out.println("\ngetDenominator test");
    System.out.println(A1.getDenominator()); //2
    System.out.println(zero.getDenominator()); //1
    System.out.println(twnty5.getDenominator()); //1

    System.out.println("\nreciprocal test");
    RationalNumber B1 = new RationalNumber(2, 50);
    System.out.println(A1.reciprocal()); //0.04
    System.out.println(zero.reciprocal()); //0
    System.out.println(twnty5.reciprocal()); //0.02
    System.out.println(B1.reciprocal()); //25

    System.out.println("\nequals test");
    RationalNumber C1 = new RationalNumber(0, 0);
    RationalNumber C2 = new RationalNumber(1010101, 0);
    RationalNumber C3 = new RationalNumber(50, 2);
    System.out.println(C1.equals(C2)); //true
    System.out.println(C3.equals(A1)); //true
    System.out.println(zero.equals(C1)); //true
    System.out.println(C3.equals(C1)); //false
    System.out.println(C3.equals(zero)); //false
    System.out.println(C3.equals(C1)); //false

    System.out.println("\nreduce test");
    RationalNumber R1 = new RationalNumber(5, 5);
    RationalNumber R2 = new RationalNumber(210, 45);
    RationalNumber R3 = new RationalNumber(1000, 100);
    RationalNumber R4 = new RationalNumber(56, 7);
    RationalNumber R5 = new RationalNumber(369, 9);
    RationalNumber R6 = new RationalNumber(10, 24);
    RationalNumber R7 = new RationalNumber(10, 39);

    System.out.println(R1);
    System.out.println(R2);
    System.out.println(R3);
    System.out.println(R4);
    System.out.println(R5);
    System.out.println(R6);
    System.out.println(R7);

    System.out.println("\nmultiply test");
    System.out.println(R1.multiply(R3)); //10/1
    System.out.println(R2.multiply(R7)); //140/117
    System.out.println(R6.multiply(R7)); //25/234
    System.out.println(R4.multiply(R3)); //80/1
    System.out.println(R5.multiply(R7)); //410/39

    System.out.println("\ndivide test");
    System.out.println(R1.divide(R3)); //1/10
    System.out.println(R2.divide(R7)); //91/5
    System.out.println(R6.divide(R7)); //13/8
    System.out.println(R4.divide(R3)); //4/5
    System.out.println(R5.divide(R7)); //1599/10

    System.out.println("\nadd test");
    System.out.println(R1.add(R3)); //11/1
    System.out.println(R2.add(R7)); //64/13
    System.out.println(R6.add(R7)); //35/52
    System.out.println(R4.add(R3)); //18/1
    System.out.println(R5.add(R7)); //1609/39

    System.out.println("\nsubtract test");
    System.out.println(R1.subtract(R3)); //-9/1
    System.out.println(R2.subtract(R7)); //172/39
    System.out.println(R6.subtract(R7)); //25/156
    System.out.println(R4.subtract(R3)); //-2
    System.out.println(R5.subtract(R7)); //1589/39
  }
}
