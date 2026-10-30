package lms;

import lms.model.Book;
import lms.model.DVD;
import lms.model.Student;
import lms.model.Staff;
import lms.service.Library;

public class Main {

    public static void main(String[] args) {

        Library library = new Library();

        Book book1 = new Book(
                "B001",
                "Clean Code",
                "Robert C. Martin"
        );

        Book book2 = new Book(
                "B002",
                "Effective Java",
                "Joshua Bloch"
        );

        DVD dvd = new DVD(
                "D001",
                "Introduction to Algorithms",
                120
        );

        library.addItem(book1);
        library.addItem(book2);
        library.addItem(dvd);

        Student student = new Student(
                "M001",
                "Your Name"
        );

        Staff staff = new Staff(
                "M002",
                "Mr. Kasun Silva"
        );

        library.addMember(student);
        library.addMember(staff);

        library.listItems();

        System.out.println();

        library.listMembers();

        System.out.println();

        library.printAllLateFees(3);

        System.out.println();

        try {
            new Book("B003", "", "Nobody");
        } catch (IllegalArgumentException e) {
            System.out.println("Rejected invalid book: " + e.getMessage());
        }
    }
}
