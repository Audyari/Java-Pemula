public class data {

    private static String[] data = new String[10];

    public static void main(String[] args) {
        // Panggil method-method yang dibutuhkan di sini
        showTodoList();
    }

    /**
     * Menampilkan todo list
     */
    public static void showTodoList() {
        System.out.println("Todo List:");
        for (int i = 0; i < data.length; i++) {
            if (data[i] != null) {
                System.out.println((i + 1) + ". " + data[i]);
            }
        }
    }

    public static void testShowTodoList() {
        addTodoList("Belajar Java");
        addTodoList("Belajar Python");
        addTodoList("Belajar JavaScript");
        showTodoList();
    }

    /**
     * Menambah todo ke list
     */
    public static void addTodoList(String todo) {
        // Implementasi kode untuk menambah todo
    }

    public static void testAddTodoList() {
        addTodoList("Belajar Java");
        showTodoList();
    }

    /**
     * Menghapus todo dari list
     */
    public static boolean removeTodoList(int number) {
        // Implementasi kode untuk menghapus todo
        return false;
    }

    public static void testRemoveTodoList() {
        addTodoList("Belajar Java");
        addTodoList("Belajar Python");
        addTodoList("Belajar JavaScript");
        showTodoList();
        removeTodoList(2);
        showTodoList();
    }

    public static String input(String info) {
        // Implementasi kode untuk mengambil input dari pengguna
        return "";
    }

    /**
     * Menampilkan view todo list
     */
    public static void viewShowTodoList() {
        // Implementasi kode untuk menampilkan view todo list
    }

    public static void testViewShowTodoList() {
        viewShowTodoList();
    }

    /**
     * Menampilkan view menambahkan todo list
     */
    public static void viewAddTodoList() {
        // Implementasi kode untuk menampilkan view menambahkan todo list
    }

    public static void testViewAddTodoList() {
        viewAddTodoList();
    }

    /**
     * Menampilkan view menghapus todo list
     */
    public static void viewRemoveTodoList() {
        // Implementasi kode untuk menampilkan view menghapus todo list
    }

    public static void testViewRemoveTodoList() {
        viewRemoveTodoList();
    }
}