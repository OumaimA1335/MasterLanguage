/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lesson;

import com.mycompany.language.MyException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.stream.Stream;

/**
 *
 * @author ASUS
 */
public class LessonPlan {

    private HashMap<Integer, Lesson> ListeLesson;
    Scanner sc;
    Stream<Lesson> lessonStream;

    public LessonPlan() {
        ListeLesson = new HashMap<Integer, Lesson>();
        sc = new Scanner(System.in);
    }

    public void ajouterLesson() {
        Lesson l;
        int choix;
        String resp = "oui";
        while (resp.equals("oui")) {
            System.out.println("Choissez ce que vous voulez ajoutez \n 1 : une lesson vocabulaire || 2 : une lesson de grammer");
            choix = sc.nextInt();
            if (choix == 1) {
                l = new VocabularyLesson();
                l.saisir();
                ListeLesson.put(l.getId(), l);
            } else {
                l = new GrammerLesson();
                l.saisir();
                ListeLesson.put(l.getId(), l);
            }
            System.out.println("Voulez vous ajoutez une autre lesson");
            resp = sc.next();
        }
    }

    public void remplissageTab(int index) throws MyException {
        if (index > ListeLesson.size()) {
            throw new MyException("ce élément n'existe pas");
        } else {
            ListeLesson.get(index).ajouter();
        }
    }

    public void afficher() {
        this.lessonStream = ListeLesson.values().stream();
        lessonStream.forEach(System.out::println);
    }

    public void supprimer(int index) throws MyException {
        if (index > ListeLesson.size()) {
            throw new MyException("ce élément n'existe pas");
        } else {
            System.out.println("Voulez vous supprimer ce élement :");
            String answer = sc.next();
            if (answer.equals("oui")) {
                ListeLesson.remove(index);
            }
        }
    }

    public void modifier(int index) throws MyException {
        Lesson l;
        if (ListeLesson.size() < index) {
            throw new MyException("ce element n existe pas");
        } else {
            if (ListeLesson.get(index) instanceof VocabularyLesson) {
                l = new VocabularyLesson();
                l.saisir();
                ListeLesson.replace(index, l);
            } else {
                l = new GrammerLesson();
                l.saisir();
                ListeLesson.replace(index, l);
            }

        }

    }

    public void listeVocabLesson() {
        this.lessonStream = ListeLesson.values().stream();
        lessonStream
                .filter(lesson -> lesson instanceof VocabularyLesson)
                .forEach(System.out::println);

    }

    public void ListeGrammaLesson() {
        this.lessonStream = ListeLesson.values().stream();
        lessonStream
                .filter(lesson -> lesson instanceof GrammerLesson)
                .forEach(System.out::println);
    }

}
