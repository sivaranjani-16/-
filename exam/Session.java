package exam;

public class Session {
    private User user;
    private QuizService quizService;
    private long startTime;
    private long endTime;
    private boolean isActive;

    public Session(User user,QuizService quizService) {
        this.user=user;
        this.quizService=quizService;
        this.startTime=System.currentTimeMillis();
        this.isActive=true;
    }

    public void endSession() {
        this.endTime=System.currentTimeMillis();
        this.isActive=false;
    }

    public boolean isActive() {
        return isActive;
    }

    public User getUser() {
        return user;
    }

    public QuizService getQuizService() {
        return quizService;
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }
}