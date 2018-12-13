package somrat.info.course;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, String> {
	
	public List<Course> findByTopicId(Integer topicId);

	public Optional<Course> deleteById(Integer id);

	public Optional<Course> findById(Integer id);
}
