import java.io.*;


public class AccsWriter {
    public static void main(String[] args) {
        String[] a = new String[500];
        String[] login = new String[500];
        String[] password = new String[500];
        try(FileReader reader = new FileReader("newaccs.txt"))
        {
            BufferedReader buffReader = new BufferedReader(reader);
            int i=0;
            while (buffReader.ready()) {
                a[i]=buffReader.readLine();
                i++;
            }
            reader.close();
            buffReader.close();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        for(int i=0;i<a.length;i++){
            login[i] = a[i].substring(0, a[i].indexOf(":"));
            password[i] =(a[i].substring(a[i].indexOf(":")+1)).substring(0,(a[i].substring(a[i].indexOf(":")+1)).indexOf(":"));
        }

            for(int i=0;i< login.length;i++) {
                try(BufferedWriter bw = new BufferedWriter(new FileWriter((i+1)+".json")))
                {
                String text = "{\n  \"Enabled\": true,\n  \"SteamLogin\": \"" + login[i] + "\",\n  \"SteamPassword\": \"" + password[i] + "\"\n}";
                bw.write(text);
                }
                catch(IOException ex){
                    System.out.println(ex.getMessage());
                }
            }
    }
}
