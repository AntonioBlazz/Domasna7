package zadaca02;

import java.util.List;
import java.util.ArrayList;

public class Main {
public static void main(String[] args) {
MetodiZaListaNiza object = new MetodiZaListaNiza();
List<String> lista = new ArrayList<String>();
lista.add("VODA");
lista.add("TETRATKA");
lista.add("TELEFON");
object.listToArray(lista);

String[] niza = {"voda", "tetratka", "telefon"};
object.arrayToList(niza);
}
}
