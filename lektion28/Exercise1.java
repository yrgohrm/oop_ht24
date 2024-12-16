import java.util.*;

public class Exercise1 {
    public static void main(String[] args) {
        InventoryItem item1 = new InventoryItem("Chokladkaka", 123, 100, 32.50);
        InventoryItem item2 = new InventoryItem("Paprika", 1111, 200, 64.50);
        InventoryItem item3 = new InventoryItem("Saffran 0.5g", 4545, 10, 40);
        InventoryItem item4 = new InventoryItem("Papper", 1, 1000, 12.50);

        var list = new ArrayList<InventoryItem>();
        list.add(item1);
        list.add(item2);
        list.add(item3);
        list.add(item4);

        Collections.sort(list);

        print(list);

        Comparator<InventoryItem> comp = Comparator.comparing(InventoryItem::getPrice);

        Collections.sort(list, comp);

        print(list);

        item1.setPrice(12345.0);

        Collections.sort(list, comp);

        print(list);
    }

    private static void print(ArrayList<InventoryItem> list) {
        for (InventoryItem inventoryItem : list) {
            System.out.printf("%s %d %.2f%n", inventoryItem.getName(), inventoryItem.getArticleNumber(),
                    inventoryItem.getPrice());
        }
        System.out.println();
    }
}
