public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
  if (aSmile & bSmile){
    return true;
  } else if (!aSmile & !bSmile){
    return true;
  } else {
    return false;
  }
}



public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
    return ((aSmile && bSmile) || (!aSmile && !bSmile));
}




public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
    return (aSmile == bSmile);
}
