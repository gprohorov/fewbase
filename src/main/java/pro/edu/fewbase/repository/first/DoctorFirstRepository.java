package pro.edu.fewbase.repository.first;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import pro.edu.fewbase.model.Doctor;

@Repository
public interface DoctorFirstRepository extends MongoRepository<Doctor, String> {
}
