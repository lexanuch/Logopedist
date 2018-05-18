package ru.mobasti.logopedist;

public class ModuleLetters {
    public String TextLetters;
    public String getTextLetters(String Text) {
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
}
