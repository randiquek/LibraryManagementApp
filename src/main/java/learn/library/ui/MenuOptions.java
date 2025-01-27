package learn.library.ui;

public enum MenuOptions {
    ADD_BOOK(1, "Add a Book"),
    UPDATE_BOOK(2, "Update a Book"),
    DELETE_BOOK(3, "Delete a Book"),
    VIEW_BY_CATEGORY(4, "View Books by Category"),
    GET_BY_ISBN(5, "Get Book by ISBN"),
    EXIT(6, "Exit");

    private final int option;
    private final String message;

    MenuOptions(int option, String message) {
        this.option = option;
        this.message = message;
    }
}
