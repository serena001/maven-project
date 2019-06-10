package hello;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
//This is used to spring in the mapper (componentModel="spring")
//All children objects must be defined in the same mapper
//Same field name but different type for list of addresses
@Mapper(componentModel = "spring")
public interface InfoAboutMapper2 {
	//This is for the address and address 2 objects themselves
	
	@Mapping(target="address2", source="infoAboutForm2.address")
	@Mapping(target="addressLst", source="infoAboutForm2.addressLst")
	InfoAbout2 InfoAboutFormToInfoAbout(InfoAboutForm2 infoAboutForm2);  
	
	@Mapping(target="address", source="infoAbout2.address2")
	@Mapping(target="addressLst", source="infoAbout2.addressLst")
	InfoAboutForm2 InfoAboutToInfoAboutForm(InfoAbout2 infoAbout2);
	      
	//This is for the fields inside address and address2
	@Mapping(target="street", source="address.street1")
	@Mapping(target="postalCode", source="address.postalCode1")
	Address2 addressToAddress2(Address address);  
	
	@Mapping(target="street1", source="address2.street")
	@Mapping(target="postalCode1", source="address2.postalCode")
	Address address2ToAddress(Address2 address2);
}
