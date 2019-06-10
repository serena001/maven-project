package hello;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
//This is used to spring in the mapper (componentModel="spring")
@Mapper(componentModel = "spring")
public interface JobMapper {
	//-- not working @Mappings({
			//same fieldname and type
	      @Mapping(target="title", source="job.title")
	      //different field name
	      @Mapping(target="name1", source="job.name")
	      //different type
	      @Mapping(target="age", source="job.age")
	      	 // - not working  })
	Job1 jobToJob1(Job job);  
	//- not working  @Mappings({
	      @Mapping(target="title", source="job1.title")
	      @Mapping(target="name", source="job1.name1")
	      @Mapping(target="age", source="job1.age")
	  //- not working  })
	Job job1ToJob(Job1 job1);
}
