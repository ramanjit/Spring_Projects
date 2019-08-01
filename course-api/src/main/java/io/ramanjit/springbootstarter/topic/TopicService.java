package io.ramanjit.springbootstarter.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	private List<topics> topics = Arrays.asList(
					new topics("Spring", "abs", "abs description"),
					new topics("Java", "bbc", "bbc description"),
					new topics("Spring", "cbs", "cbs description")
			);
		
	
	//All the items
	public List<topics> getAllTopics(){
		return topics;
	}
	
	
	//REturn item from the list 
	public topics getTopic(String id)
	{
		  return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		//return topics1.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}
}
