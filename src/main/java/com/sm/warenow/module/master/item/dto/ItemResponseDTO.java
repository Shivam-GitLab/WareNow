@Getter
@Builder
public class ItemResponseDTO {

    private Long id;
    private String name;
    private String sku;
    private String description;
    private TrackingType trackingType;
    private ItemStatus status;
    private String baseUom;
    private Double weight;
}