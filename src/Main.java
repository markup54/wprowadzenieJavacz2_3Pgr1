import java.util.*;

public class Main {
    public static void main(String[] args) {

        Set<Integer> wylosowane = new HashSet<>();
        wylosowane = losowanieLiczb(6);


        List<Integer> wpisane = new ArrayList<>();
        wpisane = wpisanieLiczb();
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
    public static Set<Integer> losowanieLiczb(int n){
        Set<Integer> wylosowane  = new HashSet<>();
        while(wylosowane.size()<n){
            wylosowane.add((int)(Math.random()*100+1));
        }
        return wylosowane;
    }
    public static List<Integer> wpisanieLiczb(){
        Scanner klawiatura = new Scanner(System.in);
        List<Integer> wpisane = new ArrayList<>();
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
        return wpisane;
    }
}