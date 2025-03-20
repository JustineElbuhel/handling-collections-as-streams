package Weighting;

import java.util.ArrayList;

public class Suitcase {

    private ArrayList<Item> containedItems;
    private int maxWeight;

    public Suitcase(int maxWeight){
        this.containedItems = new ArrayList<>();
        this.maxWeight = maxWeight;
    }

    public void addItem(Item item){
        if(item.getWeight() + totalWeight() <= maxWeight){
            containedItems.add(item);
        }
    }

    public int totalWeight(){
        int totalWeight = containedItems.stream()
                .map(item -> item.getWeight())
                .reduce(0,(previousSum, itemWeight) -> previousSum + itemWeight);

        return totalWeight;
    }

    public Item heaviest(){
        if(containedItems.isEmpty()){
            return null;
        }

        Item heaviest = containedItems.stream()
                //Compares item1 to item2.
                //If 1: item1 is heavier
                //If -1: item2 is heavier
                //If 0: item1 & item2 weigh the same
                .max((item1, item2) -> item1.getWeight() - item2.getWeight())
                .get();

        return heaviest;
    }

    public void printItems(){
        containedItems.stream()
                .forEach(item -> System.out.println(item));
    }

    public String toString(){
        if(containedItems.size() == 0){
            return "No items(0 kg)";
        } else if(containedItems.size() == 1){
            return "1 item(" + totalWeight() + " kg)";
        } else {
            return String.format("%d items(%d kg)", containedItems.size(), totalWeight());
        }
    }
}
