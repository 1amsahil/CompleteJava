package Quiz_Project;

public class Main {
    public static void main(String[] args) {
    
        QuestionService service = new QuestionService();
        service.playQuiz();

        System.out.println("\n\tTotal Score : "+service.score);
    }
}
