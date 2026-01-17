import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        MetierProduitImpl metier = new MetierProduitImpl();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1. Display products");
            System.out.println("2. Search product by ID");
            System.out.println("3. Add product");
            System.out.println("4. Delete product");
            System.out.println("5. Save products");
            System.out.println("6. Exit");
            System.out.print("Choice: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    metier.getAll().forEach(System.out::println);
                    break;

                case 2:
                    System.out.print("ID: ");
                    long searchId = Long.parseLong(sc.nextLine());
                    System.out.println(metier.findById(searchId));
                    break;

                case 3:
                    System.out.print("ID Name Brand Price Desc Stock: ");
                    String[] data = sc.nextLine().split(" ");

                    long id = Long.parseLong(data[0]);
                    String name = data[1];
                    String brand = data[2];
                    double price = Double.parseDouble(data[3]);
                    String desc = data[4];
                    int stock = Integer.parseInt(data[5]);

                    metier.add(new Product(id, name, brand, price, desc, stock));
                    break;

                case 4:
                    System.out.print("ID: ");
                    long deleteId = Long.parseLong(sc.nextLine());
                    metier.delete(deleteId);
                    break;

                case 5:
                    metier.saveAll();
                    System.out.println("Saved!");
                    break;
            }
        } while (choice != 6);
    }
}
