package odev3;

import java.time.LocalDate;

import Adapter.MernisServiceAdapter;
import Manager.GamerManager;
import odev3.Model.Gamer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate dTarihi = LocalDate.of(1997, 7, 8);
		Gamer gamer1 = new Gamer(0, "2020202020", "Mustafa", "Yýlmaz", dTarihi, "mustafayilmaz@gmail.com", "1234");
		// Gamer gamer2 = new Gamer(1, "ayse@hotmail.com", "1234");
		// Gamer gamer3 = new Gamer(2, "mehmet@hotmail.com", "1234");
		GamerManager gamerManager = new GamerManager(new MernisServiceAdapter());
		gamerManager.addUser(gamer1);
		// gamerManager.addUser(gamer2);
		gamerManager.addUser(gamer1);

		gamerManager.update(gamer1, "update@gmail.com", "updateSifre");
		gamerManager.deleteUser(gamer1);
	}

}
