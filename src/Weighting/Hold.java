package Weighting;

import java.util.ArrayList;

public class Hold {

    private ArrayList<Suitcase> containedSuitcases;
    private int maxWeight;

    public Hold(int maxWeight){
        this.containedSuitcases = new ArrayList<>();
        this.maxWeight = maxWeight;
    }

    public void addSuitcase(Suitcase suitcase){
        if(suitcase.totalWeight() + totalWeight() <= maxWeight){
            containedSuitcases.add(suitcase);
        }
    }

    public int totalWeight(){
        int totalWeight = containedSuitcases.stream()
                .map(suitcase -> suitcase.totalWeight())
                .reduce(0, (prev, suitcaseWeight) -> prev + suitcaseWeight);
        return totalWeight;
    }

    public void printItem(){
        containedSuitcases.stream()
                .forEach(suitcase -> System.out.println(suitcase));
    }

    public String toString(){
        if(containedSuitcases.size() == 0){
            return "No suitcases(0 kg)";
        } else if(containedSuitcases.size() == 1){
            return "1 suitcase(" + totalWeight() + " kg)";
        } else {
            return String.format("%d suitcases(%d kg)", containedSuitcases.size(), totalWeight());
        }
    }
}
