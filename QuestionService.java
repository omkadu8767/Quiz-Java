import java.util.Scanner;

public class QuestionService {

    Question[] questions = new Question[5];
    String[] selection = new String[5];

    public QuestionService() {
        questions[0] = new Question(1, "SpingBoot is framework of ?", "java", "cpp", "python", "C#", "java");
        questions[1] = new Question(2, "Language mostlt used for hardware is ?", "java", "cpp", "python", "C#", "cpp");
        questions[2] = new Question(3, "Language used for AI/ML ?", "java", "cpp", "python", "C#", "python");
        questions[3] = new Question(4, "Language used for web development is ?", "java", "cpp", "python", "js", "js");
        questions[4] = new Question(5, "Which language is owned by Oracle", "java", "cpp", "python", "C#", "java");
    }

    public void playQuiz() {

        int i = 0;
        int j = 0;
        for (Question q : questions) {
            if (j >= 5)
                break;
            System.out.println("Question no. = " + q.getId());
            System.out.println(q.getQuestion());
            System.out.println("A: " + q.getOpt1());
            System.out.println("B: " + q.getOpt2());
            System.out.println("C: " + q.getOpt3());
            System.out.println("D: " + q.getOpt4());

            Scanner sc = new Scanner(System.in);

            selection[i] = sc.nextLine();
            i++;
            j++;
            // sc.close();
        }
        // for (String s : selection) {
        // System.out.print(s + " ");
        // }

    }

    public void getScore() {
        int score = 0;
        for (int i = 0; i < questions.length; i++) {
            Question que = questions[i];
            String ans = que.getAnswer();

            String userAns = selection[i];
            if (ans.equals(userAns))
                score++;
        }
        System.out.println("-------------------------------------");
        System.out.println("Your Score is :  " + score);
        System.out.println("-------------------------------------");

    }
}
