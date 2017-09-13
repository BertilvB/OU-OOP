import java.util.ArrayList;
import verkiezingen.Stemmachine;
import verkiezingen.Partij;
import verkiezingen.Kandidaat;

public class Herhalingsprogramma {
  public static void main(String[] args) {
	  // opdracht: Schrijf een programma dat alle partijen ne haar kandidaten print.
	  Stemmachine machine = new Stemmachine();
	  machine.zetAan();
	  for (Partij p: machine.getPartijen()){
		  System.out.println(p.getNaam());
		  int kandidaatNummer = 1;
		  for (Kandidaat k: p.getKandidaten()){
			  System.out.println("  " + kandidaatNummer + ". " + k.getNaam() + " uit " + k.getWoonplaats());
			  kandidaatNummer = kandidaatNummer + 1;
		  }
		  System.out.println("");		  
	  }
  }
}