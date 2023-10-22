import java.util.ArrayList;

public class MainArrayList {
    public static void main(String[] args) {
        //ArrayList<String> food = new ArrayList<String>();
        //food.add("pizza");
        //food.add("porrige");
        //food.add("apple");
        //food.set(0, "sushi");
        //food.remove(1);
        //food.clear();
        //for(int i = 0; i < food.size(); i++){
        //System.out.println(food.get(i));

        ArrayList<ArrayList<String>> groceryList = new ArrayList();
        ArrayList<String> bakeryList = new ArrayList();
        bakeryList.add("bread");
        bakeryList.add("donuts");
        bakeryList.add("cake");

        ArrayList<String> produceList = new ArrayList();
        produceList.add("cucumber");
        produceList.add("carrot");
        produceList.add("potatoes");

        ArrayList<String> drinksList = new ArrayList();
        drinksList.add("orange juice");
        drinksList.add("coca-cola");
        drinksList.add("beer");

        groceryList.add(bakeryList);
        groceryList.add(produceList);
        groceryList.add(drinksList);

        //System.out.println(groceryList);
        //System.out.println(groceryList.get(1).get(1));

                }
            }



