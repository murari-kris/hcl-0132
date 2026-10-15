
package Assessment2Revision;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String args[]) {

        List<LibraryItem> list = new ArrayList<>();

        Book book = new Book("RadheKrishna", 2024, "Krishna", 1);
        Magzine magzine = new Magzine("Kaira", 2026, 2);
        DVD dvd = new DVD("dvdplayer", 2022, 3);


        Book book2 = new Book("Java", 2025, "James", 4);

        list.add(book);
        list.add(magzine);
        list.add(dvd);
        list.add(book2);

        StringBuilder str = new StringBuilder();


        for (LibraryItem item : list) {

            str.append(item.toString());
            str.append("\nLate fee for 5 days Rs. ");
            str.append(item.lateFree(5));
            str.append("\n\n");
        }

        System.out.println(str);

        Member member = new Member(
                2, "ram", "ram@1234gmail.com"
        );


        member.borrowItem(book);
        member.borrowItem(dvd);

        System.out.println("AFTER BORROWING ITEMS");
        System.out.println(member);


        member.returnItem(book);

        System.out.println("AFTER RETURNING BOOK");
        System.out.println(member);




        try {

            member.borrowItem(dvd);

        } catch (ItemNotAvailableException e) {

            System.out.println(
                    "Item already borrowed: " + e.getMessage()
            );
        }






        try {

            int ItemId=999;
            LibraryItem foundItem = null;
            for(LibraryItem item:list){
                if(item.getId()==ItemId){
                     foundItem = item;
                }
            }
            if(foundItem == null){
                throw new ItemNotFoundException("Item does not exists");
            }



            member.borrowItem(foundItem);

        } catch (ItemNotFoundException e) {

            System.out.println(
                    "Item does not exist: " + e.getMessage()
            );
        }




        try {

            member.borrowItem(book);
            member.borrowItem(magzine);


            member.borrowItem(book2);

        } catch (BorrowLimitExceededException e) {

            System.out.println(
                    "Borrow limit exceeded: " + e.getMessage()
            );

        } finally {

            System.out.println("Operation completed");
        }

        System.out.println("\nFINAL MEMBER DETAILS");
        System.out.println(member);
    }
}
