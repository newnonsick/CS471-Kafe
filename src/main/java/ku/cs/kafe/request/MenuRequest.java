// 6510405440 Thitivath Mongkolgittichot
package ku.cs.kafe.request;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.Data;


@Data
public class MenuRequest {

    @NotBlank
    private String name;


    @NotBlank
    private String categoryName;


    @Positive
    private double price;
}
