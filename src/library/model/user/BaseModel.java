package library.model.user;

import java.time.LocalDate;
import java.util.UUID;

public class BaseModel {

    {id = UUID.randomUUID();}
    protected UUID id;
    protected LocalDate localDate;
}
