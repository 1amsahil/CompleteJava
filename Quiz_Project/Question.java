package Quiz_Project;

public class Question {

    private int id;
    private String question;
    private String opt1;
    private String opt2;
    private String opt3;
    private String opt4;
    private String answer;

    
    public Question(int id, String question, String opt1, String opt2, String opt3, String opt4, String answer) {
        this.id = id;
        this.question = question;
        this.opt1 = opt1;
        this.opt2 = opt2;
        this.opt3 = opt3;
        this.opt4 = opt4;
        this.answer = answer;
    }

    public String getAnswer() {
        return answer;
    }

    public String toString()
    {
        return ("\nQuestion " +id+": "+question+"\nOptions : "+"1) "+opt1+" \t"+"2) "+opt2+" \t"+"3) "+opt3+" \t"+"4) "+opt4);
    }
  
}
