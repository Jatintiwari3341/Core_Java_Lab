package com.task31;

public class MusicPlayer  implements AdavancemediaPlayer{
	String title;
	

	public MusicPlayer(String title) {
		
		super();
if(title.length()<=0) {
			System.err.println("Title can not be empty");
		}
else {
		this.title = title;
	}
	}
	
	@Override
	public String toString() {
		return "MusicPlayer [title=" + title + "]";
	}

	@Override
	public void play() {
		System.out.println("Playing music :"+title);
		
	}

	@Override
	public void stop() {
		System.out.println("Stopping music :"+title);
	}

	@Override
	public void pause() {
		System.out.println("Pausing music :"+title);
		
	}
	
	

}
