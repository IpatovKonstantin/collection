public class Man extends BaseVoter {

    public Man(int age) {
        super(age);
    }

    @Override
    public Gender getGender() {
        return Gender.MALE;
    }
}
