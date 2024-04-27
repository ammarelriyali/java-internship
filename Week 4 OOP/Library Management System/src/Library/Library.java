package Library;

import java.util.*;


public class Library {
    private List<LibraryResource> bookList = new ArrayList();
    private List<LibraryResource> dvdList = new ArrayList();
    private ArrayList<LibraryResource> magazineList = new ArrayList();
    public void add(Book book) {
        bookList.add(book);
    }
    public void add(Magazine magazine) {
        magazineList.add(magazine);
    }

    public void add(DVD dvd) {
        dvdList.add(dvd);
    }

    public int update(Book book, int index) {
        return updateItemInList(bookList, book, index);
    }

    public int update(Magazine magazine, int index) {
        return updateItemInList(magazineList, magazine, index);
    }

    public int update(DVD dvd, int index) {
        return updateItemInList(dvdList, dvd, index);
    }

    private int updateItemInList(List<LibraryResource> list, LibraryResource resource, int index) {
        if (index >= 0 && index < list.size()) {
            list.remove(index);
            list.add(index, resource);
            return 1;
        } else {
            return 0;
        }
    }

    public int deleteBook(int index) {
        return deleteFormList(bookList, index);
    }

    public int deleteMagazine(int index) {
        return deleteFormList(magazineList, index);
    }

    public int deleteDVD(int index) {
        return deleteFormList(dvdList, index);
    }

    private int deleteFormList(List list, int index) {
        if (index >= 0 && index < list.size()) {
            list.remove(index);
            return 1;
        } else {
            return 0;
        }
    }



    public boolean checkAvailability(Book book) {
        return bookList.contains(book);
    }

    public boolean checkAvailability(Magazine magazine) {
        return magazineList.contains(magazine);
    }

    public boolean checkAvailability(DVD dvd) {
        return dvdList.contains(dvd);
    }

    public String getBook(int index) {
        return getData(bookList, index);
    }

    public String getMagazine(int index) {
        return getData(magazineList, index);
    }

    public String getDVD(int index) {
       return  getData(dvdList, index);
    }
    private String getData(List<LibraryResource> list, int index) {
        if (index >= 0 && index < list.size()) {
            LibraryResource resource = list.get(index);
            return resource.displayInformation();
        }
        else {
            return  "not available";
        }
    }
}