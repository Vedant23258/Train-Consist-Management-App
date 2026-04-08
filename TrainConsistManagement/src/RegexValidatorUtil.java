import java.util.regex.Pattern;

public class RegexValidatorUtil {
    private static final Pattern TRAIN_ID_PATTERN = Pattern.compile("^TRN-\\d{4}$");
    private static final Pattern CARGO_CODE_PATTERN = Pattern.compile("^PET-[A-Z]{2}$");

    public static boolean isValidTrainId(String trainId) {
        return trainId != null && TRAIN_ID_PATTERN.matcher(trainId).matches();
    }

    public static boolean isValidCargoCode(String cargoCode) {
        return cargoCode != null && CARGO_CODE_PATTERN.matcher(cargoCode).matches();
    }
}