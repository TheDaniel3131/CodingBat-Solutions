public String backAround(String str) {
  String last_char = str.substring(str.length()-1);
  return last_char + str + last_char;
}
