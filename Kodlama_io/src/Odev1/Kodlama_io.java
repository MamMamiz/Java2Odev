package Odev1;



public class Kodlama_io {

	public static void main(String[] args) {
		CoursePage coursePage1 = new CoursePage (1,"Yaz�l�m Geli�tirici Yeti�tirme Kamp� (C# + ANGULAR)","Engin Demiro�", 0	);
		CoursePage coursePage2 = new CoursePage();
		
		coursePage2._id = 2;
		coursePage2._textTitle ="Yaz�l�m Geli�tirici Yeti�tirme Kamp� (JAVA + REACT)";
		coursePage2._teacher = "Engin Demiro�";
		coursePage2._progress = 36.7;
		
	
		CoursePage [] courses = {coursePage1 , coursePage2};
		
		for (CoursePage course	: courses) {
			
			System.out.println("Kursun ID'si : " +course._id);
			System.out.println("Kursun Ba�l��� : " +course._textTitle);
			System.out.println("Kursun E�itmeni : " +course._teacher);
			System.out.println("Kursun �lerlemesi :" +course._progress);
			System.out.println("--------------------------------------");
		}
		
		System.out.println("********************************************");
		
		Student student1 = new Student (10,"Muhammet", "�ak�r", "cmdczvine_200078@hotmail.com", 21);
		Student student2 = new Student ();
		student2._id = 15;
		student2._name = "Kader";
		student2._surName = "Balaban";
		student2._eMail = "kader29072020@hotmail.com";
		student2._age = 22;
		
		
		Student [] students = {student1 , student2};
		
		for (Student student: students) {
			
			System.out.println("��rencinin ID' si : " + student._id);
			System.out.println("��rencinin Ad� : " + student._name);
			System.out.println("��rencinin Soyad� : " + student._surName);
			System.out.println("��rencinin Emaili : " + student._eMail);
			System.out.println("��rencinin Ya�� : " + student._age);
			System.out.println("--------------------------------------");
		}
		
	
		CourseManager courseManager = new CourseManager();
		courseManager.join(coursePage2);
		courseManager.complete(coursePage2);
		
		
		

	}

}
