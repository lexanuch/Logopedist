package ru.mobasti.logopedist;

public class ModuleArticGym {

    private static String[] NameArticGym; // текст описания произнощения упражнения
    private static String[] TextArticGym; // текст описания произнощения упражнения
    private static String[] LinkImageArticGym;
    private static String[] LinkVideoArticGym; // ссылка на видеофайл со упражнениями


    public String[] getNameArticGym(String Text) {

        NameArticGym = new String[] {"Забор","Улыбка","Лопата","Парус","Горка",
                "Иголка","Бублик","Чашка","Грибок"};

        return NameArticGym;
    }

    public static Integer getCount() {
        Integer count;
        count = NameArticGym.length;
        return count;
    }
    public String[] getTextArticGym(String Text) {

                TextArticGym = new String[] {"Нужно улыбнуться так, чтобы верхние и нижние зубы были максимально открыты. Такое выражение лица тоже сохраняется около 5 секунд.",
                        "Улыбнуться, не показывая зубы. Такое положение мышц сохраняется до 5 секунд.",
                        "Расслабленный язык нужно положить на нижнюю губу (не высовывая). Длится 5 секунд.",
                        "Конец языка опирается о верхние зубы и удерживается в этом положении 7-10 секунд.",
                        "Кончик языка упирается в нижние зубы, боковые ложатся на коренные, а средняя часть имитирует горку. Зубами ребенок должен слегка покусывать «горку». Упражнение выполняется с открытым ртом.",
                        "Улыбнуться, приоткрыть рот, обнажить резцы, узкий, прямой язык просунуть между зубами. Удерживать 5 секунд.",
                        "Зубы сомкнуты. Губы округлены и чуть вытянуты вперед. Верхние и нижние резцы видны.",
                        "Открыть широко рот, высунуть язык. Кончик и боковые края языка приподнять: получится чашечка.",
                        "Язык плотно прикладывается (присасывается к небу) и в таком положении держится 5 секунд."};

                return TextArticGym;
    }


    public static String[] getLinkImageArticGym(String Text) {

        LinkImageArticGym = new String[]{"android.resourse://ru.mobasti.logopedist/" + R.raw.test};

        return LinkImageArticGym;

    }

    public static String[] getLinkVideoArticGym(String Text) {

        LinkVideoArticGym = new String[]{"android.resourse://ru.mobasti.logopedist/" + R.raw.test_video};

        return LinkVideoArticGym;

    }

}
