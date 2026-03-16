package com.muslim.necessary.utils;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public class ArabicFarsiUrduGlyphUtils {
    private static final List<Integer> arabicShats;
    private static final Map<Integer, Glyph> dariGlyphs;
    private static final List<Integer> noChar;

    static {
        ArrayList arrayList = new ArrayList();
        noChar = arrayList;
        arrayList.add(8204);
        ArrayList arrayList2 = new ArrayList();
        arabicShats = arrayList2;
        arrayList2.add(1611);
        arabicShats.add(1612);
        arabicShats.add(1613);
        arabicShats.add(1614);
        arabicShats.add(1615);
        arabicShats.add(1616);
        arabicShats.add(1617);
        arabicShats.add(1618);
        Hashtable hashtable = new Hashtable();
        dariGlyphs = hashtable;
        hashtable.put(1569, new Glyph(1569, 65152, 65163, 65164, 65152, 2));
        dariGlyphs.put(1570, new Glyph(1570, 65153, 65153, 65154, 65154, 2));
        dariGlyphs.put(1571, new Glyph(1571, 65155, 65155, 65156, 65156, 2));
        dariGlyphs.put(1572, new Glyph(1572, 65157, 65157, 65158, 65158, 2));
        dariGlyphs.put(1573, new Glyph(1573, 65159, 65159, 65160, 65160, 2));
        dariGlyphs.put(1574, new Glyph(1574, 65161, 65163, 65164, 65162, 4));
        dariGlyphs.put(1575, new Glyph(1575, 65165, 65165, 65166, 65166, 2));
        dariGlyphs.put(1576, new Glyph(1576, 65167, 65169, 65170, 65168, 4));
        dariGlyphs.put(1577, new Glyph(1577, 65171, 65171, 65172, 65172, 2));
        dariGlyphs.put(1578, new Glyph(1578, 65173, 65175, 65176, 65174, 4));
        dariGlyphs.put(1579, new Glyph(1579, 65177, 65179, 65180, 65178, 4));
        dariGlyphs.put(1580, new Glyph(1580, 65181, 65183, 65184, 65182, 4));
        dariGlyphs.put(1581, new Glyph(1581, 65185, 65187, 65188, 65186, 4));
        dariGlyphs.put(1582, new Glyph(1582, 65189, 65191, 65192, 65190, 4));
        dariGlyphs.put(1583, new Glyph(1583, 65193, 65193, 65194, 65194, 2));
        dariGlyphs.put(1584, new Glyph(1584, 65195, 65195, 65196, 65196, 2));
        dariGlyphs.put(1585, new Glyph(1585, 65197, 65197, 65198, 65198, 2));
        dariGlyphs.put(1586, new Glyph(1586, 65199, 65199, 65200, 65200, 2));
        dariGlyphs.put(1587, new Glyph(1587, 65201, 65203, 65204, 65202, 4));
        dariGlyphs.put(1588, new Glyph(1588, 65205, 65207, 65208, 65206, 4));
        dariGlyphs.put(1589, new Glyph(1589, 65209, 65211, 65212, 65210, 4));
        dariGlyphs.put(1590, new Glyph(1590, 65213, 65215, 65216, 65214, 4));
        dariGlyphs.put(1591, new Glyph(1591, 65217, 65219, 65218, 65220, 4));
        dariGlyphs.put(1592, new Glyph(1592, 65221, 65223, 65222, 65222, 4));
        dariGlyphs.put(1593, new Glyph(1593, 65225, 65227, 65228, 65226, 4));
        dariGlyphs.put(1594, new Glyph(1594, 65229, 65231, 65232, 65230, 4));
        dariGlyphs.put(1600, new Glyph(1600, 1600, 1600, 1600, 1600, 4));
        dariGlyphs.put(1601, new Glyph(1601, 65233, 65235, 65236, 65234, 4));
        dariGlyphs.put(1602, new Glyph(1602, 65237, 65239, 65240, 65238, 4));
        dariGlyphs.put(1603, new Glyph(1603, 65241, 65243, 65244, 65242, 4));
        dariGlyphs.put(1604, new Glyph(1604, 65245, 65247, 65248, 65246, 4));
        dariGlyphs.put(1605, new Glyph(1605, 65249, 65251, 65252, 65250, 4));
        dariGlyphs.put(1606, new Glyph(1606, 65253, 65255, 65256, 65254, 4));
        dariGlyphs.put(1607, new Glyph(1607, 65257, 65259, 65260, 65258, 4));
        dariGlyphs.put(1608, new Glyph(1608, 65261, 65261, 65262, 65262, 2));
        dariGlyphs.put(1609, new Glyph(1609, 65265, 65267, 65268, 65266, 4));
        dariGlyphs.put(1610, new Glyph(1610, 65265, 65267, 65268, 65266, 4));
        dariGlyphs.put(1662, new Glyph(1662, 64342, 64344, 64345, 64343, 4));
        dariGlyphs.put(1670, new Glyph(1670, 64378, 64380, 64381, 64379, 4));
        dariGlyphs.put(1688, new Glyph(1688, 64394, 64395, 64395, 64395, 2));
        dariGlyphs.put(1705, new Glyph(1705, 64398, 64400, 64401, 64399, 3));
        dariGlyphs.put(1711, new Glyph(1711, 64402, 64404, 64405, 64403, 4));
        dariGlyphs.put(1740, new Glyph(1740, 65263, 65267, 65268, 65264, 4));
    }

    public static String reshapeText(String str) {
        if (str != null) {
            StringBuffer stringBuffer = new StringBuffer();
            for (String str2 : str.split("\n")) {
                stringBuffer.append(reshape(str2));
                stringBuffer.append("\n");
            }
            return stringBuffer.toString();
        }
        return null;
    }

    private static Object reshape(String str) {
        String[] split = str != null ? str.split("\\s") : new String[0];
        StringBuffer stringBuffer = new StringBuffer("");
        for (String str2 : split) {
            stringBuffer.append(getGlyphString(str2));
            stringBuffer.append(" ");
        }
        return stringBuffer.toString();
    }

    private static String getGlyphString(String str) {
        char[] charArray = str.toCharArray();
        ArrayList arrayList = new ArrayList();
        for (char c : charArray) {
            Glyph glyph = dariGlyphs.get(Integer.valueOf(c));
            if (glyph == null) {
                arrayList.add(new Glyph(c));
            } else {
                arrayList.add(glyph.m4clone());
            }
        }
        reshapeChars(0, arrayList);
        char[] cArr = new char[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            cArr[i] = (char) ((Glyph) arrayList.get(i)).selectedGlyph;
        }
        return new String(cArr);
    }

    private static void reshapeChars(int i, List<Glyph> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        if (i == 0) {
            if (noChar.contains(Integer.valueOf(list.get(i).charCode))) {
                list.remove(i);
                reshapeChars(i, list);
                return;
            }
            if (list.get(i).isDari) {
                list.get(i).selectedGlyph = list.get(i).mainChar;
            }
            reshapeChars(i + 1, list);
        } else if (i < list.size()) {
            int i2 = i - 1;
            Glyph glyph = list.get(i2);
            for (int i3 = i2; i3 >= 0 && arabicShats.contains(Integer.valueOf(glyph.charCode)); i3--) {
                glyph = list.get(i3);
            }
            Glyph glyph2 = list.get(i);
            for (int i4 = i; i4 < list.size() && arabicShats.contains(Integer.valueOf(glyph2.charCode)); i4++) {
                glyph2 = list.get(i4);
            }
            int i5 = i + 1;
            Glyph glyph3 = i5 < list.size() ? list.get(i5) : null;
            for (int i6 = i5; glyph3 != null && i6 < list.size() && arabicShats.contains(Integer.valueOf(glyph3.charCode)); i6++) {
                glyph3 = list.get(i6);
            }
            if (noChar.contains(Integer.valueOf(glyph2.charCode))) {
                list.remove(i);
                reshapeChars(i, list);
            } else if (glyph2.isAlf() && glyph.isLam()) {
                list.set(i2, glyph.getLamAlfClone(glyph2.charCode));
                list.remove(glyph2);
                reshapeChars(i, list);
            } else if (glyph3 != null && glyph.isLam() && glyph.isStarting() && glyph2.isLam() && glyph3.isHe()) {
                list.set(i2, new Glyph(65010));
                list.remove(glyph3);
                list.remove(glyph2);
                reshapeChars(i, list);
            } else if (!glyph2.isDari) {
                reshapeChars(i5, list);
            } else if (!glyph.isDari) {
                glyph2.selectedGlyph = glyph2.mainChar;
                reshapeChars(i5, list);
            } else {
                glyph.selectNextGlyph();
                glyph2.selectedGlyph = glyph.isTwoShaped() ? glyph2.mainChar : glyph2.endChar;
                reshapeChars(i5, list);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class Glyph implements Cloneable {
        public static int ALF = 1575;
        public static int ALF_LOWER_HAMAZA = 1573;
        public static int ALF_UPPER_HAMAZA = 1571;
        public static int ALF_UPPER_MDD = 1570;
        private static final int HE = 1607;
        public static int LAM = 1604;
        int charCode;
        int endChar;
        boolean isDari;
        int mainChar;
        int middleChar;
        int nrShapes;
        int selectedGlyph;
        int startChar;

        public Glyph(int i) {
            this.isDari = false;
            this.charCode = i;
            this.selectedGlyph = i;
            this.isDari = false;
        }

        public boolean isHe() {
            return this.charCode == HE;
        }

        public boolean isStarting() {
            int i = this.selectedGlyph;
            return i == this.startChar || i == this.mainChar;
        }

        public boolean isTwoShaped() {
            return this.nrShapes == 2;
        }

        public Glyph(int i, int i2, int i3, int i4, int i5, int i6) {
            this.isDari = false;
            this.charCode = i;
            this.mainChar = i2;
            this.startChar = i3;
            this.middleChar = i4;
            this.endChar = i5;
            this.nrShapes = i6;
            this.isDari = true;
        }

        public void selectNextGlyph() {
            int i = this.selectedGlyph;
            if (i == 0) {
                this.selectedGlyph = this.mainChar;
            } else if (i == this.mainChar) {
                this.selectedGlyph = this.startChar;
            } else if (i == this.endChar) {
                this.selectedGlyph = this.middleChar;
            }
        }

        public boolean isLam() {
            return this.charCode == LAM;
        }

        public boolean isAlf() {
            int i = this.charCode;
            return i == ALF || i == ALF_LOWER_HAMAZA || i == ALF_UPPER_HAMAZA || i == ALF_UPPER_MDD;
        }

        public String toString() {
            return "" + ((char) this.selectedGlyph);
        }

        public Glyph getLamAlfClone(int i) {
            boolean isStarting = isStarting();
            if (i == ALF_UPPER_MDD) {
                return new Glyph(isStarting ? 65269 : 65270);
            } else if (i == ALF_LOWER_HAMAZA) {
                return new Glyph(isStarting ? 65273 : 65274);
            } else if (i == ALF_UPPER_HAMAZA) {
                return new Glyph(isStarting ? 65271 : 65272);
            } else if (i == ALF) {
                return new Glyph(isStarting ? 65275 : 65276);
            } else {
                return this;
            }
        }

        /* renamed from: clone */
        public Glyph m4clone() {
            return new Glyph(this.charCode, this.mainChar, this.startChar, this.middleChar, this.endChar, this.nrShapes);
        }
    }

    public static String formatToDisplay(String str) {
        return Constants.isArabicFontSupported ? str : reshapeText(str);
    }

    public static String formatToDisplayArabic(String str) {
        return reshapeText(str);
    }
}
