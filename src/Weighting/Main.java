package Weighting;

public class Main {
    public static void main(String[] args){
        Item book = new Item("Harry Potter", 4);
        Item phone = new Item("Nokia", 1);
        Item brick = new Item("Brick", 20);

        Suitcase suitcase = new Suitcase( 22);
        suitcase.addItem(brick);
        suitcase.addItem(phone);
        suitcase.addItem(book);

        System.out.println(suitcase);

        suitcase.printItems();
    }
}
