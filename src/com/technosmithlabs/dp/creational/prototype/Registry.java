package com.technosmithlabs.dp.creational.prototype;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Registry {

    private static Map<String, Item> registry = null;

    private Registry() {
    }

    private static void loadItems() {
        if (Objects.isNull(registry)) {
            registry = new HashMap<>();
            Movie movie = new Movie();
            movie.setName("Sholay");
            movie.setRuntime(100);
            movie.setCountryOfOrigin("India");
            movie.setPrice(120);
            movie.setStoreName("Mumbai Movie Store");
            registry.put("movie", movie);
            Book book = new Book();
            book.setIsbn("ISBN1234567890");
            book.setTitle("The White Tiger");
            book.setCountryOfOrigin("India");
            book.setPrice(111);
            book.setStoreName("Calcutta Book House");
            registry.put("book", book);
        }
    }

    public static Item createItem(String type) {
        if (Objects.isNull(registry)) {
            loadItems();
        }
        try {
            // new objects are getting created using clone, which will have unique
            // hashcodes. This object creation is taking place without making use of
            // the 'new' keyword.
            Item item = (Item) registry.get(type).clone();
            return item;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}
