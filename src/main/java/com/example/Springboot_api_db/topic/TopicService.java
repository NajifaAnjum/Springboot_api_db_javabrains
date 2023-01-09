package com.example.Springboot_api_db.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TopicService {

    public TopicRepository topicRepository;        //getting the instances of TopicRepository by creating member variable of that and by autowiring
    //public TopicService(TopicRepository topicRepository) {
     //   this.topicRepository = topicRepository;
    //}
    //method that returns the list of topics
    public List<Topic> getAllTopics(){

        List<Topic> topics = new ArrayList<>();                        //making a topic list
        topicRepository.findAll().forEach(topics::add);                //making all iterable to add to list(method reference)//findall()going to fetch all the topics from db and topicRepository has the CrudRepository methods
        return topics;

    }

    //method that returns(gets/shows) a single topic
    public Topic getTopic(String id){
        return topicRepository.findById(id).orElse(null);
    }

    //POST
    public void addTopic(Topic topic) {
        topicRepository.save(topic);
    }

    //PUT method for update
    public void updateTopic(String id, Topic topic) {
       topicRepository.save(topic);
    }
    //delete
    public void deleteTopic(String id) {
        topicRepository.deleteById(id);
    }
}


