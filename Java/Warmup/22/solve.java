public String startOz(String str) {
    if (str.startsWith("oz")) {
        return "oz";
    } else if (str.startsWith("o")) {
        return "o";
    } else if (str.length() > 1 && str.substring(1, 2).equals("z")) {
        return "z";
    } else {
        return "";
    }
}
