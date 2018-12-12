package somrat.info.course;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, String> {
	
	public List<Course> findByTopicId(Integer topicId);

	public Optional<Course> deleteById(Integer id);

	public Optional<Course> findById(Integer id);
}
