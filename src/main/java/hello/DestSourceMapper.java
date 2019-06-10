package hello;

import org.mapstruct.Mapper;
//This is used to spring in the mapper (componentModel="spring")
@Mapper(componentModel = "spring")
public interface DestSourceMapper {
	//This is the source
	Job sourceToDestination(Job1 job1);  
	//This is the destination
	Job1 destinationToSource(Job job);
}
