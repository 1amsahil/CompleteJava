package Quiz_Project;

import java.util.Scanner;

public class QuestionService {
    
    Question questions[] = new Question[5];

    QuestionService()
    {
        questions[0] = new Question(1, "Which of the following is not OOPS concept in Java?", "Inheritance", "Encapsulation", "Polymorphism", "Compilation", "4"); //Compilation
        questions[1] = new Question(2, "Which of the following is a type of polymorphism in Java?", "Compile time polymorphism", "Execution time polymorphism", "Multiple polymorphism", "Multilevel polymorphism", "1");
        questions[2] = new Question(3, "When does method overloading is determined?", "At run time", " At compile time", "At coding time", "At execution time", "2");
        questions[3] = new Question(4, " Which concept of Java is a way of converting real world objects in terms of class?", "Polymorphism", "Encapsulation", "Abstraction", "Inheritance", "3");
        questions[4] = new Question(5, "Which concept of Java is achieved by combining methods and attribute into a class?", "Encapsulation", "Inheritance", "Polymorphism", "Abstraction", "1");
    }

    int score = 0;
    Scanner sc = new Scanner(System.in);

    public void playQuiz()
    {
        for(int i = 0; i<questions.length; i++)
        {
            System.out.println(questions[i]);

            int num = sc.nextInt();
            String ans = Integer.toString(num);

            if(ans.equals(questions[i].getAnswer()))
            {
                score+=1;
            }
            else
            {
                System.out.println("wrong Answer"+"\ncorrect option : "+questions[i].getAnswer());
            }
            System.out.println("current score : "+score);
        }
        sc.close();
    }
}
