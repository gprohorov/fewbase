package pro.edu.fewbase.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackages = "pro.edu.fewbase.repository.first",
        mongoTemplateRef = "firstMongoTemplate")
public class FirstMongoConfig { }
