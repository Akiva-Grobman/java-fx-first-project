package com.teamtreehouse.pomodoro.modle;

public class Attempt {

    private String message;
    private int remainingSeconds;
    private AttemptKind kind;

    public Attempt(AttemptKind kind, String message) {
        this.kind = kind;
        this.message = message;
        remainingSeconds = kind.getTotalSeconds();
    }

    public String getMessage() {
        return message;
    }

    public int getRemainingSeconds() {
        return remainingSeconds;
    }

    public AttemptKind getKind() {
        return kind;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void tick() {
        remainingSeconds--;
    }

    public void save() {
        System.out.println("Saving " + this);
    }

    @Override
    public String toString() {
        return "Attempt{" +
                "message='" + message + '\'' +
                ", remainingSeconds=" + remainingSeconds +
                ", kind=" + kind +
                '}';
    }

}
