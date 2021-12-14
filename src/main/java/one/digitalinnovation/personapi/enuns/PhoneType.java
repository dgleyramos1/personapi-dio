package one.digitalinnovation.personapi.enuns;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PhoneType {

    HOME("home")
   ,MOBILE("Mobile")
   ,COMMERCIAL("Commercial");

    private final String description;
}
