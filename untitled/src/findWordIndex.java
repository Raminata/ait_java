
public class findWordIndex {
    public static void main(String[] args) {
        String[] company = {"John", "Bob", "Max", "Anna", "Fred", "Sam"};
        String target = "Anna";
        int result = findIndexOfWord(company, target);
        System.out.println(result);
        }
    public static int findIndexOfWord(String[] words, String target) {
        // ваш код - нужно чтобы возвращал индекс слова, которое мы ищем
for(int i = 0;  i < words.length; i++){
    if(target.equals(words[i])){
        return i;
    }
}
        return -1;
    }
}