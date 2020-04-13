package pro.edu.fewbase.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pro.edu.fewbase.model.Doctor;
import pro.edu.fewbase.repository.first.DoctorFirstRepository;
import pro.edu.fewbase.repository.second.DoctorSecondRepository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class DoctorService {

    @Autowired
    DoctorFirstRepository firstRepository;

    @Autowired
    DoctorSecondRepository secondRepository;


    List<Doctor> doctors = new ArrayList<>(

            Arrays.asList(
                    new Doctor("Bikov", 12),
                    new Doctor("Cupitman", 2)
            )
    );

    List<Doctor> doctors2 = new ArrayList<>(

            Arrays.asList(
                    new Doctor("Kisegach", 112),
                    new Doctor("Watson", 2)
            )
    );

    @PostConstruct
    void  init(){
        firstRepository.saveAll(doctors);
        secondRepository.saveAll(doctors2);

    }



}
