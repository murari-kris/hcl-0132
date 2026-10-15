package Assessment2Revision;

import java.util.ArrayList;
import java.util.List;

public class Member {
    private int id;
    private String name;
    private String email;

    List<LibraryItem> borrowedItem;
    public Member(int id, String name,String email){
        if(!email.contains("@")){
            throw new IllegalArgumentException("It must contains @");
        }


        this.id=id;
        this.name=name;
        this.email=email;
        this.borrowedItem=new ArrayList<>();
    }

    public Member(int id, String name){
        this(id,name,"check@gmail.com");
    }

    public void borrowItem(LibraryItem item){

        if(borrowedItem.size()>=3){
            throw new BorrowLimitExceededException("A member cannot borrow more than three items");
        }
        item.borrow();
        borrowedItem.add(item);
    }

    public void returnItem(LibraryItem item){

        if(!borrowedItem.contains(item)){

            throw new ItemNotFoundException("item does not exist");
        }

        borrowedItem.remove(item);
    }

    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", borrowedItem=" + borrowedItem +
                '}';
    }
}
