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
    System.out.println(D);
    System.out.println(A.add(C));
    System.out.println(B.add(C));
  }
}
