package hello;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
//This is used to spring in the mapper (componentModel="spring")
//All children objects must be defined in the same mapper
//Same fieldname and same type
@Mapper(componentModel = "spring")
public interface InfoAboutMapper {
	//This is for the address and address 2 objects themselves
	
	@Mapping(target="address2", source="infoAboutForm.address")
	@Mapping(target="jobLst", source="infoAboutForm.jobLst")
	InfoAbout InfoAboutFormToInfoAbout(InfoAboutForm infoAboutForm);  
	
	@Mapping(target="address", source="infoAbout.address2")
	@Mapping(target="jobLst", source="infoAbout.jobLst")
	InfoAboutForm InfoAboutToInfoAboutForm(InfoAbout infoAbout);
	      
	//This is for the fields inside address and address2
	@Mapping(target="street", source="address.street1")
	@Mapping(target="postalCode", source="address.postalCode1")
	Address2 addressToAddress2(Address address);  
	
	@Mapping(target="street1", source="address2.street")
	@Mapping(target="postalCode1", source="address2.postalCode")
	Address address2ToAddress(Address2 address2);
}
