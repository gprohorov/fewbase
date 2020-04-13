package pro.edu.fewbase.repository.third;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import pro.edu.fewbase.model.Doctor;

@Repository
public interface DoctorRepository extends MongoRepository<Doctor, String> {
}
