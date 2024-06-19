package com.bookstore.validator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import java.lang.annotation.*;
import static java.lang.annotation.ElementType.*;
import static java.lang.annotation. RetentionPolicy.RUNTIME;

@Target({TYPE, FIELD}) //Áp dụng cho các loại dữ liệu (class) và các trường (field).
@Retention (RUNTIME) //Cho phép được sử dụng runtime để thực hiện các kiểm tra.
@Constraint(validatedBy= ValidUsernameValidator.class)
public @interface ValidUsername {
    String message() default "Tên đăng nhập không hợp lệ"; //Thông báo khi vi phạm ràng buộc
    Class<?>[] groups () default {}; //Nhóm các ràng buộc liên quan lại với nhau.
    Class<? extends Payload> [] payload() default {}; //Cung cấp thêm chi tiết về lỗi
}
