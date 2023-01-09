package com.example.Springboot_api_db.topic;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;
@Repository
public interface TopicRepository extends CrudRepository<Topic, String> {
    //find student by email
    @Query("SELECT s FROM Topic s WHERE s.email = ?1")
    Optional<Topic> findStudentById(String id);
}
