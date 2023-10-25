package com.Srinath.UniversityEventManagement.repository;




import com.Srinath.UniversityEventManagement.model.Event;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface IEventRepo extends CrudRepository<Event,Integer> {

    List<Event> findAllByEventDate(LocalDate eventDate);
}

