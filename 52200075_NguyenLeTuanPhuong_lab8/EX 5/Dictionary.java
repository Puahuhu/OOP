import java.util.HashMap;
import java.util.Scanner;

class Dictionary {
    public static String checkWordExist(HashMap<String, String> dictionary, String word) {
        for(String i : dictionary.keySet()) {
            if(i.equals(word)) {
                return word + " exists in the dictionary";
            }
        }
        return word + " doesn't exist in the dictionary";
    }

    public static String findMeaning(HashMap<String, String> dictionary, String word) {
        for(String i : dictionary.keySet()) {
            if(i.equals(word)) {
                return word + " mean " + dictionary.get(i);
            }
        }
        return word + " doesn't exist in the dictionary";
    }

    public static void main(String[] args) {
        HashMap<String, String> dictionary = new HashMap<String, String>();
        dictionary.put("Love", "Yeu");
        dictionary.put("Hate", "Ghet");
        dictionary.put("Normal", "Binh thuong");
        dictionary.put("Angry", "Gian du");
        dictionary.put("Cold", "Lanh leo");
        dictionary.put("Hot", "Nong buc");
        dictionary.put("Tired", "Met moi");
        dictionary.put("Up", "Tren");
        dictionary.put("Down", "Duoi");
        dictionary.put("OOP", "Lap trinh huong doi tuong");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter some word: ");
        String s = sc.nextLine();
        System.out.println(checkWordExist(dictionary, s));
        System.out.println(findMeaning(dictionary, s));
    }
}