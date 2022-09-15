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
            wylosowane.add((int)(Math.random()*100+1));
        }
        //System.out.println("wylosowane:"+wylosowane);

      //wczytywanie z klawiatury 6 liczb
        Scanner klawiatura = new Scanner(System.in);
        List<Integer> wpisane = new ArrayList<>();
        //lista elementy mogą się powtarzać
        //lista ma indeksowane elementy
        System.out.println("Podaj 6 liczb");
        for(int i=0;i<6;i++){
            System.out.println("Liczba "+i);
            int wczytanaWartosc =klawiatura.nextInt();
            while(wpisane.contains(wczytanaWartosc)){
                System.out.println("Taka liczba już została podana podaj inną");
                wczytanaWartosc = klawiatura.nextInt();
            }
            wpisane.add(wczytanaWartosc);
        }
        System.out.println("Wpisane "+wpisane);

        //zapis listy która będzie zawierala elementy
        // ktore powtarzają się w wpisane i wylosowane
        List<Integer> trafione =new LinkedList<>();
        for(Integer wpisanaWartosc : wpisane){
            if(wylosowane.contains(wpisanaWartosc)){
                trafione.add(wpisanaWartosc);
            }
        }
        System.out.println("Trafione" + trafione);

    }
}