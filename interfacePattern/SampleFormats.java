package interfacePattern;
/*2018112021 최은지*/
class SampleFormats {
    public static void main(String[] args) {

        BasicFormat basicFormat = new BasicFormat();

        /* Tests */
        System.out.println("Date: " + BasicFormat.formatDate(2011, 4, 24));
        System.out.println("Date: " + BasicFormat.formatDate(2011, 5, 25));


        // dateFormat.format() expects a Date object. Use
        // GregorianCalendar to construct a Calendar object and the
        // getTime() method to convert it to a Date.
        System.out.println("Integer: " + BasicFormat.formatLong(1234567));
        System.out.println("Integer: " + BasicFormat.formatLong(Math.round(67.7)));
        System.out.println("Money: " + BasicFormat.formatMoney(9812345.678));
        System.out.println("Money: " + BasicFormat.formatMoney((9812345)));
        System.out.println("Money: " + BasicFormat.formatMoney((.78)));
        System.out.println("Person: " + BasicFormat.formatPerson("Weinman", "Jerod", "weinman"));
        // We can create and initialize an Object array on the fly, as
        // shown above.
    }
}
