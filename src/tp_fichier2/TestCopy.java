package tp_fichier2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class TestCopy {

	public static void main(String[] args) throws FileNotFoundException {
		/*File inputFile = new File("D:\\fichiers\\in.txt");
		File outputFile = new File("D:\\fichiers\\out.txt");
		try (BufferedReader bReader = new BufferedReader(new FileReader(inputFile));
				BufferedWriter bWriter = new BufferedWriter(new FileWriter(outputFile))) {
			String line;

			while ((line = bReader.readLine()) != null) {
				bWriter.write(line);
				bWriter.newLine();
			}
			System.out.println("Copie terminée avec succès.");
			bReader.close();
			bWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}*/
		
		
		/*Scanner scanner =new Scanner(System.in);
		System.out.println("saisir le nom d'utilisateur :");
		String nom=scanner.nextLine();
		System.out.println("saisir le mot de passe :");
		String motDePasse=scanner.nextLine();
		
		
		try {
			
		BufferedReader bf = new BufferedReader(new FileReader("D:\\fichiers\\in.txt"));
		String line;
		while ((line = bf.readLine())!= null){
			String [] tab  = line.split(" ");
			if(tab.length ==2 && tab[0].equals(nom)&&tab[1].equals(motDePasse)) {
				System.out.println("reussi");
				return;
			};
				
		}
		
		System.out.println("erreur");
		}
		catch (IOException e){
			e.printStackTrace();
		}*/
		
		/*try {
			BufferedReader bf =new BufferedReader(new FileReader("D:\\fichiers\\in.txt"));
			String caractere;
			int line=0;
			int nbC=0;
			int nbM=0;
			try {
				while((caractere =bf.readLine()) != null) {
					line++;
					nbC+=caractere.length();
					StringTokenizer tokenizer = new StringTokenizer(caractere);
					nbM+= tokenizer.countTokens();
				}
				bf.close();
				System.out.println("Nombre ligne :"+line);
				System.out.println("Nombre de mots :"+nbM);
				System.out.println("Nombre de caracteres :"+nbC);
				
			}catch (IOException e){
				e.printStackTrace();
		}}
		catch(FileNotFoundException e) {
			e.printStackTrace();

		}*/
		
		 String Destination = "D:\\fichiers\\crypte.txt";
		 String Source = "D:\\fichiers\\in.txt";
		 cryptage(Source,Destination);
		 
		}
	
		public static void cryptage(String Source,String Destination) {
			try {
				FileReader InputFile= new FileReader(Source);
				FileOutputStream OutputFile =new FileOutputStream(Destination);
				
				int c;
				while((c=InputFile.read()) != -1){
					c++;
					OutputFile.write(c);
				}
				InputFile.close();
				OutputFile.close();
				
			}catch (IOException e){
				e.printStackTrace();
			}
		}
	
	
}
