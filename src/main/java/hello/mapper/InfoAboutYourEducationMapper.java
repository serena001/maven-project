package hello.mapper;

import java.time.LocalDate;
import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import hello.form.Consent.ConsentToCommun;
import hello.form.InfoAboutYourEducation.EducationLevelTraining;
import hello.form.InfoAboutYourEducation.Training;
import hello.service.dto.Consent;
import hello.service.dto.Education;
import lombok.Getter;
import lombok.Setter;
@Mapper
public interface InfoAboutYourEducationMapper {
	@Mappings({	
		@Mapping(source = "educationLevelTraining.dateAttained",target = "dateAttained"),
		@Mapping(source = "educationLevelTraining.fieldOfStudy",target = "fieldOfStudy"),
		@Mapping(source = "educationLevelTraining.hasTrainingType",target = "hasTrainingType"),
		@Mapping(source = "educationLevelTraining.highestLvl",target = "highestLvl"),
		@Mapping(source = "educationLevelTraining.trainingLst",target = "training"),
		
	})
    Education EducationToEducation(EducationLevelTraining educationLevelTraining);

	@Mappings({	
		@Mapping(source = "education.dateAttained",target = "dateAttained"),
		@Mapping(source = "education.fieldOfStudy",target = "fieldOfStudy"),
		@Mapping(source = "education.hasTrainingType",target = "hasTrainingType"),
		@Mapping(source = "education.highestLvl",target = "highestLvl"),
		@Mapping(source = "education.training",target = "trainingLst"),
		
	})
	EducationLevelTraining EducationToEducationLevelTraining(Education education);

	@Mappings({	
		@Mapping(source = "training.title",target = "title"),
		@Mapping(source = "training.dateCompleted",target = "dateCompleted"),
		@Mapping(source = "training.certificateRec",target = "certificateRec")
	})
	hello.service.dto.Training TrainingToTraining(Training training);
	
	@Mappings({	
		@Mapping(source = "training.title",target = "title"),
		@Mapping(source = "training.dateCompleted",target = "dateCompleted"),
		@Mapping(source = "training.certificateRec",target = "certificateRec")	
	})
	Training TrainingToTraining(hello.service.dto.Training training);

}

