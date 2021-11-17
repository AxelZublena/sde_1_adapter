package com.hz;

public class ReaderAdapter implements ResponseInterface {
    private ConsoleReader reader;

    public ReaderAdapter(ConsoleReader reader){
        this.reader = reader;
    }

    @Override
    public boolean isTrue() {
        String answer = this.reader.readLine();
        String[] acceptableAnswers = {"true", "yes", "oh yeah", "great", "sure", "love to", "of course", "always", "never done otherwise"};

        for (String acceptableAnswer : acceptableAnswers) {
            if (acceptableAnswer.equals(answer)){
                return true;
            }
        }
        return answer.equals("Yep");
    }
}
