package lu.EnVoyage;

public enum Language {
	EN("en"),
	NL("nl"),
	FR("fr"),
	DE("de");
	private final String code;
	Language(String code) {
		this.code = code;
	}
	public static Language fromCode(String code) {
		for (Language l : values()) {
			if (l.code.equals(code)) {
				return l;
			}
		}
		throw new IllegalArgumentException();
	}
}

