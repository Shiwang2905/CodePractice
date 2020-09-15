package main.java.Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;
public class Playlist {
    private String playlistName;
    Scanner input= new Scanner(System.in);
    LinkedList<Songs> playlist= new LinkedList<Songs>();
    ArrayList<Songs> a= new ArrayList<Songs>();

    public String getPlaylistName() {
        return playlistName;
    }

    public Playlist(String Pname){
        this.playlistName=Pname;
    }
    public void addSongtoPlaylist(Songs song){
        boolean found =findSong(a,song.getSongName());

        playlist.add(song);
    }

    public boolean findSong(ArrayList<Songs> album,String songName){
        boolean check=false;
        for(int i=0; i<album.size(); i++){
            Songs s= album.get(i);
        if(s.getSongName().equals(songName)){
            check=true;
            return check;
        }
        else {
            check=false;
            return check;
        }
        }
        return check;
    }

        public void playYourSong(String CurrentSongName) {
            ListIterator<Songs> i = playlist.listIterator();
            boolean goingForward = true;
            boolean quit=true;
            while (quit) {
                System.out.println("\tEnter 1 to play next song \n" +
                        "\tEnter 2 to play previous song\n" +
                        "\tEnter 0 to replay current song");
                System.out.print("Enter choice : ");
                int c = input.nextInt();
                input.nextLine();
                switch (c) {
                    case 0:
                        System.out.println("again Playing " + CurrentSongName);
                        quit=false;
                        break;
                    case 1:
                        if (!goingForward) {
                            if (i.hasNext()) {
                                i.next();
                            }
                            goingForward=true;
                        }
                            if (i.hasNext()) {
                                System.out.println("Currently playing" + i.next() + "From " + getPlaylistName() + " playlist");
                            }
                            else {
                                System.out.println("We are at the end");
                            }
                        break;
                    case 2:
                        if(goingForward){
                            if(i.hasPrevious()){
                                i.previous();
                            }
                        }
                            if(i.hasPrevious()){
                                System.out.println("Currently playing"+i.previous()+"From " + getPlaylistName()+" playlist");
                            }
                            else {
                                System.out.println("we are at the start");
                            }
                }

            }
        }

    public void playSong(){
        System.out.print("Enter the name of song you want to play : ");
        String Sname=input.nextLine();
        boolean isThere=findSong(a,Sname);
        if (isThere){
            System.out.println("Currently playing : "+Sname);
        }
        else {
            System.out.println("Couldn't play your song"+"Not in the playlist");
        }
        playYourSong(Sname);
    }

}
