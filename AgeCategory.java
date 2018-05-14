public enum AgeCategory {
    YOUNG(18, 29),
    AVERAGE(30, 49),
    OLD(50, 64),
    PENSIONER(65, 100);

    private int left;
    private int right;

    AgeCategory(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public static AgeCategory valueOf(int age) {
        for (AgeCategory ageCategory : values()) {
            if ((ageCategory.left <= age) && (age <= ageCategory.right)) {
                return ageCategory;
            }
        }
        throw new IllegalArgumentException();
    }
}
