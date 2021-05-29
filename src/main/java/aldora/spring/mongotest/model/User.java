package aldora.spring.mongotest.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document
@Getter
@Setter
public class User {
    @Id
    private String id;
    private String name;

    @DBRef
    List<Post> posts = new ArrayList<>();
}
