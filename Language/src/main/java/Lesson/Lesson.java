/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lesson;

import com.mycompany.language.MyException;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public abstract class Lesson {
    private static int id =0;
    private String title;
    private String description ;
    Scanner Sc ;
    public Lesson()
    {
        id++;
        Sc = new Scanner(System.in);
    }
    public Lesson(String title , String description)
    {
        this.title=title;
        this.description = description ;
        id++;
        Sc = new Scanner(System.in);
        
    }
    abstract void startLesson();
    abstract void ajouter();
    abstract void update(int index) throws MyException;;
    abstract void delete(int index ) throws MyException;
    public void saisir()
    {
        System.out.println("Veuillez saisir les données de la lesson");
        System.out.println("Nom :");
        this.title=Sc.nextLine();
        
        System.out.println("Description :");
        this.description=Sc.nextLine();
    }
    public int getId()
    {
        return id;
    }
    public String getName()
    {
        return title ;
        
    }
    public void setTitle(String title)
    {
        this.title=title;
    }
    public void setDescription(String description)
    {
        this.description=description;
    }
            
    public String getDescription(){
        return description;
    };
    @Override
    public String toString()
    {
        return "the lesson's name :"+title+"\n la description est : "+description ;
    }
}
