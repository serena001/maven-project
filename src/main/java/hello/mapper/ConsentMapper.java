package hello.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import hello.form.Consent.ConsentToCommun;
import hello.service.dto.Consent;
@Mapper
public interface ConsentMapper {
	@Mappings({	
		@Mapping(source = "consentToCommun.consent",target = "consent"),
	})
    Consent consentToCommunToConsent(ConsentToCommun consentToCommun);
	
	@Mappings({	
		@Mapping(source = "consent.consent",target = "consent"),
	})
	ConsentToCommun consentToConsentToCommun(Consent consent);
}
