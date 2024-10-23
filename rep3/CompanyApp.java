import java.io.*;
import java.nio.file.*;

public class CompanyApp {
    public static void main(String[] args) {
        try {
            Company acme = readCompanyData("personal.txt");
            System.out.println(acme);
            System.out.println(acme.getAverageSalary());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static Company readCompanyData(String filename) throws IOException {
        try (BufferedReader reader = Files.newBufferedReader(Path.of(filename))) {
            String companyName = reader.readLine();
            Company company = new Company(companyName);

            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                int salary = Integer.parseInt(parts[2].trim());
                company.employ(parts[0].trim(), parts[1].trim(), salary);
            }

            return company;
        }
    }
}
