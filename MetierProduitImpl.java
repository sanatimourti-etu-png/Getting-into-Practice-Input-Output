import java.io.*;
import java.util.*;

public class MetierProduitImpl implements IProduitMetier {

    private List<Product> products = new ArrayList<>();
    private String fileName = "products.dat";

    public MetierProduitImpl() {
        products = getAll();
    }

    @Override
    public void add(Product p) {
        products.add(p);
    }

    @Override
    public List<Product> getAll() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            return (List<Product>) ois.readObject();
        } catch (Exception e) {
            return new ArrayList<>();
        }
    }

    @Override
    public Product findById(long id) {
        for (Product p : products) {
            if (p.getId() == id)
                return p;
        }
        return null;
    }

    @Override
    public void delete(long id) {
        products.removeIf(p -> p.getId() == id);
    }

    @Override
    public void saveAll() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(products);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}