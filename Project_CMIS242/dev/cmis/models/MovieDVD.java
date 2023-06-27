package dev.umgc.models;

//public class MovieDVD {
//}
/* @author Osey Ojemen
 * Date: 4/10/2023
 *
 * Project; Media Rental System
 *
 * A Program designed and implemented to demonstrate media hierarchy
 *
 */
public class MovieDVD extends Media {

    //local attributes
    private double size; // value in MB
    //constructor
    public MovieDVD(int id, String title, int year, double size, boolean available) {
        super(id, title, year, available);
        this.size = size;
    }
    // get method
    public double getSize() {
        return size;
    }
    // set method
    public void setSize(double size) {
        this.size = size;
    }
    // inherits rental fee
    @Override
    public String toString() {
        return "MovieDVD[ id=" + getId() + ", title=" + getTitle() + ", year=" + getYear() + ", size=" + size + "MB]";
    }
//   public String serialized() {
//       return "MovieDVD;" + getId() + ";" + getTitle() + ";" + getYear()
//        + ";" + size + ";" + isAvailable();
}
