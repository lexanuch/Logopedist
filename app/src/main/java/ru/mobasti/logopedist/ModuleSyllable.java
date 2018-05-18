package ru.mobasti.logopedist;

public class ModuleSyllable {
    public String[] TextSyllable;
    public String[] getTextSyllable(String Text) {
        switch(Text) {
            case "Ч":
                TextSyllable = new String[] {"ЧА","ЧО,ЧЁ","ЧУ","ЧЕ","ЧИ",
                        "АЧ","ОЧ","УЧ","ЫЧ","ИЧ","ЯЧ","ЮЧ","ЕЧ"};
                break;
        }

        return TextSyllable;
    }
}
