package com.test.strs;

import java.util.Locale;
import java.util.Scanner;

public class StringTask {

    public static String substring(String source, String search, int count){
        if(source != null && search != null && count > 0){
            String target;
            int targetIndex = 0;
            target = source.toLowerCase();
            search = search.toLowerCase();

            if(!source.contains(search)){
                return null;
            }
            int index;
            while ((index = target.indexOf(search)) != -1 && count > 0){
                source = target.substring(index + search.length());
                --count;
                targetIndex = targetIndex + index;
            }
            return source.substring(targetIndex);

        }else {
            return null;
        }
    }

    public static void main(String[] args) {
        String text = "Java is a programming language originally developed by Sun Microsystems" +
                " and released" +
                " in 1995 as a core component of Sun's Java platform. The language derives " +
                "much of its Syntax from " +
                "C and C++ but has a simpler object model and fewer low-level facilities." +
                "Java applications are typically compiled to bytecode which can run on any " +
                "Java virtual machine (JVM) regardless of computer architecture.\n" +
                "\n" +
                "The original and reference implementation Java compilers, virtual machines," +
                " and class libraries were developed by Sun from 1995. As of May 2007, in " +
                "compliance with the specifications of the Java Community Process, Sun " +
                "made available most of their Java technologies as Virtual Machine " +
                "under the GNU General Public License. Others have also developed alternative " +
                "implementations of these Sun technologies, such as the GNU Compiler for Java " +
                "and GNU Classpath.\n" +
                "\n" +
                "Java's design, industry backing and portability have made Java one of " +
                "the fastest-growing and most widely used programming languages in the modern " +
                "computing industry.Template:Fact";

        Scanner sc = new Scanner(System.in);
        System.out.println("Input search word:");
        String searchWord = sc.next();
        System.out.println("Search word is: " + searchWord);

        if(text.toLowerCase().contains(searchWord.toLowerCase())){
            System.out.println("The text contains the search word.");
            System.out.println("First " + text.toLowerCase().indexOf(searchWord.toLowerCase()));
            System.out.println("Last " + text.toLowerCase().lastIndexOf(searchWord.toLowerCase()));
        }else {
            System.out.println("The text doesn't contain the search word.");
        }

String source = "Жил-был поп,\n" +
        "Толоконный лоб.\n" +
        "Пошёл поп по базару\n" +
        "Посмотреть кой-какого товару.\n" +
        "Навстречу ему Балда\n" +
        "Идёт, сам не зная куда.\n" +
        "“Что, батька, так рано поднялся?\n" +
        "Чего ты взыскался?”\n" +
        "Поп ему в ответ: “Нужен мне работник:\n" +
        "Повар, конюх и плотник.\n" +
        "А где найти мне такого\n" +
        "Служителя не слишком дорогого?”\n" +
        "Балда говорит: “Буду служить тебе славно,\n" +
        "Усердно и очень исправно,\n" +
        "В год за три щелка тебе по лбу.\n" +
        "Есть же мне давай варёную полбу”.\n" +
        "Призадумался поп,\n" +
        "Стал себе почёсывать лоб.\n" +
        "Щёлк щелку ведь розь.\n" +
        "Да понадеялся он на русский авось.\n" +
        "Поп говорит Балде: “Ладно.\n" +
        "Не будет нам обоим накладно.\n" +
        "Поживи-ка на моём подворье,\n" +
        "Окажи своё усердие и проворье”.\n" +
        "Живёт Балда в поповом доме,\n" +
        "Спит себе на соломе,\n" +
        "Ест за четверых,\n" +
        "Работает за семерых;\n" +
        "Досветла всё у него пляшет,\n" +
        "Лошадь запряжёт, полосу вспашет.\n" +
        "Печь затопит, всё заготовит, закупит,\n" +
        "Яичко испечёт да сам и облупит.\n" +
        "Попадья Балдой не нахвалится,\n" +
        "Поповна о Балде лишь и печалится,\n" +
        "Попёнок зовёт его тятей;\n" +
        "Кашу заварит, нянчится с дитятей.\n" +
        "Только поп один Балду не любит,\n" +
        "Никогда его не приголубит,\n" +
        "О расплате думает частенько;\n" +
        "Время идёт, и срок уж близенько.\n" +
        "Поп ни ест, ни пьёт, ночи не спит:\n" +
        "Лоб у него заране трещит.\n" +
        "Вот он попадье признаётся:\n" +
        "“Так и так: что делать остаётся?”\n" +
        "Ум у бабы догадлив,\n" +
        "На всякие хитрости повадлив.\n" +
        "Попадья говорит: “Знаю средство,\n" +
        "Как удалить от нас такое бедство:\n" +
        "Закажи Балде службу, чтоб стало ему невмочь,\n" +
        "А требуй, чтоб он её исполнил точь-в-точь.\n" +
        "Тем ты и лоб от расправы избавишь\n" +
        "И Балду-то без расплаты отправишь”.\n" +
        "Стало на сердце попа веселее.\n" +
        "Начал он глядеть на Балду посмелее.\n" +
        "Вот он кричит: “Поди-ка сюда,\n" +
        "Верный мой работник Балда.\n" +
        "Слушай: платить обязались черти\n" +
        "Мне оброк по самой моей смерти;\n" +
        "Лучшего б не надобно дохода,\n" +
        "Да есть на них недоимки за три года.\n" +
        "Как наешься ты своей полбы,\n" +
        "Собери-ка с чертей оброк мне полный”.\n" +
        "Балда, с попом понапрасну не споря,\n" +
        "Пошёл, сел у берега моря;\n" +
        "Там он стал верёвку крутить\n" +
        "Да конец её в море мочить.\n" +
        "Вот из моря вылез старый Бес:\n" +
        "“Зачем ты, Балда, к нам залез?” -\n" +
        "“Да вот верёвкой хочу море морщить\n" +
        "Да вас, проклятое племя, корчить”.\n" +
        "Беса старого взяла тут унылость.\n" +
        "“Скажи, за что такая немилость?” -\n" +
        "“Как за что? Вы не платите оброка,\n" +
        "Не помните положенного срока;\n" +
        "Вот ужо будет нам потеха,\n" +
        "Вам, собакам, великая помеха”.-\n" +
        "“Балдушка, погоди ты морщить море,\n" +
        "Оброк сполна ты получишь вскоре.\n" +
        "Погоди, вышлю к тебе внука”.\n" +
        "Балда мыслит: “Этого провести не штука!”\n" +
        "Вынырнул подосланный бесёнок,\n" +
        "Замяукал он, как голодный котёнок:\n" +
        "“Здравствуй, Балда мужичок;\n" +
        "Какой тебе надобен оброк?\n" +
        "Об оброке век мы не слыхали,\n" +
        "Не было чертям такой печали.\n" +
        "Ну, так и быть - возьми, да с уговору,\n" +
        "С общего нашего приговору -\n" +
        "Чтобы впредь не было никому горя:\n" +
        "Кто скорее из нас обежит около моря,\n" +
        "Тот и бери себе полный оброк,\n" +
        "Между тем там приготовят мешок”.\n" +
        "Засмеялся Балда лукаво:\n" +
        "“Что ты это выдумал, право?\n" +
        "Где тебе тягаться со мною,\n" +
        "Со мною, с самим Балдою?\n" +
        "Экого послали супостата!\n" +
        "Подожди-ка моего меньшого брата”.\n" +
        "Пошёл Балда в ближний лесок,\n" +
        "Поймал двух зайков, да в мешок.\n" +
        "К морю опять он приходит,\n" +
        "У моря бесёнка находит.\n" +
        "Держит Балда за уши одного зайку:\n" +
        "“Попляши-тка ты под нашу балалайку;\n" +
        "Ты, бесёнок, ещё молоденек,\n" +
        "Со мною тягаться слабенек;\n" +
        "Это было б лишь времени трата.\n" +
        "Обгони-ка сперва моего брата.\n" +
        "Раз, два, три! догоняй-ка”.\n" +
        "Пустились бесёнок и зайка:\n" +
        "Бесёнок по берегу морскому,\n" +
        "А зайка в лесок до дому.\n" +
        "Вот, море кругом обежавши,\n" +
        "Высунув язык, мордку поднявши,\n" +
        "Прибежал бесёнок, задыхаясь,\n" +
        "Весь мокрёшенек, лапкой утираясь,\n" +
        "Мысля: дело с Балдою сладит.\n" +
        "Глядь - а Балда братца гладит,\n" +
        "Приговаривая: “Братец мой любимый,\n" +
        "Устал, бедняжка! отдохни, родимый”.\n" +
        "Бесёнок оторопел,\n" +
        "Хвостик поджал, совсем присмирел,\n" +
        "На братца поглядывает боком.\n" +
        "“Погоди, - говорит, - схожу за оброком”.\n" +
        "Пошёл к деду, говорит: “Беда!\n" +
        "Обогнал меня меньшой Балда!”\n" +
        "Старый Бес стал тут думать думу.\n" +
        "А Балда наделал такого шуму,\n" +
        "Что всё море смутилось\n" +
        "И волнами так и расходилось.\n" +
        "Вылез бесёнок: “Полно, мужичок,\n" +
        "Вышлем тебе весь оброк -\n" +
        "Только слушай. Видишь ты палку эту?\n" +
        "Выбери себе любую мету.\n" +
        "Кто далее палку бросит,\n" +
        "Тот пускай и оброк уносит.\n" +
        "Что ж? боишься вывихнуть ручки?\n" +
        "Чего ты ждешь?” - “Да жду вон этой тучки;\n" +
        "Зашвырну туда твою палку,\n" +
        "Да и начну с вами,чертями,свалку”.\n" +
        "Испугался бесёнок да к деду,\n" +
        "Рассказывать про Балдову победу,\n" +
        "А Балда над морем опять шумит\n" +
        "Да чертям верёвкой грозит.\n" +
        "Вылез опять бесёнок: “Что ты хлопочешь?\n" +
        "Будет тебе оброк, коли захочешь...” -\n" +
        "“Нет, - говорит Балда, -\n" +
        "Теперь моя череда,\n" +
        "Условия сам назначу,\n" +
        "Задам тебе, вражонок, задачу.\n" +
        "Посмотрим, какова у тебя сила.\n" +
        "Видишь, там сивая кобыла?\n" +
        "Кобылу подыми-тка ты\n" +
        "Да неси её полверсты;\n" +
        "Снесёшь кобылу, оброк уж твой;\n" +
        "Не снесёшь кобылы, ан будет он мой”.\n" +
        "Бедненький бес\n" +
        "Под кобылу подлез,\n" +
        "Понатужился,\n" +
        "Понапружился,\n" +
        "Приподнял кобылу, два шага шагнул,\n" +
        "На третьем упал, ножки протянул.\n" +
        "А Балда ему: “Глупый ты бес,\n" +
        "Куда ж ты за нами полез?\n" +
        "И руками-то снести не смог,\n" +
        "А я, смотри, снесу промеж ног”.\n" +
        "Сел Балда на кобылку верхом\n" +
        "Да версту проскакал, так что пыль столбом.\n" +
        "Испугался бесёнок и к деду\n" +
        "Пошёл рассказывать про такую победу.\n" +
        "Черти стали в кружок,\n" +
        "Делать нечего - черти собрали оброк\n" +
        "Да на Балду взвалили мешок.\n" +
        "Идёт Балда, покрякивает,\n" +
        "А поп, завидя Балду, вскакивает,\n" +
        "За попадью прячется,\n" +
        "Со страху корячится.\n" +
        "Балда его тут отыскал,\n" +
        "Отдал оброк, платы требовать стал.\n" +
        "Бедный поп\n" +
        "Подставил лоб:\n" +
        "С первого щелка\n" +
        "Прыгнул поп до потолка;\n" +
        "Со второго щелка\n" +
        "Лишился поп языка;\n" +
        "А с третьего щелка\n" +
        "Вышибло ум у старика.\n" +
        "А Балда приговаривал с укоризной:\n" +
        "“Не гонялся бы ты, поп, за дешевизной”.";

        String result = substring(source, "поп ", 4);
        System.out.println(result);

    }
}
