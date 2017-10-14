package com.github.assenovabay.librarystock.constant;

/**
 * @author Abay Assenov
 *         10/10/2017
 */
public class LibraryConstatnt {

    /**
     * Private constructor for class contains constant
     */
    private LibraryConstatnt() {
    }

    //Format
    public static final String FORMAT_MENU_BODY = "%-10s%-50s%n";
    public static final String FORMAT_CREATOR_COMMAND_BODY = "%-10s%-20s%n";
    public static final String FORMAT_REGISTERED_PUB_BODY = "%-10s%-10s%-21s%-20s%-15s%-15s%n";
    public static final String FORMAT_BOOK_BODY = "%-11s%-16s%-21s%-15s%-15s%-15s%-16s%-41s%n";
    public static final String FORMAT_BOOKLET_BODY = "%-10s%-21s%-20s%-16s%-41s%n";
    public static final String FORMAT_MAGAZINE_BODY = "%-10s%-21s%-20s%-15s%-16s%-41s%n";
    public static final String FORMAT_MENU_HEADER = "%-25s%-10s%-25s%n";
    public static final String FORMAT_REGISTERED_PUB_HEADER = "%-20s%-20s%-20s%n";

    //Number value
    public static final int DEFAULT_COUNT_FOR_PAGE = 0;
    public static final int MAX_COUNT_4 = 4;
    public static final int MAX_COUNT_5 = 5;
    public static final int MAX_COUNT_20 = 20;
    public static final int MAX_COUNT_40 = 40;
    public static final int MAX_COUNT_15 = 15;

    //Input
    public static final String INPUT_ID_PUB_FOR_DELET = "Введите id издания для удаления";
    public static final String INPUT_NAME_PUB = "Введите наименование. Максимальное кол-во символов ";
    public static final String INPUT_NAME_AUTHOR_PUB = "Введите название автора издания. Максимальное кол-во символов ";
    public static final String INPUT_NAME_PUBLISHER_PUB = "Введите название издательства. Максимальное кол-во символов ";
    public static final String INPUT_GENRE_PUB = "Введите жанр издания. Максимальное кол-во символов ";
    public static final String INPUT_SHORT_DISCRIPTION_PUB = "Введите краткое описание. Максимальное кол-во символов ";
    public static final String INPUT_ARTICLES_PUB = "Введите список статей описание. Максимальное кол-во символов ";
    public static final String INPUT_YEAR_PUB = "Введите год издания. Максимальное кол-во символов ";
    public static final String INPUT_COUNT_PAGE_PUB = "Введите кол-во страниц. Максимальное кол-во символов ";
    public static final String INPUT_MONTH_PUB = "Введите месяц издания. Максимальное кол-во символов ";
    public static final String INPUT_ID_PUB_FOR_SHOW = "Введите id издания для просмотра";
    public static final String INPUT_COMMAND = "Введите код команды: ";

    //Menu item
    public static final String ITEM_MENU_REGISTRED_PUB = "Просмотр зарегистрированых изданий в фонде";
    public static final String ITEM_MENU_CREATOR_PUB = "Добавление нового издания в фонд";
    public static final String ITEM_MENU_DISPLAY_PUB = "Просмотр информации выбраного издания";
    public static final String ITEM_MENU_CLEANER_PUB = "Удаление выбраного издания";
    public static final String ITEM_MENU_EXIT_MENU = "Выход\n";

    //Code command
    public static final String RETURN_MENU_CODE = "00";
    public static final String REGISTERED_PUB_CODE = "01";
    public static final String CREATOR_PUB_CODE = "02";
    public static final String DISPLAY_PUB_CODE = "03";
    public static final String CLEANER_PUB_CODE = "04";
    public static final String CREATE_BOOKLET_CODE = "11";
    public static final String CREATE_BOOK_CODE = "13";
    public static final String CREATE_MAGAZINE_CODE = "12";
    public static final String EXIT_MENU_CODE = "05";

    //Common
    public static final String CODE = "Код";
    public static final String ID = "ID";
    public static final String BOOK = "Книга";
    public static final String AUTHOR = "Автор";
    public static final String GENRE = "Жанр";
    public static final String DESCRIPTION = "Описание";
    public static final String MAGAZINE = "Журнал";
    public static final String BOOKLET = "Брошюра";
    public static final String LABEL = "Название";
    public static final String EMPTY = "";
    public static final String TYPE = "Тип";
    public static final String ADDED = "Добавленно...";
    public static final String ADD_PUBLICATION = "Добавление издания в фонд...";
    public static final String ADD_NEW_PUBLICATION = "Добавление нового издания";
    public static final String FOR_RETURN_MENU = "\nДля возврата в меню введите команду: \"00\"  ";
    public static final String DELETED_PUB = "Удаленна запись с идентификатором ";
    public static final String HAVE_NOT_PUB = "Нет записи с идентификатором-> ";
    public static final String INCORRECT_NUMBER = "Некоректное число-> ";
    public static final String RELASE_DATA = "Дата выхода";
    public static final String COUNT_PAGE = "Кол-во стр.";
    public static final String PUBLISHER = "Издательство";
    public static final String ADD_BOOKLET = "Добавить брошюру";
    public static final String ADD_BOOK = "Добавить книгу";
    public static final String ADD_MAGAZINE = "Добавить журнал";
    public static final String MENU = "MENU\n";
    public static final String REGISTERED_PUBLICATION = "RegisteredPublication Publication\n";
    public static final String SEPARATOR = "----------------------------------------------------------------------------------";
    public static final String INCORRECT_COMMAND = "Некоректная команда-> ";
}
