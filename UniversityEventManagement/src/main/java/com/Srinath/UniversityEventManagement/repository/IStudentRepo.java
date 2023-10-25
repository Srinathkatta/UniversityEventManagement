package com.Srinath.UniversityEventManagement.repository;




import com.Srinath.UniversityEventManagement.model.Student;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IStudentRepo extends CrudRepository<Student,Integer> {
    //  @Query(value = "select * from Student where student_id = :id" , nativeQuery = true)
    Student findByStudentId(Integer sId);
}

