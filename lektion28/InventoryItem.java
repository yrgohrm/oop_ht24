import java.util.*;

public class InventoryItem  implements Comparable<InventoryItem> {
    private static final Comparator<InventoryItem> articleNumberComparator = Comparator.comparing(InventoryItem::getArticleNumber);

    private String name;
    private int articleNumber;
    private int balance;
    private double price;
    
    public InventoryItem(String name, int articleNumber, int balance, double price) {
        this.name = name;
        this.articleNumber = articleNumber;
        this.balance = balance;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getArticleNumber() {
        return articleNumber;
    }

    public int getBalance() {
        return balance;
    }

    public double getPrice() {
        return price;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + articleNumber;
        result = prime * result + balance;
        long temp;
        temp = Double.doubleToLongBits(price);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        InventoryItem other = (InventoryItem) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (articleNumber != other.articleNumber)
            return false;
        if (balance != other.balance)
            return false;
        if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "InventoryItem [name=" + name + ", articleNumber=" + articleNumber + ", balance=" + balance + ", price="
                + price + "]";
    }

    @Override
    public int compareTo(InventoryItem o) {
        return articleNumberComparator.compare(this, o);
    }    
}