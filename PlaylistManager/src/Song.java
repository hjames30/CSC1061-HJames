
public class Song {
	private String artists;
	private String title;
	public Song(String artists, String title) {
		super();
		this.artists = artists;
		this.title = title;
	}
	public String getArtists() {
		return artists;
	}
	public void setArtists(String artists) {
		this.artists = artists;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@Override
	public String toString() {
		return "Artists:" + artists + ", title=" + title + "]";
	}
	
}
