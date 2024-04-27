import Library.*;

public class Main {
    public static void main(String[] args) {
        Library misrLibrary = new Library();
        DVD nashedDvd = new DVD("nashed", "samy zen", "2020");
        Book qranBook = new Book("qran", "alah", "13");
        Magazine eltwhadMagazine = new Magazine("eltwhad", "ansar elsna", "2000");

        Magazine dummyMagazine = new Magazine("eltwhad", "ansar elsna", "2000");
        DVD updeateNashedDvd = new DVD("updeateNashedDvd", "samy zen", "2020");

        misrLibrary.add(nashedDvd);
        misrLibrary.add(qranBook);
        misrLibrary.add(eltwhadMagazine);

        System.out.println(misrLibrary.checkAvailability(eltwhadMagazine));
        System.out.println(misrLibrary.checkAvailability(qranBook));
        System.out.println(misrLibrary.checkAvailability(nashedDvd));
        System.out.println(misrLibrary.checkAvailability(dummyMagazine));

        misrLibrary.update(updeateNashedDvd,0);
        System.out.println(misrLibrary.getDVD(0));

        misrLibrary.deleteMagazine(0);
        System.out.println(misrLibrary.getMagazine(0));

    }
}