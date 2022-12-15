package zadaca05;

import java.util.Set;
import java.util.TreeSet;
public class Main {
public static void main(String[] args) {
Set<String> mnozestvo1 = new TreeSet<String>();
mnozestvo1.add("Raka");
mnozestvo1.add("Kosa");
mnozestvo1.add("Noga");
Set<String> mnozestvo2 = new TreeSet<String>();
mnozestvo2.add("Oko");
mnozestvo2.add("Raka");
mnozestvo2.add("Nos");

System.out.println("Presek:");
mnozestvo1.retainAll(mnozestvo2);
System.out.println(mnozestvo1);

System.out.println("Unija:");
mnozestvo1.addAll(mnozestvo2);
System.out.println(mnozestvo1);
}
}
