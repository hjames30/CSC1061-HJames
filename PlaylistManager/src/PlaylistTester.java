import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.FileAlreadyExistsException;
import java.util.Scanner;

public class PlaylistTester {

	public static void main(String[] args) throws Exception {
		MyDoubleLinkedList<Song> Playlist = new MyDoubleLinkedList<>(); // playlist creation
		boolean running = true; // boolean for application running
		System.out.println("*** Playlist Manager! ***");

		while (running) {
			// UI with options
			System.out.println("\n Commands:\n add \n remove \n count " + "\n play \n save \n load "
					+ "\n shuffle \n reverse \n quit \n");
			Scanner input = new Scanner(System.in);
			String command = input.nextLine().toLowerCase();
			// UI switch commands
			switch (command) {
			/**
			 * Adds new song to playlist
			 * 
			 * @parm artist name and song title
			 * @return Adds song to playlist
			 */
			case "add":
				System.out.print("Enter artists: ");
				String artistName = input.nextLine();
				System.out.print("Enter Title: ");
				String songName = input.nextLine();
				Playlist.add(new Song(artistName, songName));
				break;
			/**
			 * Removes song from playlist
			 * 
			 * @parm Artist Name and song title
			 * @return Removes that song from playlist if exists
			 */
			case "remove":
				System.out.print("Enter artists: ");
				artistName = input.nextLine();
				System.out.print("Enter Title: ");
				songName = input.nextLine();
				boolean foundSong = false;
				for (Song s : Playlist) {
					if (s.getArtists().equals(artistName) && s.getTitle().equals(songName)) {
						Playlist.remove(s);
						foundSong = true;
						break;
					}
				}
				if (foundSong != true) {
					try {
						throw new Exception("Song was not found in playlist");
					} catch (Exception e) {
						e.getMessage();
					}
				}
				break;
			/**
			 * Counts how many songs are in playlist
			 * 
			 * @parm none
			 * @return size of playlist
			 */
			case "count":
				System.out.println(Playlist.size());
				break;
			/**
			 * "Plays" all songs in playlist
			 * 
			 * @parm none
			 * @returns All Songs in playlist / Artist and Song titles
			 */
			case "play":
				for (Song s : Playlist) {
					System.out.println(s);
				}
				break;
			/**
			 * Saves playlist / all songs(Artist name and Song Title
			 * 
			 * @parm File name that you would like to save playlist to
			 * @return File is created if able with playlist
			 */
			case "save":
				System.out.print("Enter file: ");
				String fileName = input.nextLine();
				writePlaylist(Playlist, fileName);
				break;
			/**
			 * Exits program
			 */
			case "quit":
				running = false;
				break;
			/**
			 * Randomly changes location in linked list of songs
			 * 
			 */
			case "shuffle":
				Playlist.shuffleList();
				break;
			/**
			 * Reverses the location of songs in linked list
			 */
			case "reverse":
				Playlist.reverseList();
				break;
			/**
			 * Imports file into playlist linked list
			 * 
			 * @parm file name that would liked to be imported
			 * @returns returns songs imported into linked list
			 */
			case "load":
				System.out.println("Enter file: ");
				fileName = input.nextLine();
				readPlaylist(Playlist, fileName);
			}

		}
	}

	//FileIO writing function
	
	private static void writePlaylist(MyDoubleLinkedList<Song> Playlist, String fileName)
			throws FileAlreadyExistsException, IOException {
		File playListFile = new File(fileName);
		PrintWriter pWriter = new PrintWriter(new FileOutputStream(playListFile, true));
		for (Song s : Playlist) {
			pWriter.print(s + "\n");
		}
		pWriter.flush();
	}
	//FileIO Reading function
	
	private static void readPlaylist(MyDoubleLinkedList<Song> Playlist, String fileName) throws IOException {

		Scanner reader = new Scanner(fileName);
		try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
			String line;
			while ((line = br.readLine()) != null) {
				String[] tokens = line.split(" - ");
				Song song = new Song(tokens[0], tokens[1]);
				Playlist.add(song);

			}
		}
	}

}
