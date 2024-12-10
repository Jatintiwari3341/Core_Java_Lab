package com.task31;

public class VideoPlayer implements AdavancemediaPlayer  {
String title;
	

	public VideoPlayer(String title) {
		super();
		if(title.length()<=0) {
			System.err.println("Title can not be empty");
		}
else {
		this.title = title;
	}
	}
	@Override
	public void play() {
		System.out.println("Playing video "+title);
		
	}

	@Override
	public void stop() {
		
		System.out.println("Stopping music "+title);
	}

	@Override
	public void pause() {
		
		System.out.println("Pausing music "+title);		
	}
	

}
