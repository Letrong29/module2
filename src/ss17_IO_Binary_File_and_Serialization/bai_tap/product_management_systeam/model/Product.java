package ss17_IO_Binary_File_and_Serialization.bai_tap.product_management_systeam.model;

import java.io.Serializable;

public class Product implements Serializable {
    private int id;
    private String name;
    private String producer;
    private int price;
    private String note;

    public Product(int id, String name, String producer, int price, String note) {
        this.id = id;
        this.name = name;
        this.producer = producer;
        this.price = price;
        this.note = note;
    }

    public Product() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", producer='" + producer + '\'' +
                ", price=" + price +
                ", note='" + note + '\'' +
                '}';
    }
}
