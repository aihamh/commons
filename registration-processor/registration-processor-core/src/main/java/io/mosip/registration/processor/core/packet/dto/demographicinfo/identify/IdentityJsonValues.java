package io.mosip.registration.processor.core.packet.dto.demographicinfo.identify;

import lombok.Data;

@Data
public class IdentityJsonValues {
	private String language;
	private String value;
	private String weight;
	private String matchType;

}
