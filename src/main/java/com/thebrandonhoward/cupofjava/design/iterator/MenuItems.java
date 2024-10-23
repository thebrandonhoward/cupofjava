package com.thebrandonhoward.cupofjava.design.iterator;

import java.util.Iterator;
import java.util.List;

public class MenuItems implements Iterator<String> {
    private final List<String> items;
    private int index = 0;

    public MenuItems() {
        this.items = List.of("Fried Chicken", "CollardGreens", "Cornbread");
    }

    /**
     * Returns {@code true} if the iteration has more elements.
     * (In other words, returns {@code true} if {@link #next} would
     * return an element rather than throwing an exception.)
     *
     * @return {@code true} if the iteration has more elements
     */
    @Override
    public boolean hasNext() {
        return !items.isEmpty() && index < items.size();
    }

    /**
     * Returns the next element in the iteration.
     *
     * @return the next element in the iteration
     */
     //@throws NoSuchElementException if the iteration has no more elements
    @Override
    public String next() {
        if(hasNext()) {
            index++;
            return items.get(index - 1);
        }

        return null;
    }
}
