import java.io.File;
import java.util.Scanner;

public class LsSimulator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter directory path: ");
        String path = sc.nextLine();

        File dir = new File(path);

        if (!dir.exists() || !dir.isDirectory()) {
            System.out.println("Invalid directory path!");
            return;
        }

        File[] files = dir.listFiles();

        if (files != null) {
            for (File f : files) {
                String type = f.isDirectory() ? "<DIR>" : "<FILE>";

                String rights = "";
                rights += f.canRead() ? "r" : "-";
                rights += f.canWrite() ? "w" : "-";
                rights += f.isHidden() ? "h" : "-";

                System.out.println(f.getPath() + " " + type + " " + rights);
            }
        }
    }
}
