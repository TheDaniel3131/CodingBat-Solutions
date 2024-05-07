public String front22(String str) {
  String firstTwo;
  if (str.length() > 1){
     firstTwo = str.substring(0, 2);
  } else {
    firstTwo = str;
  }
  return firstTwo + str + firstTwo;
}
