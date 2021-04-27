package Odev1;



public class Kodlama_io {

	public static void main(String[] args) {
		CoursePage coursePage1 = new CoursePage (1,"Yazýlým Geliþtirici Yetiþtirme Kampý (C# + ANGULAR)","Engin Demiroð", 0	);
		CoursePage coursePage2 = new CoursePage();
		
		coursePage2._id = 2;
		coursePage2._textTitle ="Yazýlým Geliþtirici Yetiþtirme Kampý (JAVA + REACT)";
		coursePage2._teacher = "Engin Demiroð";
		coursePage2._progress = 36.7;
		
	
		CoursePage [] courses = {coursePage1 , coursePage2};
		
		for (CoursePage course	: courses) {
			
			System.out.println("Kursun ID'si : " +course._id);
			System.out.println("Kursun Baþlýðý : " +course._textTitle);
			System.out.println("Kursun Eðitmeni : " +course._teacher);
			System.out.println("Kursun Ýlerlemesi :" +course._progress);
			System.out.println("--------------------------------------");
		}
		
		System.out.println("********************************************");
		
		Student student1 = new Student (10,"Muhammet", "Çakýr", "cmdczvine_200078@hotmail.com", 21);
		Student student2 = new Student ();
		student2._id = 15;
		student2._name = "Kader";
		student2._surName = "Balaban";
		student2._eMail = "kader29072020@hotmail.com";
		student2._age = 22;
		
		
		Student [] students = {student1 , student2};
		
		for (Student student: students) {
			
			System.out.println("Öðrencinin ID' si : " + student._id);
			System.out.println("Öðrencinin Adý : " + student._name);
			System.out.println("Öðrencinin Soyadý : " + student._surName);
			System.out.println("Öðrencinin Emaili : " + student._eMail);
			System.out.println("Öðrencinin Yaþý : " + student._age);
			System.out.println("--------------------------------------");
		}
		
	
		CourseManager courseManager = new CourseManager();
		courseManager.join(coursePage2);
		courseManager.complete(coursePage2);
		
		
		

	}

}
