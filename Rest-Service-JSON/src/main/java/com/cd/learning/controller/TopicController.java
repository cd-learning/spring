package com.cd.learning.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cd.learning.model.Topic;
import com.cd.learning.service.TopicService;

@RestController
public class TopicController {

	@Autowired
	public TopicService topicService;

	@RequestMapping(value = "/Topic")

	public List<Topic> getAllRecord() {
		return topicService.getAllDetails();
	}

	@RequestMapping(value = "/Topic/{id}")
	public Topic getSingleRecord(@PathVariable("id") String id) {
		return topicService.getSearchId(id);
	}

	@RequestMapping(value = "/TopicSys", method = RequestMethod.POST)
	public void addTopic(@RequestBody Topic topic) {

		topicService.addTopic(topic);
	}

	@RequestMapping(value="/TopicUpdate/{id}", method =RequestMethod.PUT)
	public void updateTopic(@RequestBody Topic topic,@PathVariable("id")String id) {
		topicService.UpdateTopic(topic,id);
	}

	@RequestMapping(value="/TopicDelete/{deletId}", method = RequestMethod.DELETE)
	public void deleteTopic(@PathVariable("deletId")String delId) {

		topicService.deleteTopic(delId);
	}

}
