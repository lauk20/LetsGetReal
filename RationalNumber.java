public class RationalNumber extends Number{
  private int numerator, denominator;

  public RationalNumber(int nume, int deno){
    if (deno == 0){
      nume = 0;
      deno = 1;
    }

    if (deno < 0){
      nume = nume * -1;
      deno = deno * -1;
    }

    numerator = nume;
    denominator = deno;

    reduce();
  }

  public double getValue(){
    return ((double)numerator/(double)denominator);
  }

  public int getNumerator(){
    return numerator;
  }

  public int getDenominator(){
    return denominator;
  }

  public RationalNumber reciprocal(){
    RationalNumber result = new RationalNumber(getDenominator(), getNumerator());

    return result;
  }

  public boolean equals(RationalNumber other){
    boolean numeSame = (getNumerator() == other.getNumerator());
    boolean denomSame = (getDenominator() == other.getDenominator());

    return (numeSame && denomSame) || (numeSame && getNumerator() == 0);
  }

  public String toString(){
    return getNumerator() + "/" + getDenominator();
  }

  private static int gcd(int a, int b){
    a = Math.abs(a);
    b = Math.abs(b);

    if (a < b){
      int holder = b;
      b = a;
      a = holder;
    }

    int r = a;

    for (int i = r; i > 0 && a != 0 && b != 0; i = r){
      r = a % b;
      if (r == 0){
        return b;
      }
      a = b;
      b = r;
    }

    return 1;
  }

  private void reduce(){
    int gcd = gcd(getNumerator(), getDenominator());
    numerator = getNumerator() / gcd;
    denominator = getDenominator() / gcd;
  }

  public RationalNumber multiply(RationalNumber other){
    int top = getNumerator() * other.getNumerator();
    int bot = getDenominator() * other.getDenominator();

    RationalNumber product = new RationalNumber(top, bot);

    return product;
  }

  public RationalNumber divide(RationalNumber other){
    RationalNumber recipOther = other.reciprocal();

    return multiply(recipOther);
  }

  public RationalNumber add(RationalNumber other){
    int top = (getNumerator() * other.getDenominator()) + (other.getNumerator() * getDenominator());
    int bot = getDenominator() * other.getDenominator();

    RationalNumber result = new RationalNumber(top, bot);

    return result;
  }

  public RationalNumber subtract(RationalNumber other){
    int top = (getNumerator() * other.getDenominator()) - (other.getNumerator() * getDenominator());
    int bot = getDenominator() * other.getDenominator();

    RationalNumber result = new RationalNumber(top, bot);

    return result;
  }
}
