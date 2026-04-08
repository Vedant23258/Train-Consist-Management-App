import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UseCase11TrainIDCargoValidationTest {

    @Test
    void testRegex_ValidTrainID() {
        assertTrue(RegexValidatorUtil.isValidTrainId("TRN-1234"));
    }

    @Test
    void testRegex_InvalidTrainIDFormat() {
        assertFalse(RegexValidatorUtil.isValidTrainId("TRAIN12"));
        assertFalse(RegexValidatorUtil.isValidTrainId("TRN12A"));
        assertFalse(RegexValidatorUtil.isValidTrainId("1234-TRN"));
    }

    @Test
    void testRegex_TrainIDDigitLengthValidation() {
        assertFalse(RegexValidatorUtil.isValidTrainId("TRN-123"));
        assertFalse(RegexValidatorUtil.isValidTrainId("TRN-12345"));
    }

    @Test
    void testRegex_ValidCargoCode() {
        assertTrue(RegexValidatorUtil.isValidCargoCode("PET-AB"));
    }

    @Test
    void testRegex_InvalidCargoCodeFormat() {
        assertFalse(RegexValidatorUtil.isValidCargoCode("PET-ab"));
        assertFalse(RegexValidatorUtil.isValidCargoCode("PET123"));
        assertFalse(RegexValidatorUtil.isValidCargoCode("AB-PET"));
    }

    @Test
    void testRegex_CargoCodeUppercaseValidation() {
        assertFalse(RegexValidatorUtil.isValidCargoCode("PET-ab"));
    }

    @Test
    void testRegex_EmptyInputHandling() {
        assertFalse(RegexValidatorUtil.isValidTrainId(""));
        assertFalse(RegexValidatorUtil.isValidCargoCode(""));
    }

    @Test
    void testRegex_ExactPatternMatch() {
        assertFalse(RegexValidatorUtil.isValidTrainId("TRN-1234X"));
        assertFalse(RegexValidatorUtil.isValidCargoCode("PET-ABC"));
    }
}