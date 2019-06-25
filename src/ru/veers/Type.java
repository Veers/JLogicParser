package ru.veers;

public enum Type {
    OR("|"),
    AND("&"),
    EXEC("EXEC");

    private final String text;

    /**
     * @param text
     */
    Type(final String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }

    public static boolean contains(String test) {

        for (Type c : Type.values()) {
            if (c.text.equals(test)) {
                return true;
            }
        }

        return false;
    }
}
