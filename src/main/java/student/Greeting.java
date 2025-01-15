package student;

/**
 * This class is a place holder which you will fully implement based on the
 * javadoc
 * 
 * https://cs5004-khoury-lionelle.github.io/hello_world/student/package-summary.html
 * 
 */
public class Greeting {

    private int localityId;
    private String localityName;
    private String asciiGreeting;
    private String unicodeGreeting;
    private String formatStr;

    // These are used as default values in constructor calls to the main constructor
    private static final String DEFAULT_FORMAT_STR = "%s, %%s!";
    private static final String DEFAULT_GREETING = "Hello";

    /**
     * Greeting that creates a greeting with ascii and unicode characters. It makes
     * no assumptions and everything needs to be provided.
     * 
     * @param localityId      the int value of the locality
     * @param localityName    the string value of the locality
     * @param asciiGreeting   the ascii greeting for the given locality
     * @param unicodeGreeting the unicode greeting for the given locality
     * @param formatStr       the full greeting that includes an ascii/unicode
     *                        greeting and person's name
     */
    public Greeting(int localityId, String localityName, String asciiGreeting, String unicodeGreeting,
            String formatStr) {
        this.localityName = localityName;
        this.localityId = localityId;
        this.asciiGreeting = asciiGreeting;
        this.unicodeGreeting = unicodeGreeting;
        this.formatStr = formatStr;
    }

    /**
     * 
     * Greeting that creates a greeting with ascii and unicode characters assuming
     * the language is already using ascii letters only. It also assumes the format
     * of the greeting to be "{greeting}, {name}!"
     * 
     * @param localityId    the int value of the locality
     * @param localityName  the string value of the locality
     * @param asciiGreeting the ascii greeting for the given locality
     */
    public Greeting(int localityId, String localityName, String asciiGreeting) {
        this(localityId, localityName, asciiGreeting, asciiGreeting, DEFAULT_FORMAT_STR);
    }

    /**
     * Default greeting that creates "Hello, {name}!"
     * 
     * @param localityId   the int value of the locality
     * @param localityName the string value of the locality
     */
    public Greeting(int localityId, String localityName) {
        this(localityId, localityName, DEFAULT_GREETING, DEFAULT_GREETING, DEFAULT_FORMAT_STR);
    }

    /**
     * Getter for the localityId of the Greeting
     */
    public int getLocalityID() {
        return this.localityId;
    }

    /**
     * Getter for the localityName of the Greeting
     */
    public String getLocalityName() {
        return this.localityName;
    }

    /**
     * Getter for the asciiGreeting of the Greeting
     */
    public String getAsciiGreeting() {
        return this.asciiGreeting;
    }

    /**
     * Getter for the unicodeGreeting of the Greeting
     */
    public String getUnicodeGreeting() {
        return this.unicodeGreeting;
    }

    /**
     * Gets the unicode format string. This string will have a %s, so that the name
     * can be inserted into the greeting in the correct location.
     */
    public String getFormatStr() {
        return String.format(this.formatStr, this.unicodeGreeting);
    }

    /**
     * Returns the format string with the greeting inserted into the format. This
     * string will have a %s, so that the name can be inserted into the greeting in
     * the correct location.
     */
    public String getFormatStr(boolean asciiOnly) {
        return String.format(this.formatStr, this.asciiGreeting);
    }

    /**
     * Returns the full greeting details as a string. Primarily for debugging
     * purposes. Example string format:
     * {localityID:1, localityName:"Hawaii", asciiGreeting:"Aloha",
     * unicodeGreeting:"Aloha"}
     */
    public String toString() {
        return String.format("{localityID:%s, localityName:\"%s\", asciiGreeting:\"%s\", unicodeGreeting:\"%s\"}",
                localityId, localityName, asciiGreeting, unicodeGreeting);
    }
}
