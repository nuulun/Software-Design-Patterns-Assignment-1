public class Main {
    public static void main(String[] args) {
        CellPhoneDirector director = new CellPhoneDirector();
        CellPhone iosPhone = director.buildiOSPhone();
        CellPhone androidPhone = director.buildAndroidPhone();



        System.out.println("iOS Phone: " + iosPhone);
        System.out.println("Android Phone: " + androidPhone);
        CellPhone custom = new CellPhone.Builder()
                .setBrand("Xiaomi")
                .setModel("Redmi Note 15")
                .setStorage(128)
                .setRAM(6)
                .build();

        System.out.println(custom);
    }
}
