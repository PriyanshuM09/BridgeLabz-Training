package com.linkedlist.inventorymanagementsystem;

public class InventorManagementSystem {
    public static void main(String[] args) {

    	ItemLinkedList inventory = new ItemLinkedList();


        inventory.addAtEnd(101, "Laptop", 5, 50000);
        inventory.addAtEnd(102, "Mouse", 20, 500);
        inventory.addAtStart(103, "Keyboard", 10, 1500);
        inventory.addAtPos(2, 104, "Monitor", 7, 12000);

        inventory.displayInventory();

        inventory.searchByItemId(102);

        inventory.updateQuantity(101, 8);

        inventory.calculateTotalValue();

       
        inventory.sortByName(true);
        inventory.displayInventory();
        inventory.sortByPrice(false);
        inventory.displayInventory();
    }
}
	


