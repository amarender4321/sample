package PracticeFolder;
import java.util.HashSet;
import java.util.LinkedList;


public class PlaylistManager {

	
	   private static final int MAX_SIZE = 3;
	    private LinkedList<String> playlist;
	    private HashSet<String> songSet;

	    public PlaylistManager() {
	        playlist = new LinkedList<>();
	        songSet = new HashSet<>();
	    }

	    public void playSong(String song) {
	        if (songSet.contains(song)) {
	         // Remove the song from its current position
	            playlist.remove(song);
	        } else if (playlist.size() >= MAX_SIZE) {
	            // Remove the oldest song if playlist is full
	            String oldestSong = playlist.removeFirst();
	            songSet.remove(oldestSong);
	        }
	        
	        // Add the new song to the end of the playlist
	        playlist.addLast(song);
	        songSet.add(song);
	    }

	    public void printPlaylist() {
	        System.out.println(playlist);
	    }

	    public static void main(String[] args) {
	        PlaylistManager manager = new PlaylistManager();

	        
	        // Play initial songs
	        manager.playSong("S1");
	        manager.playSong("S2");
	        manager.playSong("S3");
	        manager.printPlaylist(); // Output: [S1, S2, S3]

	        // Play new song S4
	        manager.playSong("S4");
	        manager.printPlaylist(); // Output: [S2, S3, S4]

	        
	        //Play song S2 again 
	        manager.playSong("S2");
	        manager.printPlaylist(); // Output: [S3, S4, S2] 

	        
	        // Play song S1
	        manager.playSong("S1");
	        manager.printPlaylist(); // Output: [S4, S2, S1]
	    }
}


