package service;

import datastr.MyGraph;
import model.City;

public class MainService {

	public static void main(String[] args) {
		MyGraph<City> map = new MyGraph<City>();
		
		try {
			
			City c1 = new City("Ventspils", 55.4f, "LV-3601");//[0]
			City c2 = new City("Tukums",13.35f,"LV-3101");//[1]
			City c3 = new City("Rīga",307.2f, "LV-3401");//[2]
			City c4 = new City("Talsi",7.85f, "LV-3201") ;//[3]
			City c5 = new City("Saldus",10.1f,"LV-3501");//[4]
			City c6 = new City("Liepāja",68.02f, "LV-3001");//[5]
			City c7 = new City("Kuldīga",13,"LV-3301") ;//[6]
			
			
			map.addVertice(c1);
			map.addVertice(c2);
			map.addVertice(c3);
			map.addVertice(c4);
			map.addVertice(c5);
			map.addVertice(c6);
			map.addVertice(c7);
			
			map.addEdge(c1, c3, 190);
			map.addEdge(c1, c7, 60);
			map.addEdge(c1, c6, 111);
			map.addEdge(c1, c4, 75);
			map.addEdge(c4, c2, 55);
			map.addEdge(c2, c3, 67);
			map.addEdge(c7, c5, 51);
			//TODO papildināt ar citiem ceļiem
			
			map.print();
			//TODO uztaisīt,lai izprintēt tieši elementa vērtību nevis indeksu
			//TODO uztaisīt removeVertice
			//TODO uztaisīt removeEdge
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
