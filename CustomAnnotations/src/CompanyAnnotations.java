
/**
 * Created by upadhyad on 7/25/2017.
 */

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target(ElementType.CONSTRUCTOR)
@interface Company {
    String name();

    String loacation();

}


