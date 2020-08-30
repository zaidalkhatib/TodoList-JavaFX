package ZaidsTodoList.dataModel;

import java.time.LocalDate;

public class TodoItem {
    private String shorDescription;
    private String Details;
    private LocalDate date;

    public TodoItem(String shorDescription, String details, LocalDate date) {
        this.shorDescription = shorDescription;
        Details = details;
        this.date = date;
    }

    public String getShorDescription() {
        return shorDescription;
    }

    public void setShorDescription(String shorDescription) {
        this.shorDescription = shorDescription;
    }

    public String getDetails() {
        return Details;
    }

    public void setDetails(String details) {
        Details = details;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return shorDescription;
    }

}
