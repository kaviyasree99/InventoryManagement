package com.app;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.model.pulse;
import com.model.rice;
import com.model.Wheat;


public class InventoryFactory {


static ObjectMapper mapper = new ObjectMapper();

public static Object getInstance(String type, String jsonValue) throws JsonMappingException, JsonProcessingException {
if("rice".equalsIgnoreCase(type)) {
return mapper.readValue(jsonValue, rice.class);
}
else if("Pulse".equalsIgnoreCase(type)) {
return mapper.readValue(jsonValue, pulse.class);
}
else if("Wheat".equalsIgnoreCase(type)) {
return mapper.readValue(jsonValue, Wheat.class);
}
return null;

}
}