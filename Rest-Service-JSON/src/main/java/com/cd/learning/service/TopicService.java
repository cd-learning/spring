package com.cd.learning.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cd.learning.model.Topic;

@Service
public class TopicService {

	private List<Topic> list = new ArrayList<>(Arrays.asList(new Topic("spring", "Spring Examples", "Spring is open source framework"),

			new Topic("java ", "Java Example", "java is open source framework"),
			new Topic("python", "python Example", "pythin is open source framework.")));

	public List<Topic> getAllDetails() {
		return list;
	}

	public Topic getSearchId(String id) {

		return list.stream().filter(t -> t.getId().equals(id)).findFirst().get();

	}

	public void addTopic(Topic topic) {
		list.add(topic);

	}

	public void UpdateTopic(Topic topic, String id) {

		for(int i=0;i<list.size();i++) {
			Topic t=list.get(i);
			if(t.getId().equals(id)) {
				 list.set(i, topic);
				 list.remove(i);

			}
		}
	}

	public void deleteTopic(String delId) {
		 list.removeIf(t -> t.getId().equals(delId));


	}
}
