class GenericVehicleFactory {
    public static <T extends Vehicle> T createVehicle(Class<T> clazz) {
        try {
            return clazz.getDeclaredConstructor().newInstance();
        } 
        catch (Exception e) {
            throw new RuntimeException("Vehicle creation failed!", e);
        }
    }
}
