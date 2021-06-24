public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone();
        Mailer mailer = new Mailer();
        GamingPC gaming_pc = new GamingPC();

        funcPhone(phone);
        funcMailer(mailer);
        funcComputer(gaming_pc);
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
