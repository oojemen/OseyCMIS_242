package dev.umgc.models;

//public class MusicCD {
//}

/* @author Osey Ojemen
 * Date: 4/10/2023
 *
 * Project; Media Rental System
 *
 * A Program designed and implemented to demonstrate media hierarchy
 *
 */


import java.util.Calendar;
public class MusicCD extends Media {
    //local attributes
    private int length;
    // constructor
    public MusicCD(int id, String title, int year, int length, boolean available) {
        super(id, title, year, available);
        this.length = length;
    }
    // get method
    public int getLength() {
        return length;
    }

    // set method
    public void setLength(int length) {
        this.length = length;
    }
    // override parent's
    @Override
    public double calculateRentalFee() {
        double fee = length * 0.02;
        int currYear = Calendar.getInstance().get(Calendar.YEAR);

        if (this.getYear() == currYear)
            fee += 1;

        return fee;
    }
    @Override
    public String toString() {
        return "MusicCD [id = " + getId() + ", title = " + getTitle() + ", year = " + getYear() + ", length = " + length + "min]" + isAvailable();
    }
    //   @Override
    //    public String serialized() {

    //    	return "MusicCD ; " + getId() + ";" + getTitle() + ";" + getYear() + ";" + length + ";" + isAvailable();
    //     }
}
