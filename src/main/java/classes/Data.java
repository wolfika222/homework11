package classes;

import java.util.List;

/**
 * Created by Hp_Workplace on 2017. 05. 27..
 */
public class Data {

    private String startIndex;
    private List<Items> items;
    private String updated;
    private String totalItems;
    private String itemsPerPage;

    public String getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(String startIndex) {
        this.startIndex = startIndex;
    }

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

    public String getTotalItems() {
        return totalItems;
    }

    public void setTotalItems(String totalItems) {
        this.totalItems = totalItems;
    }

    public String getItemsPerPage() {
        return itemsPerPage;
    }

    public void setItemsPerPage(String itemsPerPage) {
        this.itemsPerPage = itemsPerPage;
    }

    @Override
    public String toString() {
        return "Data{" +
                "startIndex='" + startIndex + '\'' +
                ", items=" + items +
                ", updated='" + updated + '\'' +
                ", totalItems='" + totalItems + '\'' +
                ", itemsPerPage='" + itemsPerPage + '\'' +
                '}';
    }
}
