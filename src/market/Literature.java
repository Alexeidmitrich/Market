package market;

public class Literature {

    int title;
    int article;
    int cost;
    int numberPlace;

    public Literature(int title, int article, int cost, int numberPlace) {
        this.title = title;
        this.article = article;
        this.cost = cost;
        this.numberPlace = numberPlace;
    }
    public void printLiterature(){
        System.out.println("title " + title + ", article " + article + ", cost " + cost + ", Место " + numberPlace);
    }
}
