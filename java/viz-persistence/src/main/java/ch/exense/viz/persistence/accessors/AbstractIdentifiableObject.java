package ch.exense.viz.persistence.accessors;

import java.util.HashMap;
import java.util.Map;

import org.bson.types.ObjectId;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * This class is the parent class of all objects that have to be identified
 * uniquely for persistence purposes for instance
 *
 */
public class AbstractIdentifiableObject {

	protected ObjectId _id;
	
	@JsonSerialize(using = MapSerializer.class)
	@JsonDeserialize(using = MapDeserializer.class) 
	protected Map<String, Object> customFields;
	
	public AbstractIdentifiableObject() {
		super();
		_id = new ObjectId();
	}

	/**
	 * @return the unique ID of this object
	 */
	public ObjectId getId() {
		return _id;
	}
	
	/**
	 * @param _id the unique ID of this object
	 */
	public void setId(ObjectId _id) {
		this._id = _id;
	}

	public Map<String, Object> getCustomFields() {
		return customFields;
	}

	public void setCustomFields(Map<String, Object> customFields) {
		this.customFields = customFields;
	}
	
	public Object getCustomField(String key) {
		if(customFields!=null) {
			return customFields.get(key);
		} else {
			return null;
		}
	}

	public synchronized void addCustomField(String key, Object value) {
		if(customFields==null) {
			customFields = new HashMap<>();
		}
		customFields.put(key, value);
	}
}
