package Test;

public class Word {
	
	private String english;
	private String koreans;
	
	public Word(String english, String koreans) {
		this.english = english;
		this.koreans = koreans;
	}
	
	public String toString() {
		return  english + " " + koreans;  
	}

	public String getEnglish() {
		return english;
	}

	public void setEnglish(String english) {
		this.english = english;
	}

	public String getKoreans() {
		return koreans;
	}

	public void setKoreans(String koreans) {
		this.koreans = koreans;
	}
	

}
