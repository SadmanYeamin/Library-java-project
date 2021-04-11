import java.util.*;
import java.io.*;
import java.nio.*;


interface IBasicOperations{

    public void borrow(Patron p,Book b);
    public void returnBook(Patron p,Book b);
    public void fine(Patron p,double amount);
}