package ch12.sec12;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;

import java.lang.annotation.*;

@Target({ METHOD })
@Retention(RUNTIME)
public @interface PrintAnnotation {

	String value() default "-";

	int number() default 15;
}
