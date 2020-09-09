package main.java.Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Albums {
    Scanner takeInput = new Scanner(System.in);
    ArrayList<Songs> album = new ArrayList<Songs>();

    public void addSongs() {
        boolean add = true;
        while (add) {
            if (album.size() == 0) {
                add();
            } else {
                System.out.print(" Enter 1 to add songs : \n"
                        + "Enter 0 to exit : ");
                int input = takeInput.nextInt();
                takeInput.nextLine();
                switch (input) {
                    case 0:
                        System.out.println("your songs were added");
                        add = false;
                        action();
                        break;
                    case 1:
                        add();
                        break;
                }
            }
        }

    }

    public void add() {

        System.out.print("Enter the song name : ");
        String name = takeInput.nextLine();
        System.out.print("Enter its duration : ");
        int time = takeInput.nextInt();
        album.add(new Songs(name, time));
        System.out.println("Successfully added");


    }

    public void removeSongs() {
        printSongs(album);
        System.out.print("Enter the song number to delete it from album : \t ");
        int songNumber = takeInput.nextInt();
        System.out.println("Song number " + "*" + album.get(songNumber - 1).getSongName() + "*" + " has been removed successfully. ");
        album.remove(songNumber - 1);
        action();
    }

    public void printSongs(ArrayList<Songs> songslist) {
        System.out.println("List of the songs :");
        for (int i = 0; i < songslist.size(); i++) {
            System.out.println((i + 1) + ". " + songslist.get(i).getSongName());
        }
    }

    public void action() {
        System.out.println("Enter 0 to Exit ! \n" + "Enter 1 to add songs \n" +
                "Enter 2 to delete a song"
        );
        int input = takeInput.nextInt();
        takeInput.nextLine();
        switch (input) {
            case 0:
                System.out.println("Your changes has been made");
                break;
            case 1:
                addSongs();
                break;
        }
    }
}
