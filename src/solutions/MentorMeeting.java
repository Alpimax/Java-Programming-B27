package solutions;


import java.util.*;

public class MentorMeeting {
    public static void main(String[] args) {
//        int[] a = {1, 0, 3, 0, 5, 0, 6, 0, 7, 20, 50, 0, 27, 33};
//        System.out.println(Arrays.toString(arr(a)));
//
//
//        System.out.println(Arrays.toString(arraySort(a)));
//        finra(5);
//        System.out.println(fact(5));
//        System.out.println(stringInt("isa99qwehu123jasa7")); //31
//        System.out.println("alpi");
        Map<String, Integer> map = FrequencyOfCharacters("alperrozkann");
        minValue(map);

    }




    public static List<Integer> sortMap(Map<String, Integer> str) {
        List<Integer> list = new LinkedList<>();
        for (Map.Entry<String, Integer> each : str.entrySet()) {
            list.add(each.getValue());
        }
        Collections.sort(list);
        return list;
    }


    public static Map<String, Integer> FrequencyOfCharacters(String str) {
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            String key = "" + str.charAt(i);
            if (!map.containsKey(key)) {
                map.put(key, 1);
            } else {
                map.put(key, map.get(key) + 1);
            }
        }
        return map;
    }

    public static Map<String, Integer> UniqueCharacterFromString(String str) {
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            String key = "" + str.charAt(i);
            if (!map.containsKey(key)) {
                map.put(key, 1);
            } else {
                map.put(key, map.get(key) + 1);
            }
        }
        Map<String, Integer> unique = new HashMap<>();
        for (Map.Entry<String, Integer> each : map.entrySet()) {
            if (each.getValue() == 1) {
                unique.put(each.getKey(), each.getValue());
            }
        }
        return unique;
    }

    public static void minValue(Map<String, Integer> map) {
//        System.out.println(sortMap(map).get(0));

        int min = Integer.MAX_VALUE;
        String key = "";

        for (Map.Entry<String, Integer> each : map.entrySet()) {
            if (min > each.getValue()) {
                min = each.getValue();
                key = each.getKey();
            }
        }
        System.out.println(key +" = " +  min);
    }


    public static int[] arraySort(int[] a) {
        int[] arr = new int[a.length];

        int index = 0;
        for (int each : a) {
            if (each != 0) {
                arr[index++] = each;
            }
        }
        return arr;
    }

    public static void finra(int n) {
        if (n % 5 == 0 && n % 3 == 0) {
            System.out.println("FINRa");
        } else if (n % 5 == 0) {
            System.out.println("RA");
        } else if (n % 3 == 0) {
            System.out.println("FIN");
        } else
            System.out.println("not FINRA");
    }

//    public static int fibonnacci(int n) {
//        int n1, n2, n3;
//        int count = 0;
//
//        n2 = (n3 - 1);
//        n1 = (n3 - 2);
//        n3 = n2 + n1;
//        n1 = n2;
//        n2 = n3;
//        while (n1 > 0) {
//
//        }
//    }

    public static int fact(int n) {
        int total = 1;
        for (int i = 1; i <= n; i++) {
            total *= i;

        }
        return total;
    }

    public static String fact(String str) {

        boolean isnumber = false;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                isnumber = true;
            }
            if (isnumber == true) {
            }
        }
        return "";
    }


    public static void ascend_letter(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < str.length(); j++) {
            }
            if (Character.isDigit(str.charAt(i))) {
            }
        }
    }

    public static String sum(int a, int b) {
        double c = a + b;
        String result = "";
        if (c > a) {
            result = "Aqeel";
        } else
            result = "Isa";

        return result;

    }

    public static double sum(double c) {
        return 5.0;
    }

    public static boolean sum(int a, int b, double c, boolean d) {
        return true;
    }
//    Write a method that can return the sum of the digits in a string


    public static int stringInt(String str) {
        int total = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                total += Integer.parseInt(str.substring(i, i + 1));
            }
        }
        return total;
    }

    public static int[] arr(int[] arr) {
//        Q11. Write a return method that can sort an int array in Ascending order without
//        using the sort method of the Arrays class

        int[] arrmax = new int[arr.length];

        int index = 0;
//        {1,4,5,7,10}
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            for (int j = i; j < arr.length; j++) {
                if (min > arr[j]) {
                    min = arr[j];
                }

            }
            arrmax[index++] = min;

        }
        return arrmax;
    }

    public static int divideWithout(int number, int number2) {
        var count = 0;
        while ((number - number2) >= 0) {

        }

        return count;
    }


}
