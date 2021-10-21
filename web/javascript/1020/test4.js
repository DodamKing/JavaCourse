class Member {
    constructor (firstName, lastName, age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    get age() {
        return this._age;
    }

    set age(age) {
        this._age = age;
    }

    memberPrint() {
        document.write("이름: " + this.lastName + ", 나이: " + this.age + "<br>");
    }
}