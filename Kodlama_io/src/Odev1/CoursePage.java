package Odev1;

//Özellik Nesnesi 
public class CoursePage {
	
	public CoursePage () {
		
	}
	
	
	public CoursePage (int id , String textTitle , String teacher , double progress ) {
		this._id = id;
		this._textTitle = textTitle;
		this._teacher = teacher;
		this._progress = progress;
		
	}
	
	
	int _id;
	String _textTitle;
	String _teacher;
	double _progress;
	
	

}
