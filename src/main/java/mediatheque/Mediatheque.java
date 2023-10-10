package mediatheque;

import java.util.LinkedList;
import java.util.List;


public class Mediatheque {
	private final List<Item> items = new LinkedList<>();

	public void addItem(Item i) {
		items.add(i);
	}
	
	public void printCatalog() {
		CatalogVisitors myVisitor = new CatalogVisitors();
		for (Item i : items)
			i.accept(myVisitor);
	}
	
	public void printOnlyBooks() {
		BookVisitors myVisitor = new BookVisitors();
		for (Item i : items)
			i.accept(myVisitor);
		/*
		//avec instanceof
		for (Item i : items)
			if (i instanceof Book)
				System.out.println(i);
		*/
	}

	public void printOnlyCDs() {
		CDVisitors myVisitor = new CDVisitors();
		for (Item i : items)
			i.accept(myVisitor);
	}
}
