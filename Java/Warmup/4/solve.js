public String missingChar(String str, int n) {
    if (str == null || str.isEmpty() || n < 0 || n >= str.length()) {
        return str;
    }
    
    StringBuilder result = new StringBuilder(str);
    result.deleteCharAt(n);
    
    return result.toString();
}
