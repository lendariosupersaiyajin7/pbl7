import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Ebook ebook = new Ebook("No alto do Cume", "Falcão", 69.99);
        VideoDigital videoDigital = new VideoDigital("Especial dedicado ao Steve Jobs - Dança dos Famosos", "Fausto Silva", 176.90, 180);

        Ebook ebook1 = new Ebook("Biografia Calvin Harris", "H.P Lovecraft", 43.99);
        VideoDigital videoDigital1 = new VideoDigital("A volta dos que não foram - 2019", "Cineasta Profissional", 120.90, 120);

        System.out.println("<---------- BIBLIOTECA VIRTUAL ---------->");
        System.out.println("Selecione uma opção: ");
        System.out.println("1 - Ver Ebooks");
        System.out.println("2 - Ver Vídeos Digitais");

        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Ebook: " + ebook.getTitulo() + " por " + ebook.getAutor());
                System.out.println("Ebook: " + ebook1.getTitulo() + " por " + ebook1.getAutor());
                break;
            case 2:
                System.out.println("Vídeo: " + videoDigital.getTitulo() + " por " + videoDigital.getAutor());
                System.out.println("Vídeo: " + videoDigital1.getTitulo() + " por " + videoDigital1.getAutor());
                break;
            default:
                System.out.println("Opção inválida.");
        }
    }
}
