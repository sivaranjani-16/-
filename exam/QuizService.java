package exam;
import java.util.*;

public class QuizService {
    private List<Question> ques;

    public QuizService() {
        ques = new ArrayList<>();
        	
        //Questions
        	ques.add(new Question("Which of the following is not a Java features?", 
                new String[]{"Dynamic","Architecture Neutral","Use of pointers", "Object-oriented"},3));
            ques.add(new Question("Which of these cannot be used for a variable name in Java?", 
                new String[]{"underscore","keyword","variable","array"},2));
            ques.add(new Question("What is the default value of the local variables?", 
                new String[]{"null","0","depends upon the type of variable","not assigned"},3));
            ques.add(new Question("Which of the following is a valid declaration of a char?", 
                new String[]{"char ch = '\\utea';","char ch = '\\u0223';", "char ch = '\\0123';", "char ch = '\\u2';"}, 1));
            ques.add(new Question("What is the return type of the hashCode() method in the Object class?", 
                new String[]{"Object", "int", "long", "void"}, 1));
            ques.add(new Question("Which package contains the Random class?", 
                new String[]{"java.util package", "java.lang package", "java.awt package", "java.io package"}, 1));
            ques.add(new Question("An interface with no fields or methods is known as a ____.", 
                new String[]{"Runnable Interface", "Marker Interface", "Abstract Interface", "CharSequence Interface"}, 2));
            ques.add(new Question("Which of the following is a marker interface?", 
                new String[]{"Runnable", "Remote", "Readable", "Result"}, 2));
            ques.add(new Question("Which keyword is used for accessing the features of a package?", 
                new String[]{"package", "import", "extends", "export"}, 1));
            ques.add(new Question("In which memory a String is stored, when we create a string using new operator?", 
                new String[]{"Stack", "String memory", "Heap memory", "Random storage space"}, 3));
    }

    public List<Question> getQuestions() {
        return ques;
    }

    public boolean checkAnswer(Question question, int selectedAnswer) {
        return question.getCorrectAnswer()==selectedAnswer;
    }
}