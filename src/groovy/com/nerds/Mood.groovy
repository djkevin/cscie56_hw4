package com.nerds

/**
 * Enum to represent the different moods of the user
 */
enum Mood {
    HAPPY("/(´▽`)/"),
    WANNA_HUG("(っ⌒‿⌒)っ"),
    ANGRY("(╯‵Д′)╯"),
    SLEEPY("(–˛ — º)"),
    SMILING("(˘⌣˘)"),
    SURPRISED("(O_O)"),
    UNSURE("¯\\_(ツ)_/¯"),
    WANNA_KISS("(っ'з')っ"),
    DANCE("\\(‾▿‾\\)"),
    AWE("m(_ _)m"),
    EMBARASSED("（*￣∇￣*）"),
    WTF("(õ_ó)")

    Mood(String kaomoji){this.kaomoji=kaomoji} //japanese emoticon

    private final String kaomoji

    public String kaomoji(){return kaomoji}


}
