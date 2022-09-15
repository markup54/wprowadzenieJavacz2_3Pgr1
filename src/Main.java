import java.util.*;

public class Main {
    public static void main(String[] args) {
        //losowanie bez powtórzeń
        //kolekcja
        //w trakcie działania programu można zmieniać rozmiar kolekcji
        //kolekcja może przechowywać tylko typy złożone
        //Set - zbiór elementy nie bedą się powtarzać
        //w zbiorze elementy nie są indeksowane
        Set<Integer> wylosowane = new HashSet<>();
      while(wylosowane.size()<6){
            wylosowane.add((int)(Math.random()*10));
        }
        System.out.println("wylosowane:"+wylosowane);

      //wczytywanie z klawiatury 6 liczb
        Scanner klawiatura = new Scanner(System.in);
        List<Integer> wpisane = new ArrayList<>();
        System.out.println("Podaj 6 liczb");
        for(int i=0;i<6;i++){
            System.out.println("Liczba "+i);
            wpisane.add(klawiatura.nextInt());
        }
        System.out.println("Wpisane "+wpisane);
    }
}