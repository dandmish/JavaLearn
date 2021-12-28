import com.sun.source.tree.NewArrayTree;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.time.LocalDate;

public class TestEx {
    private Scanner in = new Scanner(System.in);

    public void numberOfRepeatSymbols() {

        int rep_characters = 0;
        String entered_string = getString("Введите строку: ");
        int strLen = entered_string.length();
        char[] array_characters = new char[strLen];
        char[] NewArray = entered_string.toCharArray();
        for (int i = 0; i < strLen; i++){
            for(int j = i + 1; j < strLen; j++){
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

    public String firstNonRecurringSymbol() {

        String firstNonRecurringSymbol = "";

        String entered_string = getString("Введите строку: ");
        int strLen = entered_string.length();
        for (int i = 0; i < entered_string.length(); i++) {
            boolean unique = true;
            for (int j = 0; j < entered_string.length(); j++) {
                if (i != j && entered_string.charAt(i) == entered_string.charAt(j)) {
                    unique = false;
                    break;
                }
            }
            if (unique) {
                firstNonRecurringSymbol ="" + entered_string.charAt(i);
                System.out.print(firstNonRecurringSymbol);
                break;
            }else {
                firstNonRecurringSymbol = "Все символы повторяются";
            }
        }
        return firstNonRecurringSymbol;
    }
    public String invertedWord() {

        String result;
        int j = 0;

        String entered_string = getString("Введите строку: ");
        int strLen = entered_string.length();
        char[] inverted_array = new char[strLen];
        char[] newArray = entered_string.toCharArray();
        for (int i = strLen - 1; i >= 0; i--) {
            inverted_array[j] = newArray[i];
            System.out.print(inverted_array[j]);
            j++;
        }
        result = new String(inverted_array);
        return result;
    }
    public boolean onlyNumbers() {

        boolean result = false;
        int j = 0;

        String entered_string = getString("Введите строку: ");
        if (entered_string.matches("[0-9]+")){
            result = true;
            System.out.print(result);
        }

        return result;
    }
    public Integer numberOfOccurencesSymbol() {

        int number_occurrences = 0;

        String entered_string = getString("Введите строку: ");
        String entered_symbols = getString("Введите символы для поиска: ");
        char[] array_str = entered_string.toCharArray();
        char[] array_symbols = entered_symbols.toCharArray();
        int StrLen = entered_string.length();
        int SymbolsLen = entered_symbols.length();
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
        String entered_string = getString("Введите строку: ");
        char[] strArray = entered_string.toCharArray();
        if(entered_string.length()%2 == 0){
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

        String entered_string = getString("Введите строку: ");
        String resString="" + entered_string.charAt(0);
        for (int i = 1; i < entered_string.length(); i++) {
            if (entered_string.charAt(i - 1) == entered_string.charAt(i)) {
                continue;
            }
            resString = resString + entered_string.charAt(i);
        }
        System.out.print(resString);
        return resString;
    }
    public String removeGivenSymbol(){

        String entered_string = getString("Введите строку: ");
        String entered_symbol = getString("Введите символ для поиска: ");
        entered_string = entered_string.replaceAll(entered_symbol, "");
        System.out.print(entered_string);
        return entered_string;
    }
    public char searchMostFrequentSymbol (){
        Integer max_occurrences = 1;
        int number_of_occurrences = 1;
        char most_frequent_character;
        String entered_string = getString("Введите строку: ");
        char[] SymbolsArray = entered_string.toCharArray();
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

    public void bubble_sort(){
        int [] mas = {6,5,3,4,1,2};

        boolean Sorted = false;
        int intermediate_variable;
        while(!Sorted) {
            Sorted = true;
            for (int i = 0; i < mas.length-1; i++) {
                if(mas[i] > mas[i+1]){
                    Sorted = false;

                    intermediate_variable = mas[i];
                    mas[i] = mas[i+1];
                    mas[i+1] = intermediate_variable;
                }
            }
        }
        for(int i = 0; i < mas.length-1; i++){
            System.out.print(mas[i]);
        }
    }

    public LocalDate convert_String_to_Date(){
        String date = getString("Введите дату: ");
        LocalDate localDate = LocalDate.parse(date);
        System.out.println(localDate);
        return localDate;
    }

    public Date formatDate(){
        return date_formatting("dd.MM.yyyy");
    }

    public Date currentTime(){
        return date_formatting("hh:mm");
    }
    public Date currentDate(){
        return date_formatting("dd.MM.yyyy");
    }
    public Date date_formatting(String date_format){
        Date currentDate = new Date();
        SimpleDateFormat dateFormat = null;

        dateFormat = new SimpleDateFormat(date_format);
        System.out.println(dateFormat.format(currentDate));
        return currentDate;
    }

    public String getString(String desired_string){
        System.out.print(desired_string);
        String entered_string = in.next();
        return entered_string;
    }

}
