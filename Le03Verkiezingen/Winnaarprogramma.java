import java.util.ArrayList;
import verkiezingen.Kandidaat;
import verkiezingen.Partij;
import verkiezingen.Stemmachine;

public class Winnaarprogramma {
  public static void main(String[] args) {
	  //opdracht: schrijf een programma dat willeukeurig een grote hoeveelheid stemmen uit brengt en vervolgens de kandidaat met de meeste stemmen afdrukt
	  
	  //stemmachine opstarten en stemmen uitbrengen
	  Stemmachine machine = new Stemmachine();
	  machine.zetAan();
	  machine.stemNKeer(16000, 15);
	  
	  // uitslagen uitlezen en resultaten printen
	  Kandidaat winnaar = null;
	  Partij winnaarPartij = null;
	  ArrayList<Partij> partijLijst = machine.getPartijen();
	  if (partijLijst.size() == 0){ // de machine staat nog niet aan
		  System.out.println("De machine is nog niet aangezet!");
	  }
	  else { // de machine staat al aan
		  for (Partij p: machine.getPartijen()){
			  for (Kandidaat k: p.getKandidaten()){
				  if (winnaar != null){ // dit is niet de eerste kandidaat die gechecked wordt
					  if (k.getAantalStemmen() > winnaar.getAantalStemmen()){ // huidige kandidaat heeft meer stemmen dan de hoogst tot nog toe
						  winnaar = k;
						  winnaarPartij = p;
					  }
				  }
				  else{ // dit is de eerste kandidaat die gechecked wordt
					  winnaar = k;
				  }
			  }
		  }
		  if (winnaar.getAantalStemmen() > 0){ // er is gestemd
			  System.out.println("De meeste stemmen kreeg " + winnaar.getNaam() + " (" + winnaarPartij.getNaam() + ") : " + winnaar.getAantalStemmen());
		  }
		  else { //er is niet gestemd
			  System.out.println("Er is niet gestemd.");
		  }
	  }
  }
}
