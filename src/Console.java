public abstract class Console {
    protected String DeviceType;// attributes
    protected String StoreName;
    protected int TotalSales;

    public Console(String deviceType, String storeName, int totalSales) { // constructor
        this.DeviceType = deviceType;
        this.StoreName = storeName;
        this.TotalSales = totalSales;
    }

    public String getDeviceType() {   // getters

        return DeviceType;
    }

    public String getStoreName() {
        return StoreName;
    }

    public int getTotalSales(){
        return TotalSales;
    }














    }
