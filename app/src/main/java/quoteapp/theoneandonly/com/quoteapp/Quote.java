package quoteapp.theoneandonly.com.quoteapp;

/**
 * Created by bennettbatzli on 7/19/16.
 */
public class Quote {
    public String quote;
    public String person;


    public Quote(String mQuote, String mPerson){
        super();

        quote = mQuote;
        person = mPerson;

    }

    public String getPerson() {
        return person;
    }

    public String getQuote() {
        return quote;
    }
}
