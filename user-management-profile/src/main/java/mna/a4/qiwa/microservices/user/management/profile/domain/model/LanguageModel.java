package mna.a4.qiwa.microservices.user.management.profile.domain.model;

import java.util.EnumSet;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Gets or Sets LanguageModelNOT_FOUND
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public enum LanguageModel {
    AR_MINUS_SA(String.valueOf("ar-SA")), EN_MINUS_US(String.valueOf("en-US"));

    // caching enum access
    private static final EnumSet<LanguageModel> values = EnumSet.allOf(LanguageModel.class);

    private String value;

    LanguageModel(String value){
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static LanguageModel fromString(String text) {
        for (LanguageModel b : values) {
            if (String.valueOf(b.value).equalsIgnoreCase(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}