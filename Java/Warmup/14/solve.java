public String everyNth(String str, int n) {
  // Define output
  String output = "";
  
  // For loop, i = i + n here refers to the index of the str. 
  // So every nth char of the str, it will lookup and add to the output.
  for (int i = 0; i < str.length(); i = i + n){
    output += str.charAt(i);
  }
  return output;
}
