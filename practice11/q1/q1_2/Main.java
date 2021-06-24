public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone();
        Mailer mailer = new Mailer();
        Computer computer = new Computer();

        funcPhone(phone);
        funcMailer(mailer);
        funcComputer(computer);
    }

    public static void funcPhone(IPhone phone) { // ポリモーフィズム
        phone.callPhone();
        phone.recievePhone();
    }

    public static void funcMailer(IMailer mailer) {
        mailer.sendMail();
        mailer.receiveMail();
    }

    public static void funcComputer(IComputer computer) {
        computer.playGame();
        computer.browseWeb();
    }
}
