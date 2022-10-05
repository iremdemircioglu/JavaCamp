public class Main {

	public static void main(String[] args) {
		
		OgretmenKrediManager ogretmen = new OgretmenKrediManager();
		ogretmen.Hesapla();
		
		KrediUI UI = new KrediUI();
		UI.KrediHesapla(ogretmen);
		UI.KrediHesapla(new TarimKrediManager());

	}

}
