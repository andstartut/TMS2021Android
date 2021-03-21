package menu;

import exceptions.ConsoleException;
import exceptions.SearchProductException;
import inputs.Console;
import products.Product;
import store.Store;

import java.util.InputMismatchException;

public class EditProductSubmenu extends Menu {
    protected EditProductSubmenu(Store store) {
        super(store);
    }

    protected void getSubmenu() {
        System.out.println("Example: (id:5 name:VW Polo type:sedan price:15000)");
        System.out.println("Input id:");
        try {
            int id = Console.getInt();
            System.out.println("Input name:");
            String name = Console.getString();
            MenuProductType.outputTypesToList();
            System.out.println("Chose type:");
            int type = Console.getInt();
            System.out.println("Input price:");
            int price = Console.getInt();
            store.editProduct(new Product(id, name, MenuProductType.giveOutTypeByNumber(type), price));
            System.out.println("The product edited successfully");
        } catch (SearchProductException | ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        } catch (InputMismatchException e) {
            System.out.println("You input wrong value");
            Console.getString();
        } catch (ConsoleException e) {
            System.out.println(e);
        }
    }
}
