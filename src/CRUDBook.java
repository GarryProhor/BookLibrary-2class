import java.util.*;


public class CRUDBook {
    public static void main(String[] args) {

        List<Book> books = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        int ch;
        do{
            System.out.println("1.Insert");
            System.out.println("2.Display");
            System.out.println("3.Search");
            System.out.println("4.Delete");
            System.out.println("5.Update");
            System.out.println("Enter your choise : ");

            ch = s.nextInt();

            switch (ch){
                case 1:
                    System.out.print("Enter bookID : ");
                    int id = s.nextInt();
                    System.out.print("Enter title : ");
                    String title = s1.nextLine();
                    System.out.print("Enter author : ");
                    String author = s1.nextLine();

                    books.add(new Book(id, title, author));
                break;
                case 2:
                    System.out.println("_________________");
                    Iterator<Book> i = books.iterator();
                    while (i.hasNext()){
                        Book book = i.next();
                        System.out.println(book);
                    }
                    System.out.println("_________________");
                break;
                case 3:
                    boolean found = false;
                    System.out.print("Enter bookID to Search: ");
                    id = s.nextInt();
                    System.out.println("_________________");
                    i = books.iterator();
                    while (i.hasNext()){
                        Book book = i.next();
                        if(book.getBookId()==id){
                            System.out.println("BookID: " + book);
                            found = true;
                        }

                    }

                    if(!found){
                        System.out.println("Record not found");
                    }
                    System.out.println("_________________");
                break;
                case 4:
                    found = false;
                    System.out.print("Enter bookID to Delete: ");
                    id = s.nextInt();
                    System.out.println("_________________");
                    i = books.iterator();
                    while (i.hasNext()){
                        Book book = i.next();
                        if(book.getBookId()==id){
                            i.remove();
                            found = true;
                        }

                    }

                    if(!found){
                        System.out.println("Record not found");
                    }else {
                        System.out.println("Record is deleted successfully");
                    }
                    System.out.println("_________________");
                break;
                case 5:
                    found = false;
                    System.out.print("Enter bookID to Update: ");
                    id = s.nextInt();

                    ListIterator<Book> bookListIterator = books.listIterator();
                    while (bookListIterator.hasNext()){
                        Book book = bookListIterator.next();
                        if(book.getBookId()==id){
                            System.out.print("Enter new title: ");
                            title = s1.nextLine();
                            System.out.print("Enter new author: ");
                            author = s1.nextLine();
                          bookListIterator.set(new Book(id, title, author));
                            found = true;
                        }

                    }

                    if(!found){
                        System.out.println("Record not found");
                    }else {
                        System.out.println("Record is update successfully");
                    }

                break;
            }
        }while (ch!=0);
    }
}
