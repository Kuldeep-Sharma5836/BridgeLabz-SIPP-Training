import java.util.*;
abstract class MediaPlayer {
    abstract void addMedia(String name);
    abstract void removeMedia(String name);
    abstract String playNext(String name);
}

class MusicPlayer extends MediaPlayer {

    private class Node {
        String data;
        Node pre, next;

        Node(String data) {
            this.data = data;
            pre = next = null;
        }
    }

    private Node music;

    @Override
    public void addMedia(String song) {
        Node newNode = new Node(song);
        if (music == null) {
            music = newNode;
        } else {
            Node temp = music;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.pre = temp;
        }
        System.out.println("Your song has successfully added into your playlist");
    }

    @Override
    public void removeMedia(String song) {
        if (music == null) {
            System.out.println("Music playlist is empty so no song found to be removed");
            return;
        }

        Node temp = music;
        while (temp != null && !temp.data.equals(song)) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("There is no song with that name in this library");
            return;
        }

        if (temp.pre != null) {
            temp.pre.next = temp.next;
        } else {
            music = temp.next;
        }

        if (temp.next != null) {
            temp.next.pre = temp.pre;
        }
        System.out.println("Your requested song has successfully been removed from your library");
    }

    @Override
    public String playNext(String song) {
        Node temp = music;
        while (temp != null && !temp.data.equals(song)) {
            temp = temp.next;
        }

        if (temp != null && temp.next != null) {
            System.out.println("Playing next song...");
            return temp.next.data;
        }
        System.out.println("Sorry, there is no next song after this song");
        return song;
    }
}

public class Music {
    public static void main(String[] args) {
        MediaPlayer player = new MusicPlayer();
        player.addMedia("Song A");
        player.addMedia("Song B");
        player.addMedia("Song C");
        System.out.println(player.playNext("Song A"));
    }
}
