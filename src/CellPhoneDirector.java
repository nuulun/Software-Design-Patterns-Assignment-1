public class CellPhoneDirector {

    public CellPhone buildiOSPhone() {
        return new CellPhone.Builder()
                .setBrand("Apple")
                .setModel("iPhone 16 Pro")
                .setStorage(256)
                .setRAM(8)
                .build();
    }

    public CellPhone buildAndroidPhone() {
        return new CellPhone.Builder()
                .setBrand("Vivo")
                .setModel("Y55")
                .setStorage(512)
                .setRAM(12)
                .build();
    }
}
