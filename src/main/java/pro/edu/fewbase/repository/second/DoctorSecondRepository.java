package pro.edu.fewbase.repository.second;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import pro.edu.fewbase.model.Doctor;

@Repository
public interface DoctorSecondRepository extends MongoRepository<Doctor, String> {
}
