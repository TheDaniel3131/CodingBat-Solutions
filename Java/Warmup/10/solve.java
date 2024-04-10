public int close10(int a, int b) {
  int x = Math.abs(a - 10);
  int y = Math.abs(b - 10);
  
  if (x < y){
    return a;
  } else if (y < x) {
    return b;
  } else {
    return 0;
  }
}

