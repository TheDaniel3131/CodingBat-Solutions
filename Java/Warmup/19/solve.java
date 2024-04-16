public String frontBack(String str) {
  if (str.length() < 2){
    return str;
  } 
  String middle_chars = str.substring(1, str.length() - 1);
  return str.charAt(str.length() - 1) + middle_chars + str.charAt(0);
}