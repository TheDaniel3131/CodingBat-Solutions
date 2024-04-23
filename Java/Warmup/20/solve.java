public boolean icyHot(int temp1, int temp2) {
  if ((temp1 > 100) && (temp2 < 0)) {
    return true;
  } else if ((temp1 < 0) && (temp2 > 100)){
    return true;
  } else {
    return false;
  }
}

public boolean icyHot(int temp1, int temp2) {
  if ((temp1 < 0 && temp2 > 100) || (temp1 > 100 && temp2 < 0)) {
    return true;
  } else {
    return false;
  }
  // Could be written as: return ((temp1 < 0 && ...));
}