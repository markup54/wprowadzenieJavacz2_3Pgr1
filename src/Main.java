public class Main {
    public static void main(String[] args) {
//losowanie 6 liczb
        //wpisywanie 6 liczb
        //wypiszemy liczby wpisane i wylosowane
        System.out.println("Losowanie 6 liczb");

        //tablica
        int [] wylosowane =new  int[6];
        //tablice w Java nie mogą mieć zmienianego rozmiaru w trakcie działania
        //tablice w Java przechowują typy proste lub złożone
        for(int i=0;i<wylosowane.length;i++){
            wylosowane[i] =(int)( Math.random()*100 +1);
        }
        for(int wylosowanaWartosc :wylosowane){
            System.out.print(wylosowanaWartosc+" ");
        }


    }
}