package hello;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
//This is used to spring in the mapper (componentModel="spring")
@Mapper(componentModel = "spring")
public interface AddressMapper {
	//-- not working @Mappings({
			//same fieldname and type
	      @Mapping(target="street", source="address.street1")
	      //different field name
	      @Mapping(target="postalCode", source="address.postalCode1")
	      	 // - not working  })
	Address2 addressToAddress2(Address address);  
	//- not working  @Mappings({
	      @Mapping(target="street1", source="address2.street")
	      @Mapping(target="postalCode1", source="address2.postalCode")
	  //- not working  })
	Address address2ToAddress(Address2 address2);
}
