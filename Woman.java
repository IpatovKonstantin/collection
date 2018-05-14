public class Woman extends BaseVoter {

    public Woman(int age) {
        super(age);
    }

    @Override
    public Gender getGender() {
        return Gender.FEMALE;
    }
}
