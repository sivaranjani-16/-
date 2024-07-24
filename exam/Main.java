package exam;
import java.util.*;

public class Main {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);

        UserService userService = new UserService();
        QuizService quizService = new QuizService();
        
        System.out.print("Enter username: ");
        String username=sc.nextLine();
        System.out.print("Enter password: ");
        String pwd=sc.nextLine();

        User user=userService.login(username, pwd);
        if(user==null){
            System.out.println("Invalid credentials");
            return;
        }
        Session session=new Session(user,quizService);
        TimerService timerService=new TimerService(60000,session::endSession);
        timerService.start();

        for(Question question:quizService.getQuestions()){
            if(!session.isActive()){
                System.out.println("Session timed out");
                break;
            }
            System.out.println(question.getQuestion());
            String[] options = question.getOptions();
            for(int i=0;i<options.length;i++){
                System.out.println((i+1)+". "+options[i]);
            }
            System.out.print("Select an answer: ");
            int answer=sc.nextInt();
            boolean isCorrect=quizService.checkAnswer(question, answer);
            System.out.println(isCorrect?"Correct":"Incorrect");
        }

        session.endSession();
        timerService.stop();
        System.out.println("Session ended");
    }
}