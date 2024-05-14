public int intMax(int a, int b, int c) {
  // a is the largest int
  if ((a  > b) && (a > c)){
    return a;
  }
  // b is the largest int
  if ((b > a) && (b > c)){
    return b;
  }
  // c is the largest int
  if ((c > a) && (c > b)){
    return c;
  }
  return 0;
}



public int intMax(int a, int b, int c) {
  int max;
  
  // First check between a and b
  if (a > b) {
    max = a;
  } else {
    max = b;
  }
  
  // Now check between max and c
  if (c > max) {
    max = c;
  }
  
  return max;
  
  // Could use the built in Math.max(x, y) function which selects the larger
  // of two values.
}