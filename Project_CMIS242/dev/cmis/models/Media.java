package dev.umgc.models;

//public class Media {
//}
/* @author Osey Ojemen
 * Date: 4/10/2023
 *
 * Project; Media Rental System
 *
 * A Program designed and implemented to demonstrate media hierarchy
 *
 */

public abstract class Media {

    //attributes
    private int id;
    private String title;
    private int year;
    private boolean available;

    public Media(int id, String title, int year, boolean available) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.available = true;
    }

    //Get methods
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public boolean isAvailable() {
        return available;
    }

    //Set methods
    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    // calculate rental fee
    public double calculateRentalFee() {
        return 3.50;
    }


    public String toString() {
        return "Media{id =" + id + ", title = " + title + ", year = " +
                year + ", availability =" + available + "}";
    }
}

	/*
	 *
	 *
	 * class Media {
        int id;
        String title;
        int year, chapter;
        boolean available;
        Media() {
        }
        public Media(int id, String title, int year, int chapter, boolean available) {
                this.id = id;
                this.title = title;
                this.year = year;
                this.chapter = chapter;
                this.available = available;
        }
        public int getId() {
                return id;
        }
        public void setId(int id) {
                this.id = id;
        }
        public String getTitle() {
                return title;
        }
        public void setTitle(String title) {
                this.title = title;
        }
        public int getYear() {
                return year;
        }
        public void setYear(int year) {
                this.year = year;
        }
        public int getChapter() {
                return chapter;
        }
        public void setChapter(int chapter) {
                this.chapter = chapter;
        }
        public boolean isAvailable() {
                return available;
        }
        public void setAvailable(boolean available) {
                this.available = available;
        }


	 *
	 *
	 *
	 *
	 *
	 * ***/
