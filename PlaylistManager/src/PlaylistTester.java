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
		MyDoubleLinkedList<Song> Playlist = new MyDoubleLinkedList<>();
		boolean running = true;
		System.out.println("*** Playlist Manager! ***");

		while (running) {
			System.out.println("\n Commands:\n add \n remove \n count " + "\n play \n save \n load "
					+ "\n shuffle \n reverse \n quit \n");
			Scanner input = new Scanner(System.in);
			String command = input.nextLine().toLowerCase();
			switch (command) {
			case "add":
				System.out.print("Enter artists: ");
				String artistName = input.nextLine();
				System.out.print("Enter Title: ");
				String songName = input.nextLine();
				Playlist.add(new Song(artistName, songName));
				break;
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
			case "count":
				System.out.println(Playlist.size());
				break;
			case "play":
				for (Song s : Playlist) {
					System.out.println(s);
				}
				break;
			case "save":
				System.out.print("Enter file: ");
				String fileName = input.nextLine();
				writePlaylist(Playlist, fileName);
				break;
			case "quit":
				running = false;
				break;
			case "shuffle":
				Playlist.shuffleList();
				break;
			case "reverse":
				Playlist.reverseList();
				break;
			case "load":
				System.out.println("Enter file: ");
				fileName = input.nextLine();
				readPlaylist(Playlist, fileName);
			}

		}
	}

	private static void writePlaylist(MyDoubleLinkedList<Song> Playlist, String fileName)
			throws FileAlreadyExistsException, IOException {
		File playListFile = new File(fileName);
		PrintWriter pWriter = new PrintWriter(new FileOutputStream(playListFile, true));
		for (Song s : Playlist) {
			pWriter.print(s + "\n");
		}
		pWriter.flush();
	}

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
