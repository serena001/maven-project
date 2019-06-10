package hello;

import org.mapstruct.factory.Mappers;

public class MapStructTesting {
	 private DestSourceMapper mapper= Mappers.getMapper(DestSourceMapper.class);
	public void copyFiles()
	{
		   Job job = new Job();
	        job.setTitle("hi");
	        
	        Job1 job1 = mapper.destinationToSource(job);
	  System.out.println("testing" + job1.getTitle() + "testin1" + job.getTitle());
	}
}
