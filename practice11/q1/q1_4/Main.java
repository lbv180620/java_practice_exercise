public class Main {
    public static void main(String[] args) {
        CellPhone cellphone = new CellPhone();

        funcPhone(cellphone);
        funcMailer(cellphone);
        funcComputer(cellphone);
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
