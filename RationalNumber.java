public class RationalNumber extends RealNumber{
  private int numerator, denominator;

  public RationalNumber(int nume, int deno){
    super(0.0);
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

    return numeSame && denomSame;
  }

  public String toString(){
    return getNumerator() + "/" + getDenominator();
  }
}
