package org.ttw.factory.factory;

import java.util.List;
import java.util.Scanner;

import org.ttw.factory.model.AIModel;
import org.ttw.factory.model.Claude;
import org.ttw.factory.model.Gemini;
import org.ttw.factory.model.OpenAI;

public class Demo {
	public static void main(String[] args) {
		
		AIModelFactory factory = new AIModelFactory(List.of(new Gemini(),new OpenAI(),new Claude()));
		
		Scanner scanner = new Scanner(System.in);

        System.out.println("===== AI Chat Demo =====");
       
        System.out.print("Choose a model: OpenAI, Gemini, Claude ");

        String choice = scanner.next();
        scanner.nextLine(); 
        
        AIModel model =  factory.getModel(choice);
        
        System.out.println("===== Enter Prompt =====");
        
        String prompt = scanner.next();
        
        model.generateResponse(prompt);
        
        scanner.close();

        
	}

}
