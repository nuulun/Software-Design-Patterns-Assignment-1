public class CellPhone {
    private final String brand;
    private final String model;
    private final int storage;   // GB
    private final int ram;       // GB

    private CellPhone(Builder builder) {
        this.brand = builder.brand;
        this.model = builder.model;
        this.storage = builder.storage;
        this.ram = builder.ram;
    }



    public static class Builder {
        private String brand;
        private String model;
        private int storage;
        private int ram;

        public Builder setBrand(String brand) {
            this.brand = brand;
            return this;
        }



        public Builder setModel(String model) {
            this.model = model;
            return this;
        }

        public Builder setStorage(int storage) {
            this.storage = storage;
            return this;
        }


        public Builder setRAM(int ram) {
            this.ram = ram;
            return this;
        }

        public CellPhone build() {
            return new CellPhone(this);
        }
    }

        public String toString() {
        return brand + ' ' +model+ ' '+ storage + ' ' + ram;
        }

}

