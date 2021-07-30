package site.danielszczesny.backend;

import com.mongodb.ConnectionString;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;

@Configuration
public class MongoConfiguration {

    private final String databaseName = "Zebra_LoL";

    public @Bean
    MongoClient mongoClient() {
        ConnectionString connectionString =
                new ConnectionString("mongodb+srv://Daniel:<Password>@cluster0.2pdsi.mongodb.net/" +
                        databaseName + "?retryWrites=true&w=majority");

        return MongoClients.create(connectionString);
    }

    public @Bean
    MongoTemplate mongoTemplate() {
        return new MongoTemplate(mongoClient(), databaseName);
    }
}
