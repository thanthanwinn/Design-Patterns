package org.ttw.factory.factory;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.ttw.factory.model.AIModel;

public class AIModelFactory {
	
	Map<String, AIModel> models = new HashMap<>();
	
	public AIModelFactory(List<AIModel> aiModels) {
		aiModels.stream()
		.forEach(model -> {
			models.put(model.getClass().getSimpleName(), model);
			System.out.println("putting model in factory"+ model.getClass().getSimpleName());
			
		});
	}
	
	public AIModel getModel(String model) {
		AIModel aiModel = models.get(model);
		
		return aiModel;
	}

}
