import java.util.Scanner;

public class TestEx {

    public void Test1() {

        int rep_characters = 0;


        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String str1 = in.next();
        int StrLen = str1.length();
        char[] array_characters = new char[StrLen];
        char[] NewArray = str1.toCharArray();
        for (int i = 0; i < StrLen; i++){
            for(int j = i + 1; j < StrLen; j++){
                if(NewArray[i] == NewArray[j]){
                    array_characters[rep_characters] = NewArray[i];
                    rep_characters++;
                    break;
                }
            }
        }
        System.out.println("Повторяющиеся символы: ");
        for(int i = 0; i<rep_characters; i++){
            System.out.print(array_characters[i]);
        }
        System.out.println();
        System.out.println("Количество повторяющихся символов: " + rep_characters);
    }

    public char Test2() {

        int i = 0;

        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String str1 = in.next();
        int StrLen = str1.length();
        char[] NewArray = str1.toCharArray();
            for (int j = i + 1; j < StrLen; j++) {
                if (NewArray[i] != NewArray[j]) {
                    System.out.print(NewArray[i]);
                    return NewArray[i];
                }
            }
        return 'i';
    }
    public String Test3() {

        String result;
        int j = 0;

        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String str1 = in.next();
        int StrLen = str1.length();
        char[] inverted_array = new char[StrLen];
        char[] NewArray = str1.toCharArray();
        for (int i = StrLen - 1; i >= 0; i--) {
            inverted_array[j] = NewArray[i];
            System.out.print(inverted_array[j]);
            j++;
        }
        result = new String(inverted_array);
        return result;
    }
    public boolean Test4() {

        boolean result = false;
        int j = 0;

        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String str1 = in.next();
        if (str1.matches("[0-9]+")){
            result = true;
            System.out.print(result);
        }

        return result;
    }
    public Integer Test6() {

        int number_occurrences = 0;

        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String str1 = in.next();
        System.out.print("Введите символы для поиска: ");
        String symbols = in.next();
        char[] array_str = str1.toCharArray();
        char[] array_symbols = symbols.toCharArray();
        int StrLen = str1.length();
        int SymbolsLen = symbols.length();
        for (int i = 0; i < SymbolsLen; i++){
            number_occurrences = 0;
            for(int j = 0; j < StrLen; j++){
                if(array_str[j] == array_symbols[i]) {
                    number_occurrences++;
                }
            }
            System.out.println("Количество вхождений символа " + array_symbols[i] + ":" +  number_occurrences);
        }
        return number_occurrences;
    }
    public boolean Palindrom(){
        boolean palindrom = false;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String str1 = in.next();
        char[] strArray = str1.toCharArray();
        if(str1.length()%2 == 0){
            for(int i = 0; i < strArray.length/2-1; i++){
                if(strArray[i] != strArray[strArray.length-i-1]){
                    return false;
                }else{
                    palindrom = true;
                }
            }
        }else{
            for(int i = 0; i < (strArray.length-1)/2-1; i++){
                if(strArray[i] != strArray[strArray.length-i-1]){
                    return false;
                }else{
                    palindrom = true;
                }
            }
        }
        return palindrom;
    }
    public String removeRepeatSymbols(){

        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String str1 = in.next();
        String resString="" + str1.charAt(0);
        for (int i = 1; i < str1.length(); i++) {
            if (str1.charAt(i - 1) == str1.charAt(i)) {
                continue;
            }
            resString = resString + str1.charAt(i);
        }
        System.out.print(resString);
        return resString;
    }
    public String removeGivenSymbol(){

        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String str = in.next();
        System.out.print("Введите символ для поиска: ");
        String symbol = in.next();
        str = str.replaceAll(symbol, "");
        System.out.print(str);
        return str;
    }
    public char searchMostFrequentSymbol (){
        Integer max_occurrences = 1;
        int number_of_occurrences = 1;
        char most_frequent_character;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String str = in.next();
        char[] SymbolsArray = str.toCharArray();
        most_frequent_character = SymbolsArray[0];
        for (int i = 0; i < SymbolsArray.length - 1; i++){
            if (SymbolsArray[i] == SymbolsArray[i+1]){
                number_of_occurrences += 1;
            }else{
                number_of_occurrences = 1;
            }
            if(number_of_occurrences > max_occurrences){
                max_occurrences = number_of_occurrences;
                most_frequent_character = SymbolsArray[i];
            }

        }
        System.out.println(max_occurrences);
        System.out.print(most_frequent_character);
        return most_frequent_character;
    }
}
