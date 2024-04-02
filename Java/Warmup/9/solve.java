public boolean mixStart(String str) {
  // Check length less than 3
  if (str.length() < 3) {
    return false;
  }
  
  // Extract 'ix' out of 'mix'
  String ix = str.substring(1, 3);
  
  // Check if it is 'ix' else false
  if (ix.equals("ix")){
    return true;
  } else {
    return false;
  }
}
