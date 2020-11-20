public class RealNumber{
  private double value;

  public RealNumber(double v){
    value = v;
  }

  public double getValue(){
    return value;
  }

  public String toString(){
    return "" + getValue();
  }

  public boolean equals(RealNumber other){
    if (getValue() == 0){
      if (other.getValue() == 0){
        return true;
      }
      else{
        return false;
      }
    }

    double error = (Math.abs(getValue() - other.getValue())/other.getValue()) * 100;

    if (error <= 0.001){
      return true;
    }

    return false;
  }

  public RealNumber add(RealNumber other){
    RealNumber sum = new RealNumber(getValue() + other.getValue());

    return sum;
  }
}
