import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String fullName = "Иванов Семён Семёнович" ;
        String fullNameCorrect = fullName.replace('ё' , 'е') ;
        System.out.println(fullNameCorrect);
    }
}