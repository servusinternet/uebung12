package uebung11;

public class Lottoliste {
	public static void lottoziehung(){
		// Liste erstellen
		Lottoknoten start = new Lottoknoten(1);
		Lottoknoten temp = start;
		for(int i=2;i<50;i++){
			Lottoknoten k =  new Lottoknoten(i);
			temp.setNext(k);
			temp = k;
			//System.out.println(temp.getZahl());
		}
		
		// Zahlen ziehen
		Lottoknoten zahl;
		Lottoknoten zahlNext;
		for(int i=0; i<6;i++){
			zahl = start;
			zahlNext = zahl.getNext();
			int rdm = (int)( Math.random()*49+1);
			while(true){
				if (zahlNext.getZahl() == rdm){
					zahl.setNext(zahlNext.getNext());
					break;
				}
				zahl = zahlNext;
				zahlNext = zahlNext.getNext();
			}
			System.out.println(zahlNext.getZahl());
		}
		
		// Liste ohne gezogene Zahlen ausgeben
		System.out.println("\nListe nach Ziehung:");
		for(Lottoknoten knoten = start; knoten.getNext()!=null; knoten=knoten.getNext()){
			System.out.print(knoten.getZahl() + " ");
		}
	}
	
	public static void main(String[] args) {
		lottoziehung();
	}

}
