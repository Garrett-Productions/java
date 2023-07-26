import java.util.ArrayList;
import java.util.Arrays;

class CafeUtil {
    public int addSum(){
        int sum = 0;
        for (int i = 0; i <= 10; i++){
            sum = sum + i;
        }
        return sum;
    }
// #1
    public int getStreakGoal() {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum = sum + i;
        }
        return sum;
    }


// #2
    public double getOrderTotal(double[] orderPrices){
        double totalPrice = 0;
        for (int i = 0; i < orderPrices.length; i++){
            totalPrice = totalPrice + orderPrices[i];
        }
        return totalPrice;
    }


// #3
    public void displayMenu(ArrayList<String> menuItems) {
        // String name = myArray.get(0); 

        for (int i = 0; i < menuItems.size(); i++) {
            System.out.printf("%s %s", i, menuItems.get(i));
        }
    }

// #4
    public void addCustomer(ArrayList<String> customers){
        // my array became customers 
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        System.out.println("User name here, hello: " + userName);
        System.out.printf("There are %s people in front of you", customers.size());
        customers.add(userName);
    }
}
