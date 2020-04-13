package pro.edu.fewbase.config;

import lombok.Data;
import org.springframework.boot.autoconfigure.mongo.MongoProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "mongodb")
public class MultipleMongoProperties {

    private final MongoProperties first = new MongoProperties();
    private final MongoProperties second = new MongoProperties();
/*
    private final MongoProperties kl = new MongoProperties();
    private final MongoProperties mg = new MongoProperties();
    private final MongoProperties bs = new MongoProperties();
*/

    public MongoProperties getFirst() {
        return first;
    }
    public MongoProperties getSecond() {return second; }

 /*   public MongoProperties getKl() {
        return kl;
    }

    public MongoProperties getMg() {
        return mg;
    }

    public MongoProperties getBs() {
        return bs;
    }*/
}
