@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ItemRequestDTO {
    private String name;
    private String sku;
    private String description;
    private TrackingType trackingType;
    private ItemStatus status;
    private String baseUom;
    private Double weight;
}