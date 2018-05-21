package ru.mobasti.logopedist;

public class ModuleLetters {
    private static String TextLetters; // текст описания произнощения звука
    private String LinkVideoSyllable; // ссылка на видеофайл со слогами

    public static String getTextLetters(String Text) {
        switch(Text) {
            case "Ч":
                TextLetters = "Губы округлены и вытянуты вперед, широкий кончик языка касается " +
                        "альвеол (бугорков за верхними зубами), боковые края языка плотно прижаты " +
                        "к верхним коренным зубам, спинка языка приподнята. При произнесении звука " +
                        "[Ч] кончик языка отрывается от альвеол.";
                break;
        }

        return TextLetters;
    }

    public String getLinkVideoSyllable(String Text) {
        switch(Text) {
            case "Ч":
                LinkVideoSyllable = "android.resourse://ru.mobasti.logopedist/" + R.raw.test_video;;
                break;
        }

        return LinkVideoSyllable;
    }
}
