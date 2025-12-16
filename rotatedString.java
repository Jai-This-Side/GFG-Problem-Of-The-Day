class rotatedString{
    public static boolean areRotations(String s1, String s2){  // O(n)
        if(s1.length() != s2.length()){
            return false;
        }
        s1 = s1+s1;
        return s1.lastIndexOf(s2) >= 0;
    }
    public static void main(String[] args) {
        Boolean result = areRotations("aab", "aba");
        System.out.println(result);
    }
}


