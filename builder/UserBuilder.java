package builder;

/* 2018112021 최은지 */
class User {
    private String firstName; // required
    private String lastName; // required
    private int age; // optional
    private String phone; // optional
    private String address;  //optional

    private User(Builder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.address = builder.address;
        //build시 User객체 생성
    }

    public static class Builder {
        private String firstName; // required
        private String lastName; // required
        private int age; // optional
        private String phone; // optional
        private String address;  //optional

        public Builder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
            //필수인 firstName, lastName 은 Builder에
        }

        Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        } //this를 반환

        Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        Builder age(int age) {
            this.age = age;
            return this;
        }

        Builder phone(String phone) {
            this.phone = phone;
            return this;
        }

        Builder address(String address) {
            this.address = address;
            return this;
        }

        public User build() {
            return new User(this); // build
        }

    }
}
