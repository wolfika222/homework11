package classes;

import java.util.List;

/**
 * Created by Hp_Workplace on 2017. 05. 27..
 */
public class Data {

    private int startIndex;
    private List<Items> items;
    private String updated;
    private int totalItems;
    private int itemsPerPage;


    public List<Items> getItems() {
        return items;
    }

    public void setItems(List<Items> items) {
        this.items = items;
    }

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public int getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    public int getTotalItems() {
        return totalItems;
    }

    public void setTotalItems(int totalItems) {
        this.totalItems = totalItems;
    }

    public int getItemsPerPage() {
        return itemsPerPage;
    }

    public void setItemsPerPage(int itemsPerPage) {
        this.itemsPerPage = itemsPerPage;
    }

    @Override
    public String toString() {
        return "Data{" +
                "startIndex=" + startIndex +
                ", items=" + items +
                ", updated='" + updated + '\'' +
                ", totalItems=" + totalItems +
                ", itemsPerPage=" + itemsPerPage +
                '}';
    }
}
