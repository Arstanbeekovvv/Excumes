public class UniqueId {
    private static Long id = 1L;
    public static Long generated(){
        return id++;
    }
}
