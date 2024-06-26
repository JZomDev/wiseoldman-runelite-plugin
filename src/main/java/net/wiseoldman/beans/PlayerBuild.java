package net.wiseoldman.beans;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum PlayerBuild
{
    @SerializedName("1def")
    ONE_DEF_PURE("1 Def Pure"),

    @SerializedName("lvl3")
    LEVEL_3("Level 3"),

    @SerializedName("f2p")
    F2P("F2P"),

    @SerializedName("f2p_lvl3")
    F2P_LEVEL_3("F2P & Level 3"),

    @SerializedName("hp10")
    HP_PURE("10 HP Pure"),

    @SerializedName("main")
    MAIN("Main"),

    @SerializedName("zerker")
    ZERKER("Zerker");

    private final String build;

    @Override
    public String toString()
    {
        return build;
    }
}
