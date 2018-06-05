package ru.mobasti.logopedist;

public class ModuleSyllable {
    private static String[] TextSyllable; // текст слогов
    private static String[] LinkSoundSyllable; // ссылка на файл произнощения звука слога


    public String[] getTextSyllable(String Text) {
        switch(Text) {
            case "Ч":
                TextSyllable = new String[] {"ЧА","ЧО,ЧЁ","ЧУ","ЧЕ","ЧИ",
                        "АЧ","ОЧ","УЧ","ЫЧ","ИЧ","ЯЧ","ЮЧ","ЕЧ"};
                break;
        }

        return TextSyllable;
    }


    public static String[] getLinkSoundSyllable(String Text) {
        switch (Text) {
            case "Ч":
                LinkSoundSyllable = new String[]{"android.resourse://ru.mobasti.logopedist/" + R.raw.ch};
                break;
        }

        return LinkSoundSyllable;

    }



}
