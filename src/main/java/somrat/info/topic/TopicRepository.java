package somrat.info.topic;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic, String> {

	public Optional<Topic> findById(Integer id);

	public Optional<Topic> deleteById(Integer id);

}
