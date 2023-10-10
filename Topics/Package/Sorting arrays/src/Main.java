class ArraySorting {
    /**
     * @param array unordered sequence of strings
     * @return ordered array of strings
     */
    public static String[] sortArray(String[] array) {
        java.util.Arrays.sort(array);
        return array;
    }

    //    public static void main(String[] args) {
//        char[] array = new char[] {'y', 'd', 'b', 'u', 't', 'f', 'm', 'h', 'x', 'q'};
//        System.out.println(Arrays.toString(sortArray(array)));
//    }
}