package market;

import java.util.ArrayList;
import java.util.List;

public class Magazin extends Literature{

    List<Magazin> magazinList = new ArrayList<>();
    String nameAuthor;
    String familyAuthor;


    public Magazin(int title, int article, int cost, int numberPlace, String nameAuthor, String familyAuthor ) {
        super(title, article, cost, numberPlace);
        this.nameAuthor = nameAuthor;
        this.familyAuthor = familyAuthor;
    }
    public void  putMagazin(Magazin magazin) {
        magazinList.add(magazin);
    }

    public void printMagazin(){
        if (magazinList.size() == 0) {
            System.out.println("Magazin " + article + " not found");
        } else {
            for (int i = 0; i < magazinList.size(); i++) {
                Magazin magazin = magazinList.get(i);
                magazin.printLiterature();

            }
        }
    }
}
