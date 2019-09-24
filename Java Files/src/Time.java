public class Time {
    private String OpenTime;
    private String CloseTime;
    private String DeliveryTime = "45 Mins";

    public Time() {
    }

    public Time(String openTime, String closeTime, String deliveryTime) {
      //  deliveryTime = "45 mins";
        OpenTime = openTime;
        CloseTime = closeTime;
        DeliveryTime = deliveryTime;
    }
    public Time(String deliveryTime) {
        DeliveryTime = deliveryTime;
    }

    public String getOpenTime() {
        return OpenTime;
    }

    public void setOpenTime(String openTime) {
        OpenTime = openTime;
    }

    public String getCloseTime() {
        return CloseTime;
    }

    public void setCloseTime(String closeTime) {
        CloseTime = closeTime;
    }

    public String getDeliveryTime() {
        return DeliveryTime;
    }

    public void setDeliveryTime(String deliveryTime) {
        DeliveryTime = deliveryTime;
    }
}
