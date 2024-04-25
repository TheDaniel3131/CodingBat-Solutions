public boolean lastDigit(int a, int b) {
    String aStr = Integer.toString(a);
    String bStr = Integer.toString(b);
    return aStr.charAt(aStr.length() - 1) == bStr.charAt(bStr.length() - 1);
}


public boolean lastDigit(int a, int b) {
  // True if the last digits are the same
  return(a % 10 == b % 10);
}

public boolean lastDigit(int a, int b) {
    return Math.abs(a % 10) == Math.abs(b % 10);
}
