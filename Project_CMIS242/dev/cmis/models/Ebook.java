package dev.umgc.models;

//public class Ebook {
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
public class Ebook extends Media {

    //local attributes
    private int numChapters;
    //constructor
    public Ebook(int id, String title, int year, int chapters, boolean available) {
        super(id, title, year, available);
        numChapters = chapters;
    }

    //get method
    public int getNumChapters() {
        return numChapters;
    }

    //set method
    public void setNumChapters(int numChapters) {
        this.numChapters = numChapters;
    }

    @Override
    public double calculateRentalFee() {
        double fee = numChapters * 0.10;
        int currYear = Calendar.getInstance().get(Calendar.YEAR);
        if(this.getYear() == currYear)
            fee += 1; //add 1.00 fee
        return fee;
    }

    public String toString() {
        return "EBook [id= " + getId() + ", title= " + getTitle() + ", year= " + getYear() + ", chapters= " + numChapters + ", available = " + isAvailable() + "]";
    }
// @Override
//  public String serialized() {

//	return "EBook;" + getId() + ";" + getTitle() + ";" + getYear() + ";" + numChapters + ";" + isAvailable();
 }
