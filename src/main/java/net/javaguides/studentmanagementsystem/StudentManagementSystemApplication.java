package net.javaguides.studentmanagementsystem;

import net.javaguides.studentmanagementsystem.entity.Student;
import net.javaguides.studentmanagementsystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
		/*Student student1 = new Student("Mehmet","ozturk","mehmet@gamil.com");
		studentRepository.save(student1);

		Student student2 = new Student("ahmet","cet","mehmet@gamil.com");
		studentRepository.save(student2);

		Student student3 = new Student("osman","gun","mehmet@gamil.com");
		studentRepository.save(student3);*/
	}
}
