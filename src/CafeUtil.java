import java.util.ArrayList;

public class CafeUtil {

    public int getStreakGoal(){
        int sum = 0;
        for (int i = 0; i <= 10; i++){
            sum+=i;
        }
        return sum;
    }

    public int getStreakGoals (int numWeeks){
        return (0);
    }

    public double getOrderTotal(double[] prices){
        double sum = 0.0;
        for (int i = 0; i < prices.length; i++){
            sum+=prices[i];
        }
        return sum;
    }

    public void displayMenu(ArrayList<String>menuItems){
        for (int i = 0; i < menuItems.size(); i++){
            String items = menuItems.get(i);
            System.out.printf("%s %s \n", i, items);
        }
    }

    void addCustomer(ArrayList<String> customers){
        System.out.println("Please enter your name");
        String username = System.console().readLine();
        System.out.printf("Hello %s \n", username);
        System.out.printf("There are %s people in front of you", customers.size());
        customers.add(username);

    }
}
