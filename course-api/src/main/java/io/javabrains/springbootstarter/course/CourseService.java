//package io.javabrains.springbootstarter.course;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//@Service
//public class CourseService {
//	
//	@Autowired
//	private CourseRepository courseRepo;
//	
//	public List<Course> getAllCourses(String topicId){
//		List<Course> topics = new ArrayList<>();
//		courseRepo.findByTopicId(topicId)
//		.forEach(topics::add);
//		return topics;
//	}
//	
//	public Course getCourse(String id) {
//		return courseRepo.findOne(id);
//	}
//
//	public void addCourse(Course topic) {
//		courseRepo.save(topic);
//		
//	}
//
//	public void updateCourse(Course topic) {
//		courseRepo.save(topic);
//		}
//
//
//	public void deleteCourse(String id) {
//		//topics.removeIf(t -> t.getId().equals(id));
//		courseRepo.delete(id);
//		
//	}
//}
//
