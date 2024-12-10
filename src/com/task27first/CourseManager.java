package com.task27first;

public class CourseManager {
	
	public static void processContent(CourseContent content) {
		
		if(content instanceof Video) {
			Video video=(Video)content;
			System.out.println("Processing Video-- "+video.getTitle()+ ",duration--" +video.getDuration()+"min");
		}
			else if(content instanceof Article) {
				Article article=(Article)content;
				System.out.println("Processing Article-- "+article.getTitle()+",author--"+article.getAuthor());
			}
			else if(content instanceof Quiz) {
				Quiz quiz=(Quiz)content;
				System.out.println("Processing Quiz-- "+quiz.getTitle()+",number of questions--"+quiz.getNumberOfQuestions());
			}
			else {
				System.out.println("Unknown content type");
			}
			
		
		}
	public static void processMultipleContents(CourseContent...contents) {
		for(CourseContent content:contents) {
		processContent(content);
		}
	}
		
	}


