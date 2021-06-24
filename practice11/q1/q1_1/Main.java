public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone();
        Mailer mailer = new Mailer();
        Computer computer = new Computer();

        funcPhone(phone);
        funcMailer(mailer);
        funcComputer(computer);
    }

    public static void funcPhone(Phone phone) {
        phone.callPhone();
        phone.recievePhone();
    }

    public static void funcMailer(Mailer mailer) {
        mailer.sendMail();
        mailer.receiveMail();
    }

    public static void funcComputer(Computer computer) {
        computer.playGame();
        computer.browseWeb();
    }
}
