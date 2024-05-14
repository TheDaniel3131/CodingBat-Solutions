public String endUp(String str) {
  if (str.length() < 3){
    return str.toUpperCase();
  }
  int length = str.length();
  String lastThreeChars = str.substring(length - 3, length);
  return str.substring(0, length - 3) + lastThreeChars.toUpperCase();
}
