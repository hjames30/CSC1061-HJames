
public class Radio {
	private boolean hasAppleCarPlay;
	private boolean hasAndriodAuto;
	private int volume= 0 ;
	private final int maxVolume = 11;
	
	public Radio(boolean hasAppleCarPlay, boolean hasAndriodAuto, int volume) {
		super();
		this.hasAppleCarPlay = hasAppleCarPlay;
		this.hasAndriodAuto = hasAndriodAuto;
		this.volume = volume;
	}

	public boolean isHasAppleCarPlay() {
		return hasAppleCarPlay;
	}

	public void setHasAppleCarPlay(boolean hasAppleCarPlay) {
		this.hasAppleCarPlay = hasAppleCarPlay;
	}

	public boolean isHasAndriodAuto() {
		return hasAndriodAuto;
	}

	public void setHasAndriodAuto(boolean hasAndriodAuto) {
		this.hasAndriodAuto = hasAndriodAuto;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		if(volume >= maxVolume) {
			System.out.println("Volume can not go past 11");
			this.volume=maxVolume;
		}
		else {
			this.volume = volume;
		}
		
	}

	@Override
	public String toString() {
		return "Radio [hasAppleCarPlay=" + hasAppleCarPlay + ", hasAndriodAuto=" + hasAndriodAuto + ", volume=" + volume
				+ "]";
	}
	
}
