class EnglishAlphabet {

    public static StringBuilder createEnglishAlphabet() {
        StringBuilder sb  = new StringBuilder(26);
        for (int i = 65; i <= 90; i++) {
            if (i == 90) {
                sb.append((char)i);
            } else {
                sb.append((char)i).append(" ");
            }
        }
        //System.out.println(sb);
        return sb;
    }

//    public static void main(String[]args) {
//        createEnglishAlphabet();
//    }
}