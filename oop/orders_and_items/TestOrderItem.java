import java.util.ArrayList;

public class TestOrderItem {
    public static void main(String[] args) {
    
        // Menu items
        Item first_item = new Item();
        first_item.name = "Dive Mask";
        first_item.price = 40.00;

        Item second_item = new Item();
        second_item.name = "snorkel fins";
        second_item.price = 90.00;

        Item third_item = new Item();
        third_item.name = "dive belt";
        third_item.price = 20.00;

        Item fourth_item = new Item();
        fourth_item.name = "Wetsuit";
        fourth_item.price = 150.00;

        // Order variables -- order1, order2 etc.
        Order first_order = new Order();
        
        first_order.name = "Garrett's order";

        Order second_order = new Order();
        second_order.name = "Michael's Order";

        Order third_order = new Order();
        third_order.name = "Stuart's Order";

        Order fourth_order = new Order();
        fourth_order.name = "Charisma's Order";


        // Application Simulations

        first_order.item_list.add(second_item);
        first_order.total += second_item.price;
        first_order.ready = true;
        System.out.println(first_order.total);

        second_order.item_list.add(third_item);
        second_order.total += third_item.price;
        System.out.println(second_order.total);

        third_order.item_list.add(fourth_item);
        third_order.total += fourth_item.price;
        System.out.println(third_order.total);

        fourth_order.item_list.add(first_item);
        fourth_order.total += first_item.price;
        System.out.println(fourth_order.total);


    
        System.out.printf("Ready: %s\n", first_order.ready);
    }
}