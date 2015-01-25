package uebung11;

public class Lottoknoten {
	int zahl;
	Lottoknoten next;
	
	public Lottoknoten(int zahl) {
		this.zahl = zahl;
	}
	
	public int getZahl(){
		return zahl;
	}
	public Lottoknoten getNext(){
		return next;
	}
	
	public void setZahl(int zahl){
		this.zahl = zahl;
	}
	public void setNext(Lottoknoten next){
		this.next = next;
	}


}
