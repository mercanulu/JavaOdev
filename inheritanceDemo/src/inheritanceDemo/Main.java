package inheritanceDemo;

public class Main {

	public static void main(String[] args) {
		//polimorfizm
		KrediUI krediUI=new KrediUI();
		krediUI.krediHesapla(new OgretmenKrediManager());
		krediUI.krediHesapla(new AskerKrediManager());
		krediUI.krediHesapla(new OgretmenKrediManager());

	}

}
