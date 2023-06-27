package dev.umgc.models;

/*

  @author Osey Ojemen
  Date: 4/10/2023

  Project; Media Rental System

  A Program designed and implemented to demonstrate media hierarchy

 */

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//import java.util.stream.Collectors;

public class Manager {
    private List<Media> list=new ArrayList<>();

    public Manager() {
        list=new ArrayList<Media>();

    }
                                                                                   
    // myObj to fileName and myReader to directory
    public String loadMedia(String path) throws FileNotFoundException {
        File myObj= new File(path);
        Scanner myReader = new Scanner(path);
        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            String[] str = data.split(" ");
            if (str[0].equals("EBook")) {
                list.add(new Ebook(Integer.parseInt(str[1]), str[2], Integer.parseInt(str[3]),
                        Integer.parseInt(str[4]), Boolean.parseBoolean(str[5])));
            }else if(str[0].equals("MusicCD")) {
                list.add(new MusicCD(Integer.parseInt(str[1]), str[2], Integer.parseInt(str[3]),
                        Integer.parseInt(str[4]), Boolean.parseBoolean(str[5])));
            }else {
                list.add(new MovieDVD(Integer.parseInt(str[1]), str[2], Integer.parseInt(str[3]),
                        Integer.parseInt(str[4]), Boolean.parseBoolean(str[5])));
            }
        }
        System.out.println(list);
        myReader.close();
        return list.toString() ;
    }

    public void findMedia(String title) {
        for(Media manager : list) {
            if(manager.getTitle().equals(title))
                System.out.print(manager.toString());

        }
    }

    public void rentMedia(int id) {
        for(Media manager : list ) {
            if(manager.getId()==id) {
                if(manager.isAvailable())
                    System.out.println("media successfully rented out ");
                else
                    System.out.println("Media with id = "+id+" is not available for rent ");
            }
        }
    }
    public void addMedia(Media media) {
        list.add(media);
    }

    public void createMediaFiles(String path) throws IOException {

        PrintWriter out =null;

        //for all media objects create files using media title and id value as fileName
        for (int i=0; i< list.size(); i++) {
            String fileName= path + "/" + list.get(i).getClass().getSimpleName()+ "-" + list.get(i).getId() + ".txt";
            out= new PrintWriter(new FileWriter (fileName));
            out.println(list.get(i).toString());
            out.flush();         // Flush all the data to the file
            out.close();        //close the stream


        }
    }

    public void displayAllMedia() {

        for (int i=0; i<list.size(); i++) {

            System.out.println (list.get(i).toString());
        }


    }


}

