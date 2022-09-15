import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        //losowanie bez powtórzeń
        //kolekcja
        //w trakcie działania programu można zmieniać rozmiar kolekcji
        //kolekcja może przechowywać tylko typy złożone
        //Set - zbiór elementy nie bedą się powtarzać
        //w zbiorze elementy nie są indeksowane
        Set<Integer> wylosowane = new HashSet<>();
        for(int i = 0 ; i<6;i++){
            wylosowane.add((int)(Math.random()*10));
        }
        System.out.println("wylosowane:"+wylosowane);
    }
}