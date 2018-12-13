package somrat.info.topic;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicRepository extends JpaRepository<Topic, String> {

	public Optional<Topic> findById(Integer id);

	public Optional<Topic> deleteById(Integer id);

}
