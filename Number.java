public abstract class Number{
  public abstract double getValue();

  public boolean equals(Number other){
    if (getValue() == 0){
      if (other.getValue() == 0){
        return true;
      }
      else{
        return false;
      }
    }

    double error = (Math.abs(getValue() - other.getValue())/other.getValue()) * 100;

    if (Math.abs(error) <= 0.001){
      return true;
    }

    return false;
  }
}
