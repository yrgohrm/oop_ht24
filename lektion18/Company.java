public record Company(String name, String orgNo, String streetAddress) {
    public Company {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("name must not be null or blank");
        }

        if (orgNo == null || orgNo.isBlank()) {
            throw new IllegalArgumentException("org number must not be null or blank");
        }

        if (streetAddress == null || streetAddress.isBlank()) {
            throw new IllegalArgumentException("street address must not be null or blank");
        }
    }
}
