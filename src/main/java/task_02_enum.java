public class task_02_enum {
    /**
     * 2. Create ENUM and print.
     */
    enum Notes {DO, RE, MI, FA, SOL, LA, SI}

    public static void main(String[] args) {

        for (Notes note: Notes.values()) {
            System.out.println(note);
        }
    }
}
