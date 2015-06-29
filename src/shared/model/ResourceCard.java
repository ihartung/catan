package shared.model;

import shared.definitions.ResourceType;

public class ResourceCard {
	
	private ResourceType type;

	public ResourceCard(ResourceType type) {
		this.type = type;
	}

	public ResourceType getType() {
		return type;
	}	

}
