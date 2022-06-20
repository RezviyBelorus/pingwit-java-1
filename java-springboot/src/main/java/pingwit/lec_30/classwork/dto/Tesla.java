package pingwit.lec_30.classwork.dto;

import pingwit.lec_30.classwork.validation.BaseInfo;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public record Tesla(
    Integer id,
    @NotNull(groups = {BaseInfo.class})
    TeslaModel model,
    @Size(min = 2, max = 5, groups = BaseInfo.class)
    String motor,
    @NotBlank(groups = BaseInfo.class)
    String vin,
    @NotNull(message = "Idi kupi novuu rezinu")
    Double wheelRadius
) {
}
